package com.honor.sqlbuilder.orm;

import com.honor.sqlbuilder.SelectCreator;

/**
 * Exception thrown when more than one record is returned in response to a query
 * expected to produce only one result
 *
 * @author Alex Rykov
 *
 */
public class TooManyRowsException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    TooManyRowsException(int count, SelectCreator creator) {
        super("Expected single result, found " + count + " rows for this query: " + creator);
    }

}
