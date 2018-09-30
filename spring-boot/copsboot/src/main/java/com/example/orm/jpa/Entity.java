package com.example.orm.jpa;

/**
 * Created by deep20jain on 29-09-2018.
 */
public interface Entity<T extends EntityId> {
    T getId();
}
