package com.honor.module;

import java.util.Map;

/**
 * 配置项来源
 */
public interface ConfigurationSource {
   Map<String,Object> getSource();
}
