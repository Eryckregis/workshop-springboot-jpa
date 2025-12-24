package com.estudandospring.course.repositories;

import com.estudandospring.course.entities.Category;
import com.estudandospring.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
