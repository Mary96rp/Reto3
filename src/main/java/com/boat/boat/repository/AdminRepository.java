package com.boat.boat.repository;

import com.boat.boat.InterfaceRepository.AdminRepositoryCrud;
import com.boat.boat.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mariana
 */
@Repository
public class AdminRepository {

    @Autowired
    private AdminRepositoryCrud adminRepositoryCrud;

    /**
     * Recupera los registros de la tabla Administradores
     * @return
     */
    public List<Admin> getAll(){
        return (List<Admin>) adminRepositoryCrud.findAll();
    }

    /**
     * Recupera el Admin de acuerdo al id
     * @param id
     * @return el administrador de acuerdo al id
     */
    public Optional<Admin> getAdmin(int id){
        return adminRepositoryCrud.findById(id);
    }

    /**
     * Ingresa un Administrador nuevo
     * @param admin
     * @return
     */
    public Admin save (Admin admin){
        return adminRepositoryCrud.save(admin);
    }
}
