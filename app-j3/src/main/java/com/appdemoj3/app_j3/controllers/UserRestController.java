package com.appdemoj3.app_j3.controllers;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdemoj3.app_j3.models.User;
import com.appdemoj3.app_j3.models.dto.UserDto;

@RestController
@RequestMapping("/v2/api") // esta es la ruta o url para cada controlador

public class UserRestController {

    
/*     @GetMapping("/details")
    public Map<String,Object> details(){
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Desarrollando con Spring boot CreativeCode");
        body.put("author", "Johlver Pardo");
        return body;
    } */


    // Aqui retorno la clase user con los datos que creo de la instancia del objeto user
/*     @GetMapping("/details")
    public Map<String,Object> details(){

    User user = new User("Johlver","Pardo");
    
    Map<String,Object> body = new HashMap<>();
    body.put("title", "Desarrollando con Spring boot CreativeCode");
    body.put("user", user);
    return body;
} */
    // Este get mapping obtendra los datos de la clase 
/*     @GetMapping("/details")

    public UserDto details(){
    // Instancia del dto
    UserDto userDto = new UserDto();
    // Intsnacia de user con sus datos
    User user = new User("Johlver" , "Pardo");

    // Asignacion de valores a userDto
    userDto.setTitle("Desarrollando con Spring boot CreativeCode");
    userDto.setUser(user); // Asignar a la variable user de tipo user la instancia user creada
    return userDto;
        
    } */

    // RETORNAR UNA LISTA DE OBJETOS DE LA CLASE USER

/*     @GetMapping("/list-details")
        public List<User> listdetails(){

        User user = new User("Juan","Perez");
        User userA = new User("Camilo","Hernandez");
        User userB = new User("Martha","Estupiñan");

        List<User> lstUsers = new ArrayList<>();

        lstUsers.add(user);
        lstUsers.add(userA);
        lstUsers.add(userB);

        return lstUsers;

        } */

        // Lo mismo pero usando as list
/* 
        @GetMapping("/list-array-details")
        public List<User> listarraydetails(){
        User user = new User("Juan","Perez");
        User userA = new User("Camilo","Hernandez");
        User userB = new User("Martha","Estupiñan");
        List<User> lstUsers = Arrays.asList(user,userA,userB);
        return lstUsers;
        } */
}
