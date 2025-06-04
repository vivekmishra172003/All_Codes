package com.todo.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    /*
    // Example of programmatic route definition.
    // These routes are currently defined in application.properties.
    // If you prefer programmatic configuration, you can uncomment and modify this.
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("auth-service-route-java", r -> r.path("/auth/**")
                .uri("http://localhost:8082"))
            .route("user-service-route-java", r -> r.path("/users/**")
                .uri("http://localhost:8081"))
            .route("todo-service-route-java", r -> r.path("/todos/**")
                .uri("http://localhost:8083"))
            .build();
    }
    */

    // You can also define GlobalFilters or other gateway-specific beans here.
}

