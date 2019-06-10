package com.honor.spring.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopConfig {

    @Pointcut("execution(public * com.honor..business.*.*(..)))")
    public void executeService() {
        System.out.println("-----------executeService----------------");
    }

    @Around("executeService()")
    public Object aroundExecuteService(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("-----------aroundExecuteService----------------");
        try {
            Object proceed = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    @Pointcut("execution(* com.honor.*.daoImpl.*.*(..))")
    public void executeDao() {
        System.out.println("-----------executeDao----------------");
    }

    @Around("executeDao()")
    public void aroundExecuteDao() {
        System.out.println("-----------aroundExecuteDao----------------");
    }
}
