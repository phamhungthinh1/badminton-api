package com.prcbadminton.badminton.repository;

import com.prcbadminton.badminton.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
