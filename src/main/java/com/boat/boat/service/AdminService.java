package com.boat.boat.service;

import com.boat.boat.model.Admin;
import com.boat.boat.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mariana
 */
@Service
public class AdminService {

    @Autowired
    public AdminRepository adminRepository;

    /**
     * Retorno lista de Administradores
     * @return la lista de administradores
     */
    public List<Admin> getAll(){
        return adminRepository.getAll();
    }

    /**
     * Metodo para guardar nuevo Admi y no generar el error de ingresar un nuevo id
     * @param admin de la lista de Administradores
     * @return codigo de exito
     */

    public Admin save(Admin admin){
        if (admin.getIdAdmin()== null) {
            return adminRepository.save(admin);
        }else {
            Optional<Admin> myAdmi = adminRepository.getAdmin(admin.getIdAdmin());
            if(myAdmi.isEmpty()){
                return adminRepository.save(admin);
            }else{
                return admin;
            }
        }

    }


}
