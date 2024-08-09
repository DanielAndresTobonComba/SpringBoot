package com.appdemoj3.app_j3.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.appdemoj3.app_j3.models.User;

@Controller

public class ListController {

    @GetMapping("/list")
    public String list(ModelMap model) {

        List<User> lstUsers = Arrays.asList(
                new User("Carlos", "Perez", "123124"),
                new User("Martha", "Sanchez", "123124"),
                new User("Vicente", "Camargo", "123123"));

        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", lstUsers); // El user es el nombre que usamos para llamarlo en el html.

        return "list"; // Retorna todo dentro del @GetMapping("/list").
    }

    // DEVOLVER SOLO LA LST USERS

    /*
     * @GetMapping("/list")
     * 
     * public List<User> list(Model model){
     * 
     * System.out.println("Entre a java");
     * 
     * List<User> users = Arrays.asList(
     * new User("Carlos", "Perez" , "carlos@gmail.com"),
     * new User("Martha","Sanchez" , "martha@gmail.com"),
     * new User("Vicente","Camargo" , "camargo@gmal.com")
     * );
     * 
     * model.addAttribute("title", "Listado de Usuarios");
     * model.addAttribute("users", users);
     * return users;
     * }
     */

}
