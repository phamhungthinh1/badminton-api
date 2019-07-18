package com.prcbadminton.badminton.controller;

import com.prcbadminton.badminton.dto.OrderDTO;
import com.prcbadminton.badminton.entities.Order;
import com.prcbadminton.badminton.entities.User;
import com.prcbadminton.badminton.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;
    @PostMapping
    public ResponseEntity<Order> create(@RequestBody List<OrderDTO> orderList) {
        Principal principal = SecurityContextHolder.getContext().getAuthentication();
        String username = ((Authentication) principal).getPrincipal().toString();
        if (username.equals("anonymousUser")) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        Optional<User> account = (Optional<User>)((Authentication) principal).getCredentials();
        orderService.createOrder(orderList, account.get());
        return new ResponseEntity(HttpStatus.OK);
    }
}
