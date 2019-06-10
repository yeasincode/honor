package com.honor.annotation;

/**
 * 模块依赖
 */
public @interface DependenOn{
    String value() default "";
}
