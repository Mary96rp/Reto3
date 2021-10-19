package com.boat.boat.service;

import com.boat.boat.model.Boat;
import com.boat.boat.repository.BoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mariana
 */
@Service
public class BoatService {
     @Autowired
    private BoatRepository boatRepository;

    /**
     * Retorno de listado de Botes
     * @return lista de botes
     */
    public List<Boat> getAll(){
        return boatRepository.getAll();
    }

    /**
     * Metodo para guardar nuevo bote y no generar el error de ingresar un nuevo id
     * @param boat
     * @return que se guardo bote
     */
    public Boat save(Boat boat){
        if (boat.getId()== null) {
            return boatRepository.save(boat);
        }else {
            Optional<Boat> myBoat = boatRepository.getBoat(boat.getId());
            if(myBoat.isEmpty()){
                return boatRepository.save(boat);
            }else{
                return boat;
            }
        }

    }


}
