package com.honor.web;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

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
@PropertySource("classpath:redis.properties")
@EnableScheduling
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class,args);
    }
}

/*
 *$Log: av-env.bat,v $
 */