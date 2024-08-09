package com.appdemoj3.app_j3.controllers;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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

/*     @GetMapping("/details")
    public String details(Model model){

    User user = new User("Johlver","Pardo");

    model.addAttribute("title", "Desarrollando con Spring boot CreativeCode");
    model.addAttribute("user", user);
    return "details";
  
    } */


    // MAPEAR CON LOS IF
    @GetMapping("/details")
    public String details(Model model){
    User user = new User();
    user.setNombre("Daniel Andres");
    user.setApellido("Tobon Comba");
    //user.setEmail("jjpardo2002@gmail.com"); //Email del usuario
    model.addAttribute("title", "Desarrollando con Spring boot CreativeCode");
    model.addAttribute("user", user);
    return "details"; 
}


    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = Arrays.asList( 
        new User("Carlos", "Perez" , null),
        new User("Martha","Sanchez" , "martha@gmail.com"),
        new User("Vicente","Camargo" , "camargo@gmal.com")
        );
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);
        return "list";
    }


}
