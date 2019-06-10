package com.honor.spring.ioc;

import com.honor.exception.AppException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 应用程序容器
 */
public class AppContainer {

    private AppContainer() {
    }

    private ApplicationContext applicationContext;


    /**
     * 设置spring上下文
     * @param applicationContext
     */
    public void setApplicationContext (ApplicationContext applicationContext)
    {
        this.applicationContext=applicationContext;
    }

    /**
     * 获得容器实例
     * @return
     */
    public static AppContainer container(){
        AppContainer container=AppContainerHolder.getInstance();
        return container;
    }

    /**
     * 加载class
     * @param className 类名
     * @return
     * @throws AppException
     */
    public Class<?> loadClass(String className) throws AppException {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

            if (classLoader == null) {
                classLoader = AppContainer.class.getClassLoader();
            }

            Class<?> classz = classLoader.loadClass(className);
            return classz;
        } catch (ClassNotFoundException e) {
            throw new AppException(className + " class not found", e);
        }
    }


    /**
     * 获得相应的Bean
     * @param clazz 类名
     * @param <T> 类型T实例
     * @return
     */
    public <T> T getBean(Class<T> clazz) {
        String simpleClassName = clazz.getSimpleName();
        simpleClassName = simpleClassName.substring(0, 1).toLowerCase() + simpleClassName.substring(1);
        return getBean(clazz, simpleClassName);
    }

    /**
     * 获得相应的Bean
     * @param beanName Bean名称
     * @return
     */
    public Object getBean(String beanName) {
        return this.applicationContext.getBean(beanName);
    }

    /**
     * 获得相应的Bean
     * @param clazz 类名
     * @param beanName Bean名称
     * @param <T> 类型T实例
     * @return
     */
    public synchronized <T> T getBean(Class<T> clazz, String beanName) {
        return clazz.cast(this.applicationContext.getBean(beanName));
    }

    /**
     * 创建类实例
     * @param clazz 类名
     * @param <T> 类型T实例
     * @return
     * @throws AppException
     */
    public <T> T newInstance(Class<T> clazz) throws AppException {
        try {
            Constructor<T> constructor = clazz.getConstructor();
            return constructor.newInstance();
        } catch (NoSuchMethodException e) {
            throw new AppException("No such constructor of null for class:" + clazz, e);
        } catch (InstantiationException e) {
            throw new AppException("Cannot instantiate class : " + clazz, e);
        } catch (IllegalAccessException e) {
            throw new AppException("Cannot access class : " + clazz, e);
        } catch (InvocationTargetException e) {
            throw new AppException("Cannot access class : " + clazz, e);
        }
    }

    /**
     * 根据类名创建实例
     * @param className 类名
     * @return
     * @throws AppException
     */
    public Object newInstance(String className) throws AppException {
        return newInstance(loadClass(className));
    }

    /**
     * 注册bean到容器
     * @param beanName
     * @return
     */
    public String registerBean(final String beanName)
    {
        if (!this.applicationContext.containsBeanDefinition(beanName))
        {
            BeanDefinitionRegistry registerFactory = (BeanDefinitionRegistry) ((ConfigurableApplicationContext) this.applicationContext).getBeanFactory();
            BeanDefinition beanDefinition = registerFactory.getBeanDefinition(beanName);

            // Create a new GenericBeanDefinition as deep copy of the given bean definition to avoid dead lock.
            GenericBeanDefinition newBeanDefinition = new GenericBeanDefinition(beanDefinition);
            registerFactory.registerBeanDefinition(beanName, newBeanDefinition);
        }

        return beanName;
    }

    /**
     * 静态内部类，用于创建类型实例
     */
    static class AppContainerHolder {

        private static AppContainer appContainer = new AppContainer();

        private AppContainerHolder() {
        }

        public static AppContainer getInstance() {
            return AppContainerHolder.appContainer;
        }
    }

}
