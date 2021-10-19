package com.boat.boat.controller;
import com.boat.boat.model.Category;
import com.boat.boat.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author Mariana
 */
@RestController //los servicios get, post, put, deleate
@RequestMapping("/Category")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST} )
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * obtener toda la informacion de la tabla
     * @return la tabla de categoria
     */
    @GetMapping("/all")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    /**
     * Guardar la nueva categoria
     * @param category ingresada
     * @return codigo de exito
     */

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return  categoryService.save(category);
    }


}
