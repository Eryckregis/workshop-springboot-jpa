package com.estudandospring.course.repositories;

import com.estudandospring.course.entities.Order;
import com.estudandospring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
