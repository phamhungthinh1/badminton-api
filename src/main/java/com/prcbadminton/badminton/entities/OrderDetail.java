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

    @Column(name = "money")
    private float money;

    public OrderDetail() {
    }

    public OrderDetail(OrderDetailIdentity orderDetailIdentity, int quantity, float money) {
        this.orderDetailIdentity = orderDetailIdentity;
        this.quantity = quantity;
        this.money = money;
    }

    public OrderDetailIdentity getOrderDetailIdentity() {
        return orderDetailIdentity;
    }

    public void setOrderDetailIdentity(OrderDetailIdentity orderDetailIdentity) {
        this.orderDetailIdentity = orderDetailIdentity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
