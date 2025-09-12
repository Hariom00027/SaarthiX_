package com.example.saarthix.controller.Student_profiling;

import com.example.saarthix.model.Student_profiling.StudentProfile;
import com.example.saarthix.service.Student_profiling.ProfilingService;
import com.example.saarthix.service.Student_profiling.ProfilingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profiling")
public class ProfilingController {

    private final ProfilingService profilingService;

    public ProfilingController(ProfilingService profilingService) {
        this.profilingService = profilingService;
    }

    // Get the profile by studentId
    @GetMapping("/student/{studentId}")
    public StudentProfile getProfile(@PathVariable String studentId) {
        return profilingService.getProfile(studentId);
    }

    // Create or  update the profile
    @PostMapping("/student")
    public StudentProfile createOrUpdateProfile(@RequestBody StudentProfile profile) {
        return profilingService.createOrUpdateProfile(profile);
    }
}
