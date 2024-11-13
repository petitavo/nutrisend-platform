package com.example.nutrisend.platform.order.interfaces.rest.resources;

public record CreateOrderItemResource(
        String name,
        double price,
        String category,
        int quantity
) {
}
