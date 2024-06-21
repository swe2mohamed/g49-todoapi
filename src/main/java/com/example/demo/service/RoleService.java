package com.example.demo.service;


import com.example.demo.domain.dto.RoleDTOView;
import com.example.demo.domain.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoleService {
    List<RoleDTOView> getAll();
}
