package com.honor.module;

import java.util.concurrent.ConcurrentHashMap;

public class Configration<T extends ConfigrationItem> {

    private ConcurrentHashMap<String,T>  setting;

    public void add(String key,T item)
    {

    }

    public T get(String key)
    {
        return null;
    }
}
