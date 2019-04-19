package com.honor.service.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


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
@SpringBootApplication
@ImportResource({"classpath:spring-dubbo-provider.xml"})
public class SystemApp {

    public static void main(String[] args) {
        SpringApplication.run(SystemApp.class, args);

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