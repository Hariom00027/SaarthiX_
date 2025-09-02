package com.example.saarthix.controller;

import com.example.saarthix.model.Blueprint;
import com.example.saarthix.service.BlueprintService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blueprints")
public class BlueprintController {

    private final BlueprintService blueprintService;

    public BlueprintController(BlueprintService blueprintService) {
        this.blueprintService = blueprintService;
    }

    // READ ALL
    @GetMapping
    public List<Blueprint> getAllBlueprints() {
        return blueprintService.getAllBlueprints();
    }

    // READ ONE
    @GetMapping("/{id}")
    public ResponseEntity<Blueprint> getBlueprintById(@PathVariable String id) {
        return blueprintService.getBlueprintById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // CREATE
    @PostMapping
    public Blueprint createBlueprint(@RequestBody Blueprint blueprint) {
        return blueprintService.createBlueprint(blueprint);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Blueprint> updateBlueprint(@PathVariable String id, @RequestBody Blueprint blueprint) {
        Blueprint updated = blueprintService.updateBlueprint(id, blueprint);
        if (updated != null)
            return ResponseEntity.ok(updated);
        return ResponseEntity.notFound().build();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlueprint(@PathVariable String id) {
        if (blueprintService.deleteBlueprint(id))
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }
}
