package com.example.demo.service;

import com.example.demo.Repository.RoleRepository;
import com.example.demo.converter.RoleConverter;
import com.example.demo.domain.dto.RoleDTOView;
import com.example.demo.domain.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;
    private final RoleConverter roleConverter;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository, RoleConverter roleConverter) {
        this.roleRepository = roleRepository;
        this.roleConverter = roleConverter;
    }


    @Override
    public List<RoleDTOView> getAll() {
        List<Role> roles = roleRepository.findAll();
        List<RoleDTOView> roleDTOViewsList = new ArrayList<>();
        for (Role entity : roles){
            roleDTOViewsList.add(roleConverter.toRoleDTO(entity));
        }
        return roleDTOViewsList;
    }
}
