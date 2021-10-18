package com.example.product.services;

import java.util.List;
import java.util.Optional;

import com.example.product.model.Product;
import com.example.product.repositories.productRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final productRepository productRepo;

    public ProductService(productRepository productRepo){
        this.productRepo = productRepo;
    }

    public List<Product> allProducts(){
        return productRepo.findAll();
    }

    public Product createProduct(Product p){
        return productRepo.save(p);
    }

    public Product findProduct(Long id){
        Optional<Product> optionalProduct = productRepo.findById(id);
        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        } else {
            return null;
        }
    }

    public void delete(Product product){
        productRepo.delete(product);
    }
}
