package com.prcbadminton.badminton.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Promotion")
@Getter
@Setter
public class Promotion implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "type")
    private String type;
    @Column(name = "discount")
    private float discount;
    @Column(name = "status")
    private boolean status;
    @Column(name = "active")
    private boolean active;

    public Promotion() {
    }

    public Promotion(String type, float discountl, boolean status, boolean active) {
        this.type = type;
        this.discount = discount;
        this.status = status;
        this.active = active;
    }
}
