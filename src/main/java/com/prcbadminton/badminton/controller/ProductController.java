package com.prcbadminton.badminton.controller;

import com.prcbadminton.badminton.entities.Product;
import com.prcbadminton.badminton.repository.ProductRepository;
import com.prcbadminton.badminton.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    private ProductRepository repository;

    public ProductController(ProductService productService, ProductRepository repository) {
        this.productService = productService;
        this.repository = repository;
    }

    //    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping("/promotionProduct")
    public List<Product> getProductInHomePage() {
        return this.productService.getProductInHomePage();
    }

    @GetMapping("/bestSalesProduct")
    public List<Product> getBestSalesProduct() {
        return this.productService.getBestSalesProduct();
    }

    @GetMapping("/fourProduct")
    public List<Product> getFourProduct() {
        return this.productService.getFourProduct();
    }

    @GetMapping("/allPromotionProduct")
    public List<Product> getAllPromotionProduct() {
        return this.productService.getAllPromotionProduct();
    }

    @GetMapping("/allBestSalesProduct")
    public List<Product> getAllBestSalesProduct() {
        return this.productService.getAllBestSalesProduct();
    }

    @GetMapping("/")
    public List<Product> getAll() {
        return this.productService.getAllProduct();
    }
    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Product product) {
        return ResponseEntity.ok(this.productService.save(product));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable int id) {
        Optional<Product> stock = productService.findById(id);
        if (!stock.isPresent()) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(stock.get());
    }
    @PutMapping("/{id}")
    public void update(@PathVariable("id") int id, @RequestBody Product product) {
        product.setId(id);
        repository.save(product);
//        return repository.findById(id).map(record -> {
//            record.setName(product.getName());
//            record.setPrice(product.getPrice());
//            record.setDescription(product.getDescription());
//            record.setQuantity(product.getQuantity());
//            Product updated = productService.save(record);
//            return ResponseEntity.ok().body(updated);
//        }).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        if (!productService.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }
        productService.deleteById(id);

        return ResponseEntity.ok().build();
    }
}

