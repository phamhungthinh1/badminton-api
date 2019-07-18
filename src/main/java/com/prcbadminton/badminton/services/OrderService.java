package com.prcbadminton.badminton.services;

import com.prcbadminton.badminton.dto.OrderDTO;
import com.prcbadminton.badminton.entities.*;
import com.prcbadminton.badminton.repository.OrderDetailRepository;
import com.prcbadminton.badminton.repository.OrderRepository;
import com.prcbadminton.badminton.repository.ProductRepository;
import com.prcbadminton.badminton.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements IOrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void createOrder(List<OrderDTO> orderList, User user) {
        Order order = new Order();
        order.setUser_id(user);
        Order newOrder = orderRepository.save(order);
        for (int i = 0; i < orderList.size(); i++) {
            Optional<Product> product = productRepository.findById(orderList.get(i).getId());
            OrderDetail orderDetail = new OrderDetail();
            OrderDetailIdentity orderDetailIdentity = new OrderDetailIdentity();
            orderDetailIdentity.setOrder(newOrder);
            orderDetailIdentity.setProduct(product.get());
            orderDetail.setOrderDetailIdentity(orderDetailIdentity);
            orderDetail.setQuantity(orderList.get(i).getCount());
            orderDetail.setMoney(orderList.get(i).getPrice());
            orderDetail.setModify(new Date());
            orderDetailRepository.save(orderDetail);
        }
    }
}
