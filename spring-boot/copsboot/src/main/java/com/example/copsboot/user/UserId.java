package com.example.copsboot.user;

import com.example.orm.jpa.AbstractEntityID;

import java.util.UUID;

/**
 * Created by deep20jain on 30-09-2018.
 */
public class UserId extends AbstractEntityID<UUID> {
    protected UserId() {

    }

    public UserId(UUID id) {
        super(id);
    }
}
