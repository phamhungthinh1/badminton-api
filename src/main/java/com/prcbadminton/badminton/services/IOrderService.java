package com.prcbadminton.badminton.services;

import com.prcbadminton.badminton.dto.OrderDTO;
import com.prcbadminton.badminton.entities.User;

import java.util.List;

public interface IOrderService {
    void createOrder(List<OrderDTO> orderList, User user);
}
