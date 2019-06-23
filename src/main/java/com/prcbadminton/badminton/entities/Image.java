package com.prcbadminton.badminton.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "Images")
public class Image {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "url")
    private String url;
    @Column(name = "status")
    private int status;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
    public Image() {
    }

    public Image(String url, int status, Product product) {
        this.url = url;
        this.status = status;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public Image setId(int id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Image setUrl(String url) {
        this.url = url;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public Image setStatus(int status) {
        this.status = status;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public Image setProduct(Product product) {
        this.product = product;
        return this;
    }
}
