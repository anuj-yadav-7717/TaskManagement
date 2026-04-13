package com.myanatomy.sandboxpro.controller;

import com.myanatomy.sandboxpro.model.HealthStatus;
import com.myanatomy.sandboxpro.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    private final HealthService healthService;
    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }
    @GetMapping("/health")
    public HealthStatus healthCheck() {
        return healthService.getHealth();
    }
}