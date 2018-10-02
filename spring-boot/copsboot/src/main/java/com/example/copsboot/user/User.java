package com.example.copsboot.user;

import com.example.orm.jpa.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by deep20jain on 29-09-2018.
 */
@Entity
@Table(name = "copsboot_user")
public class User extends AbstractEntity<UserId> {
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @NotNull
    private Set<UserRole> roles;

    protected User() {

    }

    public User(UserId id, String email, String password, Set<UserRole> roles) {
        super(id);
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Set<UserRole> getRoles() {
        return roles;
    }

    public static User createOfficer(UserId userId, String officerEmail, String password) {
        HashSet<UserRole> roles = new HashSet<>();
        roles.add(UserRole.OFFICER);
        return new User(userId, officerEmail, password, roles);
    }

    public static User createCaptain(UserId userId, String captainEmail, String password) {
        HashSet<UserRole> roles = new HashSet<>();
        roles.add(UserRole.CAPTAIN);
        return new User(userId, captainEmail, password, roles);
    }
}
