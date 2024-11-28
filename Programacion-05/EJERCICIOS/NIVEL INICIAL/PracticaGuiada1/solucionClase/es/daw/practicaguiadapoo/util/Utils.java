package es.daw.practicaguiadapoo.util;

import es.daw.practicaguiadapoo.model.Persona;
import static es.daw.practicaguiadapoo.PracticaGuiadaPOO.lectorEnteros;
import static es.daw.practicaguiadapoo.PracticaGuiadaPOO.lectorCadena;

public class Utils {
    
    public static Persona[] cargarPersonas(){
        
        System.out.println("********* VAS A CARGAR PERSONAS **********");
        System.out.println("Cuántas personas vas a cargar?");
        int cantidadPersonas = lectorEnteros.nextInt();

        Persona[] personas = new Persona[cantidadPersonas];

        for (int i = 0; i < personas.length; i++) {
            // Recojo los datos de los atributos de la persona
            System.out.println("Información de la persona <"+(i+1)+">");
            System.out.println("\tIntroduce el DNI:");
            String DNI = lectorCadena.nextLine();
            System.out.println("\tIntroduce el nombre:");
            String nombre = lectorCadena.nextLine();
            System.out.println("\tIntroduce los apellidos:");
            String apellidos = lectorCadena.nextLine();
            System.out.println("\tIntroduce la edad:");
            int edad = lectorEnteros.nextInt();

            // // Creo el objeto persona
            // Persona p = new Persona(DNI, nombre, apellidos, edad);

            // // Añado la persona al array
            // personas[i] = p;

            // Añado la persona al array
            personas[i] = new Persona(DNI, nombre, apellidos, edad);
            //personas[i] = new Persona(DNI, nombre, apellidos, edad,"NIF");

            
        }     

        return personas;
    }

    public static void cambiarEdadByName(Persona[] personas, String name, int edadNueva){

        // Primero recorro el array para coger persona a persona
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(name)){
                persona.setEdad(edadNueva);
                break;
            }
        }

    }
}
