package com.myanatomy.sandboxpro.service;

import com.myanatomy.sandboxpro.model.HealthStatus;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class HealthService {
    public HealthStatus getHealth() {
        return new HealthStatus("UP", "Java Spring Boot server is up", LocalDateTime.now());
    }
}