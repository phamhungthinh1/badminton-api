package com.prcbadminton.badminton.services;

import com.prcbadminton.badminton.entities.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getAll() throws Exception;
}
