package es.daw.poo;

import java.util.ArrayList;

import es.daw.poo.dao.*;
import es.daw.poo.model.*;


public class Actividad1 {
    public static void main(String[] args) throws Exception {
        
        PersonaDAO dao = new PersonaDAO();
        
        ArrayList<Persona> personas = new ArrayList<>();

        personas = dao.select();

        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
        
        System.out.println("** COMPROBAMOS LOS QUE NO HAN PASADO LA VALIDACIÓN:");

        for (Persona persona : personas) {
            if (!persona.validar()) {
                System.out.println(persona.toString());
            }
        }
    }
}
