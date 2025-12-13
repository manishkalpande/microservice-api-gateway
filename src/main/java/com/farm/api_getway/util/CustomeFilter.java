//package com.farm.api_getway.util;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Component
//public class CustomeFilter implements org.springframework.cloud.gateway.filter.GlobalFilter {
//
//    private static final Logger logger = LoggerFactory.getLogger(GlobalFilter.class);
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        logger.info("Request path: {}", exchange.getRequest().getPath());
//        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//            logger.info("Response status: {}", exchange.getResponse().getStatusCode());
//        }));
//    }
//}