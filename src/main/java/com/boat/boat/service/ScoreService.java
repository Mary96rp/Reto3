package com.boat.boat.service;

import com.boat.boat.model.Score;
import com.boat.boat.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mariana
 */
@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    /**
     * Retorno de listado de Calificaciones
     * @return lista de Calificaciones
     */
    public List<Score> getAll(){
        return scoreRepository.getAll();
    }

    /**
     * Metodo para guardar nuevo Calificaciones y no generar el error de ingresar un nuevo id
     * @param score Calificacion
     * @return que se guardo Calificaciones
     */
    public Score save(Score score){
        if (score.getId()== null) {
            return scoreRepository.save(score);
        }else {
            Optional<Score> myScore = scoreRepository.getScore(score.getId());
            if(myScore.isEmpty()){
                return scoreRepository.save(score);
            }else{
                return score;
            }
        }

    }
}
