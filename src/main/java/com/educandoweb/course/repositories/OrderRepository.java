package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entitties.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
