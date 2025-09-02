package com.example.saarthix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.saarthix.model.*;
import com.example.saarthix.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SaarthiXApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaarthiXApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(
            SkillService skillService,
            BlueprintService blueprintService,
            EducationService educationService,
            IndustryService industryService,
            RoleService roleService) {
        return args -> {
            skillService.createSkill(new Skill("1", "Java Programming"));
            blueprintService
                    .createBlueprint(new Blueprint("1", "Sample Blueprint", "This is a sample blueprint description."));
            educationService.createEducation(new Education("1", "Bachelor of Science"));
            industryService.createIndustry(new Industry("1", "Information Technology"));
            roleService.createRole(new Role("1", "Software Engineer"));
        };
    }
}
