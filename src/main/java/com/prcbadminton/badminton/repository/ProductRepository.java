package com.prcbadminton.badminton.repository;

import com.prcbadminton.badminton.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT top 4 * from product p where p.promotion_id is not null order by price asc", nativeQuery = true)
    public List<Product> getProductInHomePage();

    @Query(value = "SELECT top 4 p.id, p.active, p.color, p.description, p.flex, p.image_id, p.name, p.price, p.producer_id, p.quantity, p.promotion_id, p.weight, p.shaft from product p, best_sales bs where p.id = bs.product_id order by bs.quantity desc", nativeQuery = true)
    public List<Product> getBestSalesProduct();

    @Query(value = "SELECT top 4 * from product p order by p.id asc", nativeQuery = true)
    public List<Product> getFourProduct();

    @Query(value = "SELECT * from product p where p.promotion_id is not null order by price asc", nativeQuery = true)
    public List<Product> getAllPromotionProduct();

    @Query(value = "SELECT p.id, p.active, p.color, p.description, p.flex, p.image_id, p.name, p.price, p.producer_id, p.quantity, p.promotion_id, p.weight, p.shaft from product p, best_sales bs where p.id = bs.product_id order by bs.quantity desc", nativeQuery = true)
    public List<Product> getAllBestSalesProduct();


    @Query(value = "Select p from Product p, BestSales bs  where p.promotion is not null and p.id = bs.product_id order by p.price, bs.quantity")
    public List<Product> getViewAllProduct();
}
