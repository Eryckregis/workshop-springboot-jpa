package com.estudandospring.course.repositories;

import com.estudandospring.course.entities.Category;
import com.estudandospring.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
