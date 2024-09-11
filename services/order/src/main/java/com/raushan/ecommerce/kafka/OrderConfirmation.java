package com.raushan.ecommerce.kafka;

import com.raushan.ecommerce.customer.CustomerResponse;
import com.raushan.ecommerce.order.PaymentMethod;
import com.raushan.ecommerce.product.PurchaseResponse;

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
