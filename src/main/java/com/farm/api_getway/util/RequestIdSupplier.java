//package com.farm.api_getway.util;
//
//import org.springframework.web.server.ServerWebExchange;
//
//import java.util.UUID;
//
//public final class RequestIdSupplier {
//    private static final String ATTR = "reqId";
//
//
//    private RequestIdSupplier() {}
//
//
//    public static String supply(ServerWebExchange exchange) {
//        Object existing = exchange.getAttribute(ATTR);
//        if (existing instanceof String id) return id;
//        String id = UUID.randomUUID().toString();
//        exchange.getAttributes().put(ATTR, id);
//        return id;
//    }
//}
