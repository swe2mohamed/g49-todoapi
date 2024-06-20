package com.example.demo.startup;

import com.example.demo.Repository.RoleRepository;
import com.example.demo.domain.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleDataLoader implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleDataLoader(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        roleRepository.save(new Role("ADMIN"));
        roleRepository.save((new Role("USER")));
        roleRepository.save(new Role("Guest"));
    }
}
