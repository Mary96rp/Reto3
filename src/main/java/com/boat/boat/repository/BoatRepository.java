package com.boat.boat.repository;

import com.boat.boat.InterfaceRepository.BoatRepositoryCrud;
import com.boat.boat.model.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 * @author Mariana
 */
@Repository
public class BoatRepository {
    @Autowired
    private BoatRepositoryCrud boatRepositoryCrud;

    /**
     * Recupera los registro de la tabla botes
     * @return listado de botes
     */
    public List<Boat> getAll(){
        return (List<Boat>) boatRepositoryCrud.findAll();

    }

    /**
     * Recupera un bote de acuerdo al paremetro recibido
     * @param id codigo bote
     * @return un bote si existe uno con el codigo recibido como parametro
     */
    public Optional<Boat> getBoat (int id){
        return boatRepositoryCrud.findById(id);
    }

    /**
     * Ingresa el bote nuevo
     * @param boat el bote registrado
     * @return el
     */

    public  Boat save (Boat boat){
        return  boatRepositoryCrud.save(boat);
    }

}

