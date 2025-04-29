package com.seccion4.respo4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion4.respo4.model.Persona;
import com.seccion4.respo4.service.PersonaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RequestMapping("/api/personas")

@RestController

public class PersonaController {
    @Autowired
    private PersonaService personaService;
    
    // Aquí puedes definir los métodos para manejar las solicitudes HTTP (GET, POST, PUT, DELETE)
    // y realizar las operaciones necesarias con la entidad Persona.
    

    @GetMapping
    public String saludar()
    {
        return "Hola";
    } 

    @PostMapping
    public Persona guardar(@RequestBody Persona persona){
        return personaService.guardarPersona(persona);
    } 
    
}
