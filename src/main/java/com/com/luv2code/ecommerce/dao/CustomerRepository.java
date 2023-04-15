package com.com.luv2code.ecommerce.dao;

import com.com.luv2code.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
