package com.gatewayapi.gatewayservice.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  
public class GatewayConfig {

    // Define a bean for custom route locator configuration
    @Bean
    RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("cateringsystem", r -> r
                    .path("/api/catering/**")  
                    .uri("http://localhost:8000"))
//            .route("cateringsystem", r -> r
//                    .path("/api/users/**")  
//                    .uri("http://localhost:8000"))
//            .route("cateringsystem", r -> r
//                    .path("/api/orders/**")  
//                    .uri("http://localhost:8000"))
//            .route("cateringsystem", r -> r
//                    .path("/api/orderdetails/**")  
//                    .uri("http://localhost:8000"))
            .route("product-service", r -> r
                    .path("/api/product/**")  
                    .uri("http://localhost:8082"))
//            .route("product-service", r -> r
//                    .path("/api/requirementperfood/**")  
//                    .uri("http://localhost:8082"))
            .build();  
    }
}
