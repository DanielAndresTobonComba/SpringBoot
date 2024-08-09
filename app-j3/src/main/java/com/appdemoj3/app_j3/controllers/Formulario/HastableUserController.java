package com.appdemoj3.app_j3.controllers.Formulario;

import java.util.Hashtable;

import com.appdemoj3.app_j3.models.User;

public class HastableUserController {

    public static Hashtable<Integer , User> userList;

    private static HastableUserController INSTANCE = new HastableUserController();

    private HastableUserController () {

        userList = new Hashtable<>();

/*         User user = new User();
        user.setNombre("Daniel");
        user.setApellido("Tobon");
        user.setCedula("1000240915"); */
    }

    public static HastableUserController getController () {

        return INSTANCE;
    }

    

}
