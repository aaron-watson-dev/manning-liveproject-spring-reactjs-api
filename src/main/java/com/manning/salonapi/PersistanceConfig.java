package com.manning.salonapi;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.manning.salonapi.repository")
public class PersistanceConfig {
}
