package com.garrettcooperdev.showcase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {
    @Value("${com.garrettcooperdev.showcase.version}")
    private String version;

    @GetMapping("/version")
    public ResponseEntity<?> version(){
        return ResponseEntity.ok(version);
    }
}
