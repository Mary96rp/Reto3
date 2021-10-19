package com.boat.boat.repository;

import com.boat.boat.InterfaceRepository.ReservationRepositoryCrud;
import com.boat.boat.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mariana
 */
@Repository
public class ReservationRepository {
    @Autowired
    private ReservationRepositoryCrud reservationRepositoryCrud;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationRepositoryCrud.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return reservationRepositoryCrud.findById(id);
    }
    public Reservation save(Reservation reservation){
        return reservationRepositoryCrud.save(reservation);
    }


}
