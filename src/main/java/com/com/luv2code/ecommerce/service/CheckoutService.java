package com.com.luv2code.ecommerce.service;

import com.com.luv2code.ecommerce.dto.Purchase;
import com.com.luv2code.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
