package com.prcbadminton.badminton.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Order")
@Getter
@Setter
public class Order implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;
    @Column(name = "date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date date;

    public Order() {
    }

    public Order(String description, User user_id, Date date) {
        this.description = description;
        this.user_id = user_id;
        this.date = date;
    }
}
