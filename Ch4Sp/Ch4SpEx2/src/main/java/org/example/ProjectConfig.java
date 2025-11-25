package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example", "org.example.proxies", "org.example.services", "org.example.repositories"})
public class ProjectConfig {
}
