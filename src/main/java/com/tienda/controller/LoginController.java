/*

 */
package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    /*el slash lo que indica es que el local host esta vacio, entonces
    que ejecute el metodo public string index... */
    @GetMapping("/")//Aqui definimos la ruta que queremos
    public String index(){
        return "login";
    }
}
/*
login.html debe estar en la carpeta templates para que lo corra
*/
