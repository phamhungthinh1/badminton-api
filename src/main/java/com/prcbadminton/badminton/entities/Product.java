package com.prcbadminton.badminton.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Product")
@Getter
@Setter
public class Product implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "description")
    private String description;
    @Column(name = "quantity")
    private int quantity;
    @OneToMany
    @JoinColumn(name = "image_id")
    private Image image;
    @OneToMany
    @JoinColumn(name = "producer_id")
    private Producer producer;
    @OneToMany
    @JoinColumn(name = "promotion_id")
    private Promotion promotion;
    public Product() {
    }

    public Product(String name, double price, String description, int quantity, Image image, Producer producer, Promotion promotion) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.image = image;
        this.producer = producer;
        this.promotion = promotion;
    }
}
