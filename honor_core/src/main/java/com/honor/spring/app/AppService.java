package com.honor.spring.app;

import com.honor.spring.ioc.AppContainer;

public abstract class AppService {


    public AppService(){
    }

    /**
     * 获得容器
     * @return
     */
    public AppContainer container()
    {
        return AppContainer.container();
    }
}
