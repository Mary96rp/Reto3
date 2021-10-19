package com.boat.boat.controller;

import com.boat.boat.model.Client;
import com.boat.boat.model.Message;
import com.boat.boat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Message")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST} )
public class MessageController {
    @Autowired
    private MessageService messageService;

    /**
     * Obtener la lista de mensajes
     * @return la lista de mensajes
     */
    @GetMapping("/all")
    public List<Message> getAll() {
        return messageService.getAll();
    }

    /**
     * Guardar un nuevo mensaje
     * @param message a guardar
     * @return codigo de exito
     */

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message message){
        return  messageService.save(message);
    }

}
