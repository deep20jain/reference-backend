package com.example.orm.jpa;

import java.io.Serializable;

/**
 * Created by deep20jain on 29-09-2018.
 */
public interface EntityId<T> extends Serializable   {
    T getId();
    String asString();
}
