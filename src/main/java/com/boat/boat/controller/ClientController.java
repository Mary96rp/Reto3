package com.boat.boat.controller;

import com.boat.boat.model.Client;
import com.boat.boat.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Mariana
 */
@RestController
@RequestMapping("/Client")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST} )
public class ClientController {
    @Autowired
    private ClientService clientService;

    /**
     * Obtener la lista de clientes
     * @return la lista de clientes
     */
    @GetMapping("/all")
    public List<Client> getAll() {
        return clientService.getAll();
    }

    /**
     * Guardar un nuevo cliente
     * @param client guaradado
     * @return codigo de exito
     */

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client){
        return  clientService.save(client);
    }

}
