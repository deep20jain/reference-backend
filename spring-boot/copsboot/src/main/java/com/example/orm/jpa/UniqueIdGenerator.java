package com.example.orm.jpa;

/**
 * Created by deep20jain on 30-09-2018.
 */
public interface UniqueIdGenerator<T> {
    T getNextUniqueId();
}
