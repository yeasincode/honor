package com.honor.web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * <pre>
 *
 *  Honor Technology
 *  File: WebApp
 *
 *  Honor, Inc.
 *  Copyright (C): 2019
 *
 *  Description:
 *  Web
 *
 *  Notes:
 * 	$Id: WebApp 72642 2009-01-01 20:01:57Z Honor\Administrator $
 *
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  2019年04月19日		Administrator		Initial.
 *
 * </pre>
 */
@SpringBootApplication
@ImportResource("classpath:spring-dubbo-consumer.xml")
public class WebApp {

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class,args);
    }
}

/*
 *$Log: av-env.bat,v $
 */