package com.example.orm.jpa;

import com.example.util.ArtifactForFramework;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

/**
 * Created by deep20jain on 30-09-2018.
 */
@MappedSuperclass
public class AbstractEntity<T extends EntityId> implements Entity<T> {
    @EmbeddedId
    private T id;

    @ArtifactForFramework
    protected AbstractEntity() {

    }

    public AbstractEntity(T id) {
        this.id = Preconditions.checkNotNull(id);
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (this == obj) {
            result = true;
        } else if (obj instanceof AbstractEntity) {
            AbstractEntity other = (AbstractEntity) obj;
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
