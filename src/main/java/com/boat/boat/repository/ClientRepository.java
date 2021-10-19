package com.boat.boat.repository;

import com.boat.boat.InterfaceRepository.ClientRepositoryCrud;
import com.boat.boat.model.Category;
import com.boat.boat.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Mariana
 */
@Repository
public class ClientRepository {
    @Autowired
    private ClientRepositoryCrud clientRepositoryCrud;

    /**
     * Retorna la lista de clientes
     * @return
     */
    public List<Client> getAll(){
        return (List<Client>) clientRepositoryCrud.findAll();
    }

    /**
     * Recupera un elemento de la lista clientes de acuerdo al parametro solicitado
     * @param id
     * @return un clliente si existe el parametro solicitado.
     */
    public Optional <Client> getClient(int id){
        return clientRepositoryCrud.findById(id);
    } //optional es para evitar el error cuando se intenta acceder a algo que no existe

    /**
     * Guarda un nuevo elemento de la lista clientes
     * @param client
     * @return
     */
    public Client save (Client client){
        return  clientRepositoryCrud.save(client);
    }


}
