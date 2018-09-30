package com.example.copsboot.user;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by deep20jain on 29-09-2018.
 */
public interface UserRepository extends CrudRepository<User, UUID>, UserRepositoryCustom {
}
