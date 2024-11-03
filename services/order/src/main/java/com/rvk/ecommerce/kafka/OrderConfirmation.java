package com.rvk.ecommerce.kafka;

import com.rvk.ecommerce.customer.CustomerResponse;
import com.rvk.ecommerce.order.PaymentMethod;
import com.rvk.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}