package com.rvk.ecommerce.payment;

import com.rvk.ecommerce.customer.CustomerResponse;
import com.rvk.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}