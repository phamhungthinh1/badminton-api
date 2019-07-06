package com.prcbadminton.badminton.services;

import com.prcbadminton.badminton.dto.PageDTO;
import com.prcbadminton.badminton.entities.Product;
import com.prcbadminton.badminton.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class ProductService implements IProductService{
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public PageDTO<Product> getProductByName(Integer page, Integer element, String searchValue) {
        Pageable pageable = (Pageable) PageRequest.of(page - 1, element);
        Page<Product> listData = this.productRepository.getProductByName(pageable, searchValue);
        PageDTO<Product> pageDTO = new PageDTO<>();
        pageDTO.setMaxPage(listData.getTotalPages());
        pageDTO.setData(listData.getContent());
        return pageDTO;
    }

    public PageDTO<Product> getAllProduct(Integer page, Integer element) {
        Pageable pageable = (Pageable) PageRequest.of(page - 1, element);
        Page<Product> listData = this.productRepository.findAll(pageable);
        PageDTO<Product> pageDTO = new PageDTO<>();
        pageDTO.setMaxPage(listData.getTotalPages());
        pageDTO.setData(listData.getContent());
        return pageDTO;
    }

    @Override
    public List<Product> getProductInHomePage() {
        return productRepository.getProductInHomePage();
    }

    @Override
    public List<Product> getBestSalesProduct() {
        return this.productRepository.getBestSalesProduct();
    }

    @Override
    public List<Product> getFourProduct() {
        return this.productRepository.getFourProduct();
    }

    public PageDTO<Product> getAllPromotionProduct(Integer page, Integer element) {
        Pageable pageable = (Pageable) PageRequest.of(page - 1, element);
        Page<Product> listData = this.productRepository.getAllPromotionProduct(pageable);
        PageDTO<Product> pageDTO = new PageDTO<>();
        pageDTO.setMaxPage(listData.getTotalPages());
        pageDTO.setData(listData.getContent());
        return pageDTO;
    }

    public PageDTO<Product> getAllBestSalesProduct(Integer page, Integer element) {
        Pageable pageable = PageRequest.of(page - 1, element);
        Page<Product> listData = this.productRepository.getAllPromotionProduct(pageable);
        PageDTO<Product> pageDTO = new PageDTO<>();
        pageDTO.setMaxPage(listData.getTotalPages());
        pageDTO.setData(listData.getContent());
        return pageDTO;
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
