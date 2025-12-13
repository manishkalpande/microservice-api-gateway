//package com.farm.api_getway.filter;
//
//
//import com.farm.api_getway.util.RequestIdSupplier;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.core.Ordered;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import reactor.core.publisher.Mono;
//
//@Component
//public class AuthenticationFilter implements GatewayFilter, Ordered {
//
//    private static final Logger log = LoggerFactory.getLogger(AuthenticationFilter.class);
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request = exchange.getRequest();
////        HttpHeaders headers = request.getHeaders();
////
////        // 1. Check for Authorization header
////        if (!headers.containsKey(HttpHeaders.AUTHORIZATION)) {
////            log.warn("❌ Missing Authorization header");
////            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
////            return exchange.getResponse().setComplete();
////        }
////
////        // 2. Extract token
////        String authHeader = headers.getFirst(HttpHeaders.AUTHORIZATION);
////        String token = authHeader != null && authHeader.startsWith("Bearer ")
////                ? authHeader.substring(7)
////                : null;
////
////        if (token == null || token.isBlank()) {
////            log.warn("❌ Invalid Bearer token");
////            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
////            return exchange.getResponse().setComplete();
////        }
////
////        // 3. Validate token (placeholder – integrate with your JWT util)
////        if (!validateToken(token)) {
////            log.warn("❌ Token validation failed");
////            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
////            return exchange.getResponse().setComplete();
////        }
////
////        log.info("✅ Token validated for request: {}", request.getURI());
////
////        // Add user info to request headers (optional)
//        ServerHttpRequest mutated = request.mutate()
//                .header("X-Auth-User", "demoUser") // Replace with actual user from JWT
//                .build();
//
//        return chain.filter(exchange.mutate().request(mutated).build());
//    }
//
//    private boolean validateToken(String token) {
//        // TODO: implement proper JWT validation
//        // e.g., using io.jsonwebtoken.Jwts or Nimbus JOSE + your secret/public key
//        return token.equals("valid-token"); // 🔴 for demo only
//    }
//
//    @Override
//    public int getOrder() {
//        return -1; // High priority filter
//    }
//}
