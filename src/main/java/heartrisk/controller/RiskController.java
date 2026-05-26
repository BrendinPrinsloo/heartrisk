package heartrisk.controller;

import heartrisk.model.PatientData;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/risk")
public class RiskController {

    @PostMapping
    public Map<String, String> calculateRisk(@RequestBody PatientData data) {

        int score = 0;

        if (data.getAge() >= 55) {
            score++;
        }

        if (data.getCholesterol() >= 240) {
            score++;
        }

        if (data.getRestingBloodPressure() >= 140) {
            score++;
        }

        if (data.getMaxHeartRate() < 130) {
            score++;
        }

        String risk;

        if (score <= 1) {
            risk = "Low Risk";
        } else if (score == 2) {
            risk = "Medium Risk";
        } else {
            risk = "High Risk";
        }

        return Map.of(
                "riskCategory", risk,
                "message", "Result generated successfully."
        );
    }
}
