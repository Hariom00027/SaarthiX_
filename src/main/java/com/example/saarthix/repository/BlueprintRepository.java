package com.example.saarthix.repository;

import com.example.saarthix.model.Blueprint;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BlueprintRepository {

    private final List<Blueprint> blueprints = new ArrayList<>();

    public BlueprintRepository() {
        blueprints.add(new Blueprint(1L, "Software Engineer Path", "Steps to become a Software Engineer"));
        blueprints.add(new Blueprint(2L, "Data Scientist Path", "Steps to become a Data Scientist"));
    }

    public List<Blueprint> findAll() { return blueprints; }

    public Optional<Blueprint> findById(Long id) {
        return blueprints.stream().filter(b -> b.getId().equals(id)).findFirst();
    }

    public Blueprint save(Blueprint blueprint) {
        blueprints.add(blueprint);
        return blueprint;
    }

    public Blueprint update(Long id, Blueprint updatedBlueprint) {
        Optional<Blueprint> existing = findById(id);
        if (existing.isPresent()) {
            Blueprint blueprint = existing.get();
            blueprint.setTitle(updatedBlueprint.getTitle());
            blueprint.setDescription(updatedBlueprint.getDescription());
            return blueprint;
        }
        return null;
    }

    public boolean delete(Long id) {
        return blueprints.removeIf(b -> b.getId().equals(id));
    }
}
