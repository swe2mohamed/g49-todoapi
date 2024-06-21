package com.example.demo.converter;

import com.example.demo.domain.dto.RoleDTOView;
import com.example.demo.domain.entity.Role;

public interface RoleConverter {
    RoleDTOView toRoleDTO(Role entity);
    Role toRoleEntity(RoleDTOView dto);

}
