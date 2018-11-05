package com.crm.pharma.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.pharma.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
