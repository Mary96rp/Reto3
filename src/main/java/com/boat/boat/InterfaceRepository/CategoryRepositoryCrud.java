package com.boat.boat.InterfaceRepository;

import com.boat.boat.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mariana
 */
public interface CategoryRepositoryCrud extends CrudRepository<Category, Integer> {
}
