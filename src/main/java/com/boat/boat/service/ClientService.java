package com.boat.boat.service;

import com.boat.boat.model.Client;
import com.boat.boat.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mariana
 */
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Client save(Client client){
        if (client.getIdClient() == null) {
            return clientRepository.save(client);
        } else {
            Optional<Client> myClient = clientRepository.getClient(client.getIdClient());
            if (myClient.isEmpty()) {
                return clientRepository.save(client);
            } else {
                return client;
            }
        }
    }
}
