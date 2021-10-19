package com.boat.boat.InterfaceRepository;

import com.boat.boat.model.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Mariana
 */
public interface MessageRepositoryCrud extends CrudRepository<Message, Integer> {
}
