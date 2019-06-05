package com.honor.jdbc;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.xml.ws.FaultAction;


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
public class DatabaseManager {

    @AutoWired
    JdbcTemplate jdbcTemplate;

    public <T> T getModel(int id,Class<T> clazz)
    {
        String table=clazz.getName();
       String sql=String.format("select * from where %s id=%d ",table,id);
       jdbcTemplate.queryForObject(sql,clazz);
    }
}

/*
 *$Log: av-env.bat,v $
 */