package com.prcbadminton.badminton.dto;

import javax.persistence.Column;
import java.io.Serializable;

public class ProductDTO implements Serializable {
    private int id;
    private String name;
    private double price;
    private String description;
    private int quantity;
    private String flex;
    private String shaft;
    private String weight;
    private String color;
    private int producerId;
    private int promotionId;

    public ProductDTO() {
    }

    public ProductDTO(int id, String name, double price, String description, int quantity, String flex, String shaft, String weight, String color, int producerId, int promotionId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.flex = flex;
        this.shaft = shaft;
        this.weight = weight;
        this.color = color;
        this.producerId = producerId;
        this.promotionId = promotionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFlex() {
        return flex;
    }

    public void setFlex(String flex) {
        this.flex = flex;
    }

    public String getShaft() {
        return shaft;
    }

    public void setShaft(String shaft) {
        this.shaft = shaft;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProducerId() {
        return producerId;
    }

    public void setProducerId(int producerId) {
        this.producerId = producerId;
    }

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }
}
