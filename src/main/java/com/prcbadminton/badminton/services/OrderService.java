package com.prcbadminton.badminton.services;

import com.prcbadminton.badminton.entities.Order;
import com.prcbadminton.badminton.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> getAll() throws Exception{
        return orderRepository.findAll();
    }
}
