package com.example.product.repositories;

import java.util.List;
import java.util.Optional;

import com.example.product.model.*;

import org.springframework.data.repository.CrudRepository;

public interface categoryRepository extends CrudRepository<Category, Long> {
    List<Category> findAll();
    List<Category> findByProducts(List<Product> products);
    Optional<Category> findById(Long id);
    void delete(Category c);
}
