package com.example.saarthix;

import java.util.HashMap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.saarthix.model.Job_metrics.Role;
import com.example.saarthix.repository.Job_metrics.RoleRepository;

@SpringBootApplication
public class SaarthiXApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaarthiXApplication.class, args);
    }


}
