package com.estudandospring.course.repositories;

import com.estudandospring.course.entities.OrderItem;
import com.estudandospring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {

}
