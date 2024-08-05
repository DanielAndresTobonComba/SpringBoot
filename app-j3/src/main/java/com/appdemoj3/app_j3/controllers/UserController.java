package com.appdemoj3.app_j3.controllers;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.appdemoj3.app_j3.models.User;



@Controller

public class UserController {

    // ESTE ES EL END POINT

/*     @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("mensaje" , "heyyy");
        return "details"; // ESTE NOMBRE DEBE SER EL MISMO QUE EL DE LA VISTA
    } */

    // MODEL ES UNA ESTRUCTURA DE DATOS PARA PODER SER LLAMADAO Y CREAR ACCESO Y SALIDA A ESOS DATOS

    @GetMapping("/details")
    public String details(Model model){

    User user = new User("Johlver","Pardo");

    model.addAttribute("title", "Desarrollando con Spring boot CreativeCode");
    model.addAttribute("user", user);
    return "details";
  
    }

}
