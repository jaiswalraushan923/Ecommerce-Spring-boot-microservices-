package com.raushan.ecommerce.payment;

import com.raushan.ecommerce.customer.CustomerResponse;
import com.raushan.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
