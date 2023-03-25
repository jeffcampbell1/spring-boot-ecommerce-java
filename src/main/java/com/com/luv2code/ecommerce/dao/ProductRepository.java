package com.com.luv2code.ecommerce.dao;

import com.com.luv2code.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


// Give the actual url where our application is running.
// Accept calls from web browser scripts for this origin.
// origin is protocol + hostname + port ..
@CrossOrigin("http://localhost:4200")    // here we give the origin .. or server that our angular application is running on
public interface ProductRepository extends JpaRepository<Product, Long> {
}
