package com.appdemoj3.app_j3.controllers;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdemoj3.app_j3.models.User;
import com.appdemoj3.app_j3.models.dto.ParamsDto;


// AQUI SE RECIBE SOLO UNA VARIABLE 
@RestController 
@RequestMapping("/api/demovar")

public class PahtVariableController {

   

    
    

/*     @GetMapping("/saludo/{message}")
    public ParamsDto saludo(@PathVariable String message) {
        ParamsDto param = new ParamsDto(); 
        param.setMessage(message);
        return param;
    } */

    // POSTMAPPING RECIBE INFORMACION Y RETORNA UNA RESPUESTA 
    // REQUESTBODY TOMA EL JSON Y LO SERIALIZA Y LO CONVIERTE A LA CLASE USER




    @PostMapping("/guardarDatos")
    public User createproduct(@RequestBody User user){

/*     user.setNombre(user.getNombre());
    user.setApellido(user.getApellido());
    user.setCedula(user.getCedula()); */

    Hashtable<String,User> lst = HastableUserController.getController().userList;

    lst.put(user.getCedula() , user);

    System.out.println("llegue al fetch");

    return user;
}

}
