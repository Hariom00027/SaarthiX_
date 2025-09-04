package com.example.saarthix.service.Job_metrics;

import com.example.saarthix.model.Job_metrics.Role;
import com.example.saarthix.repository.Job_metrics.RoleRepository;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    private static final Logger logger = LoggerFactory.getLogger(RoleService.class);

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    // GET all roles
    public List<Role> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        logger.info("Fetched roles: {}", roles);
        return roles;
    }

    // GET role by ID
    public Optional<Role> getRoleById(String id) {
        return roleRepository.findById(id);
    }

    // CREATE new role
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    // UPDATE role
    public Role updateRole(String id, Role role) {
        return roleRepository.findById(id)
                .map(existing -> {
                    existing.setName(role.getName());
                    existing.setIndustryId(role.getIndustryId());
                    existing.setSkills(role.getSkills());
                    return roleRepository.save(existing);
                })
                .orElse(null);
    }

    // DELETE role
    public boolean deleteRole(String id) {
        if (roleRepository.existsById(id)) {
            roleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
