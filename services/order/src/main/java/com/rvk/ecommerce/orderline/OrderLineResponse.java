package com.rvk.ecommerce.orderline;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }