package com.com.luv2code.ecommerce.dto;

import lombok.Data;

// use this class to send back a Java object as JSON

@Data
public class PurchaseResponse {

    private final String orderTrackingNumber;

}
