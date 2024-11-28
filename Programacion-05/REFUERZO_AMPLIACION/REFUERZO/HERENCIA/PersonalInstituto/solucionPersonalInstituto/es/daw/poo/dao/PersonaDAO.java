package es.daw.poo.dao;


import java.util.ArrayList;

import es.daw.poo.model.*;

public class PersonaDAO {

    private final ArrayList<Persona> personas;

    public PersonaDAO(){
        personas = new ArrayList<>();
        personas.add(new Profesor("Mari Luz", "Donde vive melola", 1));
        personas.add(new EstudianteInternacional("Elon Musk", "Donde vive Elon", "12345678A","España"));
        personas.add(new Profesor("Chema", "Donde vive Chema", 20));
        personas.add(new Estudiante("Luis Maeso","Donde vive Luis", "12345678B"));
        personas.add(new EstudianteInternacional("Mark Zuckerberg","Donde vive Mark","12345678C", "Marruecos"));
        personas.add(new Estudiante("Scarlett Johansson", "Donde vive Scarlett","A234"));
    }

    public ArrayList<Persona> select(){
        return (ArrayList<Persona>) personas.clone();
    }
    
}
