package com.boat.boat.controller;


import com.boat.boat.model.Reservation;
import com.boat.boat.service.ReservationService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mariana
 */
@RestController
@RequestMapping("/Reservation")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST} )
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    /**
     * Obtiene la lista de reservaciones
     * @return la lista de reservaciones
     */
    @GetMapping("/all")
    public List<Reservation> getReservations() {
        return reservationService.getAll();
    }

    /**
     * Guardar una reservacion nueva
     * @param reservation guardada
     * @return codigo de exito
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation) {
        return reservationService.save(reservation);
    }
}
