package com.boat.boat.controller;

import com.boat.boat.model.Admin;
import com.boat.boat.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Mariana
 */

@RestController
@RequestMapping("/Admin")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST} )
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/all")
    public List<Admin> getAll() {
        return adminService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Admin save(@RequestBody Admin admin){
        return  adminService.save(admin);
    }

}
