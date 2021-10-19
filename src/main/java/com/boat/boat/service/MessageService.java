package com.boat.boat.service;

import com.boat.boat.model.Client;
import com.boat.boat.model.Message;
import com.boat.boat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){
        return messageRepository.getAll();

    }
    public Message save(Message message){
        if (message.getIdMessage() == null) {
            return messageRepository.save(message);
        } else {
            Optional<Message> myMessage = messageRepository.getMessage(message.getIdMessage());
            if (myMessage.isEmpty()) {
                return messageRepository.save(message);
            } else {
                return message;
            }
        }

    }
}
