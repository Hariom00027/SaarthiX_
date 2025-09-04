package com.example.saarthix.service.Job_metrics;

import com.example.saarthix.model.Job_metrics.Blueprint;
import com.example.saarthix.repository.Job_metrics.BlueprintRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BlueprintService {

    private final BlueprintRepository blueprintRepository;

    public BlueprintService(BlueprintRepository blueprintRepository) {
        this.blueprintRepository = blueprintRepository;
    }

    public List<Blueprint> getAllBlueprints() {
        return blueprintRepository.findAll();
    }

    public Optional<Blueprint> getBlueprintById(String id) {
        return blueprintRepository.findById(id);
    }

    public Blueprint createBlueprint(Blueprint blueprint) {
        return blueprintRepository.save(blueprint);
    }

    public Blueprint updateBlueprint(String id, Blueprint blueprint) {
        return blueprintRepository.findById(id)
                .map(existing -> {
                    existing.setTitle(blueprint.getTitle());
                    existing.setDescription(blueprint.getDescription());
                    return blueprintRepository.save(existing);
                })
                .orElse(null);
    }

    public boolean deleteBlueprint(String id) {
        if (blueprintRepository.existsById(id)) {
            blueprintRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
