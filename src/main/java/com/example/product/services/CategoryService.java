package com.example.product.services;

import java.util.List;
import java.util.Optional;

import com.example.product.model.Category;
import com.example.product.repositories.categoryRepository;

import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final categoryRepository categoryRepo;

    public CategoryService(categoryRepository categoryRepo){
        this.categoryRepo = categoryRepo;
    }

    public List<Category> allCategories(){
        return categoryRepo.findAll();
    }

    public Category createCategory(Category c){
        return categoryRepo.save(c);
    }

    public Category findCategory(Long id){
        Optional<Category> optionalCategory = categoryRepo.findById(id);
        if(optionalCategory.isPresent()){
            return optionalCategory.get();
        } else {
            return null;
        }
    }

    public void delete(Category category){
        categoryRepo.delete(category);
    }
}
