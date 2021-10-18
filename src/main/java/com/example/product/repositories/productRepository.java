package com.example.product.repositories;

import java.util.List;
import java.util.Optional;

import com.example.product.model.*;

import org.springframework.data.repository.CrudRepository;

public interface productRepository extends CrudRepository<Product, Long>{
    List<Product> findAll();
    Optional<Product> findById(Long id);
    List<Product> findByCatagories(List<Category> catagories);
    void delete(Product p);
}
