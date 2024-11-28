package es.daw.poo;

import java.util.ArrayList;

import es.daw.poo.dao.PersonaDAO;
import es.daw.poo.model.Persona;

public class Actividad1 {
    public static void main(String[] args) throws Exception {
        PersonaDAO dao = new PersonaDAO();

        ArrayList<Persona> personas = dao.select();

        for (Persona persona : personas) {
            System.out.println(persona);
            
        }

        System.out.println("Personal que no ha pasado la validación:");
        for (Persona persona : personas) {
            if (!persona.validar())
                System.out.println(persona);
        }
        
        
    }
}
