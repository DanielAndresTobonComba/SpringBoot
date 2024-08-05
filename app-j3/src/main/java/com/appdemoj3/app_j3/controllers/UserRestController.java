package com.appdemoj3.app_j3.controllers;
import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdemoj3.app_j3.models.User;

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
    @GetMapping("/details")
    public Map<String,Object> details(){

    User user = new User("Johlver","Pardo");
    
    Map<String,Object> body = new HashMap<>();
    body.put("title", "Desarrollando con Spring boot CreativeCode");
    body.put("user", user);
    return body;
}
    

}
