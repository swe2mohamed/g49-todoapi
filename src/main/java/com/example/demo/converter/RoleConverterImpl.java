package com.example.demo.converter;

import com.example.demo.domain.dto.RoleDTOView;
import com.example.demo.domain.entity.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleConverterImpl implements RoleConverter{
    @Override
    public RoleDTOView toRoleDTO(Role entity) {
        return new RoleDTOView(entity.getId(), entity.getName());
    }

    @Override
    public Role toRoleEntity(RoleDTOView dto) {
        return new Role(dto.getId(), dto.getName());
    }
}
