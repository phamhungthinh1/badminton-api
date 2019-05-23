package com.prcbadminton.badminton.services;

import com.prcbadminton.badminton.entities.Product;
import com.prcbadminton.badminton.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class ProductService implements IProductService{
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return this.productRepository.findAll();
    }
    public Optional<Product> findById(int id) {
        return this.productRepository.findById(id);
    }

    public Product save(Product badminton) {
        return this.productRepository.save(badminton);
    }

    public void deleteById(int id) {
        this.productRepository.deleteById(id);
    }
}
