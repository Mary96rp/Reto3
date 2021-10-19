package com.boat.boat.InterfaceRepository;

import com.boat.boat.model.Boat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 * @author Mariana
 */
public interface BoatRepositoryCrud extends CrudRepository<Boat, Integer> {

    @Query("SELECT c.year, COUNT(c.year) from Boat AS c group by c.year order by COUNT(c.year) DESC")
    public List<Object[]> countTotalBoatByYear();


}
