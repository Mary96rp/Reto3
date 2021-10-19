package com.boat.boat.controller;


import com.boat.boat.model.Score;
import com.boat.boat.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Mariana
 */
@RestController
@RequestMapping("/Score")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST} )
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    /**
     * obtiene las calificaciones
     * @return  la lista de calificaciones
     */
    @GetMapping("/all")
    public List<Score> getAll() {
        return scoreService.getAll();
    }

    /**
     * Guarda una nueva calificacion
     * @param score del servicio
     * @return codigo de exito
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save(@RequestBody Score score){
        return  scoreService.save(score);
    }

}
