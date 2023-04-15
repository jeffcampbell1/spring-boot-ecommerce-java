package com.com.luv2code.ecommerce.dto;


import com.com.luv2code.ecommerce.entity.Address;
import com.com.luv2code.ecommerce.entity.Customer;
import com.com.luv2code.ecommerce.entity.Order;
import com.com.luv2code.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;

    // just a collection
    private Set<OrderItem> orderItems;

}
