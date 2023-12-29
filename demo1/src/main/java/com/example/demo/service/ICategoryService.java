package com.example.demo.service;

import com.example.demo.model.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category saveOrUpdate(Category category);
    void delete(Long categoryId);
    Category findById(Long categoryId);
}
