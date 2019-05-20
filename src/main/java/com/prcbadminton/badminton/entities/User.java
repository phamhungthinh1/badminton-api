package com.prcbadminton.badminton.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Users")
@Getter
@Setter
public class User implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "role")
    private String role;
    @Column(name = "active")
    private boolean active;
    @OneToOne
    @JoinColumn(name = "image_id")
    private Image image;
    public User() {
    }

    public User(String name, String password, String email, String role, boolean active, Image image) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.role = role;
        this.active = active;
        this.image = image;
    }

}
