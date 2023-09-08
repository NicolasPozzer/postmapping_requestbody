
package com.demo.postmapping_requestbody.controller;

import com.demo.postmapping_requestbody.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AplicacionController {
    
    @PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cli){
        System.out.println("Cliente Creado");
        System.out.println("Nombre: "+cli.getNombre());
        System.out.println("Apellido: "+cli.getApellido());
    }
    
}
