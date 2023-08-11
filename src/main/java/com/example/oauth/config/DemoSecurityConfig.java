package com.example.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.FilterChain;

@Configuration
public class DemoSecurityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(FilterChain chain) throws Exception {
        return chain.buil;
    }
}
