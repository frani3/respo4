package com.seccion4.respo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion4.respo4.model.Persona;

@Repository
public class PersonaRepository {
    private List<Persona> personas = new ArrayList<>();

    PersonaRepository(){
        personas.add(new Persona(1, "4564", "Frani", "Kirby", 20));
        personas.add(new Persona(2, "2345", "Carlos", "Pérez", 30));
        personas.add(new Persona(3, "6789", "Ana", "Gómez", 25));
        personas.add(new Persona(4, "1011", "Luis", "Martínez", 40));
        personas.add(new Persona(5, "1213", "María", "Sánchez", 35));
    }

    public Persona create(Persona persona){
        personas.add(persona);
        System.out.println(personas.toString());
        return persona;
    }


    public List<Persona> readAll(){
        return personas;
    }

    public Persona read(int id){
        for (Persona persona : personas){
            if(persona.getId()==id){
                return persona;
            }
        }
        return null;

        
    }


}
