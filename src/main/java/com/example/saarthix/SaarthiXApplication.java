package com.example.saarthix;

import java.util.HashMap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.saarthix.model.Role;
import com.example.saarthix.repository.RoleRepository;

@SpringBootApplication
public class SaarthiXApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaarthiXApplication.class, args);
    }

    @Bean
    public CommandLineRunner testMongoInsert(RoleRepository roleRepository) {
        return args -> {
            Role testRole = new Role();
            testRole.setName("Test Role");
            testRole.setIndustryId("test-industry");
            testRole.setSkills(new HashMap<>());
            roleRepository.save(testRole);
            System.out.println("Inserted test Role into MongoDB");
        };
    }
}
