package com.boat.boat.repository;

import com.boat.boat.InterfaceRepository.CategoryRepositoryCrud;
import com.boat.boat.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryRepositoryCrud categoryRepositoryCrud;

    /**
     * Recupera los registro de la tabla categorya
     * @return listado de categoria
     */
    public List<Category> getAll(){
        return (List<Category>) categoryRepositoryCrud.findAll();

    }

    /**
     * Recupera una categoria de acuerdo al paremetro recibido
     * @param id codigo bote
     * @return una categoria si existe uno con el codigo recibido como parametro
     */
    public Optional<Category> getCategory (int id){
        return categoryRepositoryCrud.findById(id);
    }

    /**
     * Ingresa la categoria nuevo
     * @param category categoria registrada
     * @return
     */

    public  Category save (Category category){
        return  categoryRepositoryCrud.save(category);
    }
}
