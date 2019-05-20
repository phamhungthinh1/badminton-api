package com.prcbadminton.badminton.services;

import com.prcbadminton.badminton.entities.Product;
import com.prcbadminton.badminton.repository.ProductRepository;

import java.util.List;

public interface IProductService {
    public List<Product> getAllProduct();
}
