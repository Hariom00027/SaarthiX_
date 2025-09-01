package com.example.saarthix.repository;

import com.example.saarthix.model.Role;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RoleRepository {

    private final List<Role> roles = new ArrayList<>();

    public RoleRepository() {
        roles.add(new Role(1L, "Software Engineer"));
        roles.add(new Role(2L, "Data Scientist"));
        roles.add(new Role(3L, "Product Manager"));
    }

    public List<Role> findAll() {
        return roles;
    }

    public Optional<Role> findById(Long id) {
        return roles.stream().filter(r -> r.getId().equals(id)).findFirst();
    }

    public Role save(Role role) {
        roles.add(role);
        return role;
    }

    public Role update(Long id, Role updatedRole) {
        Optional<Role> existing = findById(id);
        if (existing.isPresent()) {
            Role role = existing.get();
            role.setName(updatedRole.getName());
            return role;
        }
        return null;
    }

    public boolean delete(Long id) {
        return roles.removeIf(r -> r.getId().equals(id));
    }
}
