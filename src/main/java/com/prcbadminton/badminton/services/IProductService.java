package com.prcbadminton.badminton.services;

import com.prcbadminton.badminton.entities.Product;
import com.prcbadminton.badminton.repository.ProductRepository;

import java.util.List;

public interface IProductService {
    public List<Product> getAllProduct();
    public List<Product> getProductInHomePage();
    public List<Product> getBestSalesProduct();
    public List<Product> getFourProduct();
    public List<Product> getAllPromotionProduct();
    public List<Product> getAllBestSalesProduct();
}
