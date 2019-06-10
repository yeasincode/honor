package com.honor.module;

import java.util.ArrayList;
import java.util.List;

/**
 * 配置设置
 */
public class ConfigurationSetting {

    private List<ConfigurationSource> sources;

    public ConfigurationSetting() {
        sources = new ArrayList<>();
    }

    /**
     * 添加配置源
     *
     * @param source
     */
    public void addSource(ConfigurationSource[]... source) {
        sources.addAll(sources);
    }

}
