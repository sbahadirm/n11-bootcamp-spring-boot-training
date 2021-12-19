package com.bahadirmemis.springboot.mongodb.service;

import com.bahadirmemis.springboot.mongodb.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(String id) ;

    Category save(Category category);

    void delete(String id) ;
}
