package com.example.orm.jpa;

import java.util.UUID;

/**
 * Created by deep20jain on 30-09-2018.
 */
public class InMemoryUniqueIdGenerator implements UniqueIdGenerator<UUID> {
    @Override
    public UUID getNextUniqueId() {
        return UUID.randomUUID();
    }
}
