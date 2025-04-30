package com.seccion4.respo4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion4.respo4.model.Persona;
import com.seccion4.respo4.service.PersonaService;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RequestMapping("/api/personas")

@RestController

public class PersonaController {
    @Autowired
    private PersonaService personaService;
    
    // Aquí puedes definir los métodos para manejar las solicitudes HTTP (GET, POST, PUT, DELETE)
    // y realizar las operaciones necesarias con la entidad Persona.

    //AAAAAA
    

    @PostMapping
    public Persona postPersona(@RequestBody Persona persona){
        return personaService.guardarPersona(persona);
    }
    
    @GetMapping
    public List<Persona> getPersonas() {
        return personaService.listarPersonas();
    }
    
    @GetMapping("/{id}")
    public Persona getPersonaId(@PathVariable int id) {
        return personaService.buscarxId(id);
    }
    

    
}
