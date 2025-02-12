package com.springboot.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public RouteLocator getRoutes(RouteLocatorBuilder builder)
    {
        return builder.routes()
                .route(p->p
                        .path("/movies/**")
                        .uri("http://localhost:4444/"))
                .route(p->p
                        .path("/favourites/**")
                        .uri("http://localhost:5555/"))
                .route(p->p
                        .path("/recommended/**")
                        .uri("http://localhost:6666/"))
                .route(p->p
                        .path("/user/auth/**")
                        .uri("http://localhost:7777/"))
                .build();

    }
}
