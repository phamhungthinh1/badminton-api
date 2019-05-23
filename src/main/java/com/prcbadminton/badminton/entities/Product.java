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
    @Column(name = "active")
    private boolean active;
    @Column(name = "flex")
    private String flex;
    @Column(name = "shaft")
    private String shaft;
    @Column(name = "weight")
    private String weight;
    @Column(name = "color")
    private String color;
    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;
    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;
    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private Promotion promotion;
    public Product() {
    }

    public Product(String name, double price, String description, int quantity, boolean active, String flex, String shaft, String weight, String color, Image image, Producer producer, Promotion promotion) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.active = active;
        this.flex = flex;
        this.shaft = shaft;
        this.weight = weight;
        this.color = color;
        this.image = image;
        this.producer = producer;
        this.promotion = promotion;
    }

    public int getId() {
        return id;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public Product setActive(boolean active) {
        this.active = active;
        return this;
    }

    public String getFlex() {
        return flex;
    }

    public Product setFlex(String flex) {
        this.flex = flex;
        return this;
    }

    public String getShaft() {
        return shaft;
    }

    public Product setShaft(String shaft) {
        this.shaft = shaft;
        return this;
    }

    public String getWeight() {
        return weight;
    }

    public Product setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Product setColor(String color) {
        this.color = color;
        return this;
    }

    public Image getImage() {
        return image;
    }

    public Product setImage(Image image) {
        this.image = image;
        return this;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product setProducer(Producer producer) {
        this.producer = producer;
        return this;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public Product setPromotion(Promotion promotion) {
        this.promotion = promotion;
        return this;
    }
}
