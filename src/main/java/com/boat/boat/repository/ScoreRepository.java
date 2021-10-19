package com.boat.boat.repository;

import com.boat.boat.InterfaceRepository.ScoreRepositoryCrud;
import com.boat.boat.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mariana
 */
@Repository
public class ScoreRepository {
    @Autowired
    private ScoreRepositoryCrud scoreRepositoryCrud;

    /**
     * Recupera los registro de la tabla Calificacion
     * @return listado de Calificacion
     */
    public List<Score> getAll(){
        return (List<Score>) scoreRepositoryCrud.findAll();
    }

    /**
     * Recupera un bote de acuerdo al paremetro recibido
     * @param id codigo calificacion
     * @return auna calificacion si existe uno con el codigo recibido como parametro
     */
    public Optional<Score> getScore(int id){
        return scoreRepositoryCrud.findById(id);
    }

    /**
     * Ingresa una calificacion nueva
     * @param score calificacion registrada
     * @return que la calificacion fue guardad con exito
     */
    public Score save(Score score){
        return scoreRepositoryCrud.save(score);
    }
}
