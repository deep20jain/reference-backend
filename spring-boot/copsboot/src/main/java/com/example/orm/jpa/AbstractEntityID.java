package com.example.orm.jpa;

import com.example.util.ArtifactForFramework;
import com.google.common.base.MoreObjects;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by deep20jain on 29-09-2018.
 */
@MappedSuperclass
public abstract class AbstractEntityID<T extends Serializable> implements Serializable, EntityId<T> {
    private T id;

    @ArtifactForFramework
    protected AbstractEntityID() {

    }

    protected AbstractEntityID(T id) {
        this.id = Objects.requireNonNull(id);
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public String asString() {
        return id.toString();
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if(this == obj) {
            result = true;
        } else if(obj instanceof AbstractEntityID ) {
            AbstractEntityID other = (AbstractEntityID) obj;
            result = Objects.equals(id, other.id);
        }

        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .toString();
    }
}
