package com.todo.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
            .csrf(csrfSpec -&gt; csrfSpec.disable()) // Updated for newer Spring Security versions
            .authorizeExchange(exchange -&gt; exchange
                .pathMatchers("/auth/**").permitAll() // Public access for authentication
                .anyExchange().authenticated()
            )
            .oauth2ResourceServer(oauth2 -&gt; oauth2.jwt(Customizer.withDefaults())); // Configure JWT validation
        return http.build();
    }
}

