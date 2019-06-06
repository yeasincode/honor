package com.honor.spring.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopConfig {

    @Pointcut("execution(* com.honor.*.business.*.*(..))")
    public void executeService(){}


}
