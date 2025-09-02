package com.example.saarthix.service;

import com.example.saarthix.model.Role;
import com.example.saarthix.repository.RoleRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<Role> getRoleById(String id) {
        return roleRepository.findById(id);
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public Role updateRole(String id, Role role) {
        return roleRepository.findById(id)
                .map(existing -> {
                    existing.setName(role.getName());
                    return roleRepository.save(existing);
                })
                .orElse(null);
    }

    public boolean deleteRole(String id) {
        if (roleRepository.existsById(id)) {
            roleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
