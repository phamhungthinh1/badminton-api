package com.prcbadminton.badminton.repository;

import com.prcbadminton.badminton.entities.OrderDetail;
import com.prcbadminton.badminton.entities.OrderDetailIdentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailIdentity> {
}
