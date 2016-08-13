package com.teamtreehouse.giflib.sevice;

import com.teamtreehouse.giflib.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);

}
