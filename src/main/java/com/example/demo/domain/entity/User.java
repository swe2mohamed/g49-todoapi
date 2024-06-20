package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class User {
    @Id
    @Column(updatable = false)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;

    // We do not need to add @Column if we do not need modification
    private boolean expired;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    @Column
    private Set<Role> roles;


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    private void addRole(Role role){
        if (role == null) throw new IllegalArgumentException("Role is null");
        if (roles == null) roles = new HashSet<>();
        roles.add(role);
    }

    private void removeRole(Role role){
        if (role == null) throw new IllegalArgumentException("Role is null");
        if (roles != null) {
            roles.remove(role);
        }
        /*else{
            // todo: throw exception if needed..
        }

         */
    }

}
