package es.daw.colecciones;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.daw.colecciones.model.Persona;


public class App {

    static List<Persona> listaPersonas = new ArrayList<>();

    public static void main(String[] args){
        

        listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        listaPersonas.add(new Persona("34567890Z", "Ana", "Elola", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1992, 3, 4)));
        
        //Borro la persona
        borrarPersona("Juan");

        // Muestro la lista tras borrar a la persona
        listaPersonas.forEach(System.out::println);


    }

    public static void borrarPersona(String nombre){
        // // Forma 1: artesanal
        // for (Persona persona : listaPersonas) {
        //     if (persona.getNombre().equalsIgnoreCase(nombre)){
        //         listaPersonas.remove(persona); // java.util.ConcurrentModificationException
        //     }
        // }

        // Forma 2: con método remove, pero necesito saber la posición o tener el objeto...
        // Persona p = new Persona();
        // p.setNombre(nombre);
        // System.out.println("posicion: "+listaPersonas.indexOf(p));

        // listaPersonas.remove(p);

        // Forma 3: El interface Iterator dispone de un método adicional 
        // que permite eliminar objetos de una lista mientras la recorremos (el método remove) 

        // Cuidadín con el Iterator que importemos!!!! que sea del paquete java.util!!!!
        Iterator<Persona> it = listaPersonas.iterator();
        while (it.hasNext()) {
          Persona p = it.next();
          if (p.getNombre().equalsIgnoreCase("Juan")) {
            it.remove();
          }
        }        

    }
}
