package com.boat.boat.InterfaceRepository;

import com.boat.boat.model.Client;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author Mariana
 */
public interface ClientRepositoryCrud extends CrudRepository<Client, Integer> {
}
