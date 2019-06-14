package com.honor.sqlbuilder;

import java.io.Serializable;

import javax.sql.DataSource;

/**
 * Dialect for PostgreSQL.
 *
 * @author John Krasnay <john@krasnay.ca>
 */
public class PostgresqlDialect implements Dialect, Serializable {

    private static final long serialVersionUID = 1;

    public String createCountSelect(String sql) {
        return "select count(*) from (" + sql + ") a";
    }

    public String createPageSelect(String sql, int limit, int offset) {
        return String.format("%s limit %d offset %d", sql, limit, offset);
    }

    @Override
    public Supplier<Integer> getSequence(DataSource dataSource, String sequenceName) {
        return new PostgresqlSequence(dataSource, sequenceName);
    }
}
