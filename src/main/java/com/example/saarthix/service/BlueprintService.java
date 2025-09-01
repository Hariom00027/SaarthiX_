package com.example.saarthix.service;

import com.example.saarthix.model.Blueprint;
import com.example.saarthix.repository.BlueprintRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlueprintService {

    private final BlueprintRepository blueprintRepository;

    public BlueprintService(BlueprintRepository blueprintRepository) {
        this.blueprintRepository = blueprintRepository;
    }

    public List<Blueprint> getAllBlueprints() { return blueprintRepository.findAll(); }

    public Optional<Blueprint> getBlueprintById(Long id) { return blueprintRepository.findById(id); }

    public Blueprint createBlueprint(Blueprint blueprint) { return blueprintRepository.save(blueprint); }

    public Blueprint updateBlueprint(Long id, Blueprint blueprint) { return blueprintRepository.update(id, blueprint); }

    public boolean deleteBlueprint(Long id) { return blueprintRepository.delete(id); }
}
