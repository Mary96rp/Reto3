package com.boat.boat.repository;

import com.boat.boat.InterfaceRepository.MessageRepositoryCrud;
import com.boat.boat.model.Category;
import com.boat.boat.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mariana
 */
@Repository
public class MessageRepository {
    @Autowired
    private MessageRepositoryCrud messageRepositoryCrud;

    /**
     * Recupera los registro de la tabla Mensaje
     * @return listado de mensajes
     */
    public List<Message> getAll(){
        return (List<Message>) messageRepositoryCrud.findAll();

    }

    /**
     * Recupera una mensaje de acuerdo al paremetro recibido
     * @param id codigo mensaje
     * @return una mensaje si existe uno con el codigo recibido como parametro
     */
    public Optional<Message> getMessage (int id){
        return messageRepositoryCrud.findById(id);
    }

    /**
     * Ingresa la mensaje nuevo
     * @param  message registrada
     * @return
     */

    public  Message save (Message message){
        return  messageRepositoryCrud.save(message);
    }
}
