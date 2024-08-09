package com.appdemoj3.app_j3.controllers.Formulario;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appdemoj3.app_j3.models.User;


@Controller 
@RequestMapping("/api/formulario")
@CrossOrigin (origins = "*")

public class FormularioController {

    private static Hashtable<String, User> userList = new Hashtable<>();
    List<User> foundUsers = new ArrayList<>();


    @GetMapping("/buscarUsuario")
    public User mostrarUsuario(@RequestParam String id) {
        System.out.println("Entre a buscar en el backend");

        // Itera sobre los usuarios y devuelve el primero que cumple la condición
        for (Map.Entry<String, User> entry : userList.entrySet()) {
            String key = entry.getKey();
            if (key.equals(id)) {
                return entry.getValue(); // Devuelve el primer usuario que cumple la condición
            }
        }

        return null; // Devuelve null si no se encuentra ningún usuario
    }

}
