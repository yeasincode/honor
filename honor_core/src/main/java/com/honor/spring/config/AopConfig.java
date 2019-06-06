package com.honor.spring.config;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopConfig {

    @Pointcut("execution(* com.honor.*.business.*.*(..))")
    public void executeService() {
        System.out.println("-----------executeService----------------");
    }

    @Around("executeService()")
    public void aroundExecuteService() {
        System.out.println("-----------aroundExecuteService----------------");
    }

    @Pointcut("execution(* com.honor.*.daoImpl.*.*(..))")
    public void executeDao() {
        System.out.println("-----------executeDao----------------");
    }

    @Around("executeService()")
    public void aroundExecuteDao() {
        System.out.println("-----------aroundExecuteDao----------------");
    }
}
