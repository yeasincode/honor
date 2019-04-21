package com.honor.jdbc;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseManager {
    private JdbcTemplate jdbcTemplate;


    public <T> List<T> getModelWhere(String name, String value, Class<T> clazz)
    {
        return (List<T>) jdbcTemplate.query("select * from user where "+name+"='"+value+"'",new ColumnMapRowMapper());
    }
}
