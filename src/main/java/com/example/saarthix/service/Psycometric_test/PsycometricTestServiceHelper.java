package com.example.saarthix.service.Psycometric_test;

import com.example.saarthix.model.Psycometric_test.PsycometricTest;

import java.util.List;

public class PsycometricTestServiceHelper {

    public static String generateAIReport(List<PsycometricTest> responses) {
        StringBuilder report = new StringBuilder();
        for (PsycometricTest response : responses) {
            if (response.getAnswer().equals("Strong")) {
                report.append("Strength: ").append(response.getQuestion()).append("\n");
            } else {
                report.append("Weakness: ").append(response.getQuestion()).append("\n");
            }
        }
        return report.toString();
    }
}
