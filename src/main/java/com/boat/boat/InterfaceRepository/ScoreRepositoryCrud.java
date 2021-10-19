package com.boat.boat.InterfaceRepository;

import com.boat.boat.model.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mariana
 */
public interface ScoreRepositoryCrud extends CrudRepository<Score, Integer> {
}
