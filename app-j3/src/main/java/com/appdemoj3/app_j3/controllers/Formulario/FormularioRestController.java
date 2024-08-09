package com.appdemoj3.app_j3.controllers.Formulario;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appdemoj3.app_j3.models.User;

import ch.qos.logback.core.model.Model;

@RestController 
@RequestMapping("/formulario")
@CrossOrigin (origins = "*")

public class FormularioRestController {

    int autoincremental = 0;

    

    List<User> foundUsers = new ArrayList<>();

    @PostMapping("/guardarUsuario")
    public String crearUsuario(@RequestBody User user) {

        autoincremental++;

        User userA = new User(); 

        userA.setNombre(user.getNombre()); 
        userA.setApellido(user.getApellido()); 
        userA.setCedula(user.getCedula()); 
        HastableUserController.getController().userList.put(autoincremental, userA);

        Hashtable<Integer, User> ht = HastableUserController.getController().userList;

        System.out.println("Creado exitosamente");

        for (Map.Entry<Integer, User> entry : ht.entrySet()) {
            int key = entry.getKey();
            System.out.println(ht.get(key)); 
        }

        return "ok";
    }



    @GetMapping("/buscarUsuario/{id}")
    public User mostrarUsuario(@PathVariable int id) {

        Hashtable<Integer, User> ht = HastableUserController.getController().userList;
        
        System.out.println("Entre a buscar en el backend");

        return ht.get(id);
        
        
        

    }
    
    
    
}
