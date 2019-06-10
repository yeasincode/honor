package com.honor.module;

/**
 * 应用程序模块
 */
public abstract class AppModule {

    /**
     * 模块配置
     * @return
     */
    public abstract ModuleConfig config();

    /**
     * 加载
     */
    public abstract void load();

    /**
     * 运行
     */
    public abstract void run();

    /**
     * 销毁
     */
    public abstract void destroy();

}
