package com.honor.sqlbuilder;

/**
 * Interface used by suppliers of primary keys to DAOs.
 *
 * @author <a href="mailto:john@krasnay.ca">John Krasnay</a>
 */
public interface Supplier<T> {

    public T get();

}
