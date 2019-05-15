package com.prcbadminton.badminton.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "OrderDetails")
@Getter
@Setter
public class OrderDetail implements Serializable {
    @EmbeddedId
    private OrderDetailIdentity orderDetailIdentity;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "discount")
    private float discount;

    @Column(name = "date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date modify;

    public OrderDetail() {
    }

    public OrderDetail(OrderDetailIdentity orderDetailIdentity, int quantity, float discount, Date modify) {
        this.orderDetailIdentity = orderDetailIdentity;
        this.quantity = quantity;
        this.discount = discount;
        this.modify = modify;
    }
}
