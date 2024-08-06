package com.appdemoj3.app_j3.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


/*     @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", defaultValue = "World")
    String name, Model model) {
    model.addAttribute("name", name);
    return "greeting";

    } */

    @GetMapping("/user")
    public String user(@RequestParam(name = "id", required = false) String id, Model
    model) {
    model.addAttribute("id", id);
    return "userProfile";
    }

} 



