package com.appdemoj3.app_j3.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.appdemoj3.app_j3.models.dto.ParamsDto;

@RestController
@RequestMapping("api/params")

 public class RequestParamController {

    @GetMapping("/foo")
    public ParamsDto foot(@RequestParam(required = false, defaultValue = "Hola Mundo") String message) {
        
    ParamsDto param = new ParamsDto();
    param.setMessage(message);
    return param;
    } 




    // RETORNA LOS PARAMETROS QUE LLEGAN Y ESPECIFICAR CUAL TOMO EN CADA PARAMETRO Y SI NO SE ENVIA EL PARAMETRO ID ENTONCE DEVULEVO UNO POR DEFECTO
    // http://localhost:8080/api/params/user?id=abc&name=daniel
    @GetMapping("/user")
    @ResponseBody
    public String user(@RequestParam(name = "id" , defaultValue = "World") String fooId, @RequestParam String name) {
    return "Id:" + fooId + "  Nombre: " + name;
    } 

} 



