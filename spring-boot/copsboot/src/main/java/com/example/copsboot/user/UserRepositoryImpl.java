package com.example.copsboot.user;

import com.example.orm.jpa.UniqueIdGenerator;

import java.util.UUID;

/**
 * Created by deep20jain on 30-09-2018.
 */
public class UserRepositoryImpl implements UserRepositoryCustom {
    private final UniqueIdGenerator<UUID> generator;

    public UserRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    @Override
    public UserId nextId() {
        return new UserId(generator.getNextUniqueId());
    }
}
