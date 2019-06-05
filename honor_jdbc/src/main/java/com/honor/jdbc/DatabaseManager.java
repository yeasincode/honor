package com.honor.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


/**
 * <pre>
 *
 *  honor Technology
 *  File: DatabaseManager
 *
 *  honor, Inc.
 *  Copyright (C): 2019
 *
 *  Description:
 *
 *
 *  Notes:
 * 	$Id: DatabaseManager 72642 2009-01-01 20:01:57Z honor\Administrator $
 *
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  2019年04月26日		Administrator		Initial.
 *
 * </pre>
 */
@Component
public class DatabaseManager {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public <T> T getModel(int id, Class<T> clazz) {
        String table = clazz.getSimpleName();
        String sql = String.format("select * from %s where id=%d ", table, id);
        return jdbcTemplate.queryForObject(sql, clazz);
    }
}

/*
 *$Log: av-env.bat,v $
 */
