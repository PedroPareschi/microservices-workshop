package com.pedropareschi.microservicos.microservico_x.domain;

import com.pedropareschi.microservicos.microservico_x.configs.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits restrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
