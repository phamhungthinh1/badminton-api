package com.prcbadminton.badminton.entities;

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
    public Image() {
    }

    public Image(String url, int status) {
        this.url = url;
        this.status = status;
    }
}
