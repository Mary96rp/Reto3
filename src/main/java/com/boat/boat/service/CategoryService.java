package com.boat.boat.service;

import com.boat.boat.model.Category;
import com.boat.boat.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mariana
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * Retorna listado de categorias
     * @return
     */
    public List<Category> getAll(){
        return categoryRepository.getAll();
    }

    /**
     * Inserta una nueva categoria
     * @param category
     * @return
     */
    public Category save(Category category){
        if (category.getId() == null) {
            return categoryRepository.save(category);
        } else {
            Optional<Category> myCataegory = categoryRepository.getCategory(category.getId());
            if (myCataegory.isEmpty()) {
                return categoryRepository.save(category);
            } else {
                return category;
            }
        }
    }
}
