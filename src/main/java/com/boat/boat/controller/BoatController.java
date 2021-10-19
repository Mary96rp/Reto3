package com.boat.boat.controller;

import com.boat.boat.model.Boat;
import com.boat.boat.service.BoatService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author Mariana
 */
@RestController //los servicios get, post, put, deleate
@RequestMapping("/Boat")  //define parte de la url, va despues del path (api), entrada a la tabla boat
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST} )
public class BoatController {
    @Autowired
    private BoatService boatService;

    @GetMapping("/all")
    public List<Boat> getAll() {
        return boatService.getAll();
    } //obtener toda la informacion de la tabla


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Boat save(@RequestBody Boat boat){
        return  boatService.save(boat);
    }



}
