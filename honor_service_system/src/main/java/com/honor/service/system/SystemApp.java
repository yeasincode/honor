package com.honor.service.system;

import com.honor.spring.config.AopConfig;
import com.honor.spring.ioc.AppContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;


/**
 * <pre>
 *
 *  Honor Technology
 *  File: SystemApp
 *
 *  Honor, Inc.
 *  Copyright (C): 2019
 *
 *  Description:
 *  System模块启动
 *
 *  Notes:
 * 	$Id: SystemApp 72642 2009-01-01 20:01:57Z Honor\Administrator $
 *
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  2019年04月17日		Administrator		Initial.
 *
 * </pre>
 */
@SpringBootApplication(scanBasePackages = "com.honor")
@PropertySource({"classpath:database.properties"})
@ImportResource({"classpath:spring-dubbo-provider.xml"})
@Import(AopConfig.class)
public class SystemApp {

    public static void main(String[] args) {
       ApplicationContext applicationContext= SpringApplication.run(SystemApp.class, args);
       AppContainer container=AppContainer.container();
       container.setApplicationContext(applicationContext);

        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 *$Log: av-env.bat,v $
 */