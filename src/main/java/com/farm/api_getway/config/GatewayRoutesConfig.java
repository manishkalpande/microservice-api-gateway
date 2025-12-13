//package com.farm.api_getway.config;
//
////import com.farm.api_getway.filter.AuthenticationFilter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.CorsWebFilter;
//
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//import org.springframework.web.reactive.function.BodyInserters;
//import org.springframework.web.reactive.function.server.*;
//
//import static org.springframework.web.servlet.function.RequestPredicates.GET;
//import static org.springframework.web.servlet.function.RouterFunctions.route;
//
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.CorsWebFilter;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//import org.springframework.web.reactive.function.BodyInserters;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
//import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
//import static org.springframework.web.reactive.function.server.RouterFunctions.route;
//
//@Configuration
//public class GatewayRoutesConfig {
//
//    @Value("${app.services.user-service-id:user-service}")
//    private String userServiceId;
//
//
//    @Value("${app.services.product-service-id:product-service}")
//    private String productServiceId;
//
//
//
////    @Bean
////    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
////        return builder.routes()
////                .route("user-service", r -> r.path("/users/**")
////                        .filters(f -> f.stripPrefix(1)
////                                .addRequestHeader("X-API-Gateway", "true"))
////                        .uri("lb://USER-SERVICE"))
////                .route("order-service", r -> r.path("/orders/**")
////                        .filters(f -> f.stripPrefix(1)
////                                .addRequestHeader("X-API-Gateway", "true"))
////                        .uri("lb://ORDER-SERVICE"))
////                .route("product-service", r -> r.path("/products/**")
////                        .filters(f -> f.stripPrefix(1)
////                                .addRequestHeader("X-API-Gateway", "true"))
////                        .uri("lb://PRODUCT-SERVICE"))
////                .build();
////    }
//
//
//
//
////    @Bean
////    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
////        return builder.routes()
////                .route("user-service", r -> r.path("/users/**")
////                        .filters(f -> f.stripPrefix(1)
////                                ) // Apply authentication
////                        .uri("lb://user-service"))
////                .route("products-route", r -> r.path("/products/**")
////                        .filters(f -> f.stripPrefix(1)
////                                .filter(loggingFilter)
////                                .filter(authFilter)) // Apply authentication
////                        .uri("lb://product-service"))
////                .route("auth-route",r->r.path("/auth/**")
////                        .filters(f->f.stripPrefix(1)
////                            .filter(loggingFilter)
////                            .filter(authFilter)).uri("lb://auth-service"))
////                .build();
////    }
//
//
//    @Bean
//    public CorsWebFilter corsWebFilter() {
//        CorsConfiguration corsConfig = new CorsConfiguration();
//        corsConfig.addAllowedOrigin("*");
//        corsConfig.addAllowedMethod("*");
//        corsConfig.addAllowedHeader("*");
//        corsConfig.setAllowCredentials(true);
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfig);
//
//        return new CorsWebFilter(source);
//    }
//
//}
