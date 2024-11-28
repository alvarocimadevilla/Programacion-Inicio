package es.daw.colecciones;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import es.daw.colecciones.model.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        
        //pruebasClonadoListaString();
        pruebasClonadoListaPersonas();

    }

    public static void pruebasClonadoListaString(){
        
        ArrayList<String> nombres = new ArrayList<>(); //siempre va a estar sin ordenar

        nombres.add("Marta");
        nombres.add("Luis");
        nombres.add("Francisco");

        System.out.println("Lista de nombres sin ordenar 1:");
        System.out.println(nombres);

        // ArrayList<String> nombres2 = nombres; // ni copia ni clona... es la misma lista
        // System.out.println("Lista de nombres sin ordenar 2:");
        // System.out.println(nombres2);

        // Collections.sort(nombres2);
        // System.out.println("Lista de nombres ordenados 2:");
        // System.out.println(nombres2);

        // System.out.println("Lista de nombres 1:");
        // System.out.println(nombres);

        System.out.println("************ CLONANDO ************");
        // Clonar la lista de cadenas
        ArrayList<String> nombres3 = (ArrayList<String>) nombres.clone();

        List<String> nombres4 = new ArrayList<String>(nombres);

        Collections.sort(nombres3);
        System.out.println("Lista de nombres 3 ordenado:");
        System.out.println(nombres3);
        System.out.println("Lista de nombres 1:");
        System.out.println(nombres);

        Collections.sort(nombres4);
        System.out.println("Lista de nombres 4 ordenado:");
        System.out.println(nombres3);
        System.out.println("Lista de nombres 1:");
        System.out.println(nombres);



    }

    public static void pruebasClonadoListaPersonas(){
        ArrayList<Persona> personas = new ArrayList<>();

        Persona p1 = new Persona("Pepe",20);
        Persona p2 = new Persona("Juan",10);
        Persona p3 = new Persona("Paco",40);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        System.out.println("************** Lista de personas original *******");
        personas.forEach(System.out::println);
        System.out.println("*********************************************");

        //ArrayList<Persona> personas2 = personas; //Esto no es un copiado ni clonado y si ordeno uno afecta al otro

        // FORMA 1 CLONADO: clona la lista pero NO los objetos de la lista
        // ArrayList<Persona> personas2 = (ArrayList<Persona>) personas.clone();
        //personas2.sort(Comparator.naturalOrder());

        // FORMA 2 CLONADO: clona la lista y los objetos de la lista
        //ArrayList<Persona> personas2 = deepCloneArtesanal(personas);

        // FORMA 3 CLONADO: con interface Clonable
        ArrayList<Persona> personas2 = null;
        try {
            personas2 = deepClone(personas);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        if (personas2 != null){
            System.out.println("*********************************************");
            System.out.println("* Lista de personas 2:");
            personas2.forEach(System.out::println);
            System.out.println("*********************************************");

            System.out.println("************** Lista de personas original *******");
            personas.forEach(System.out::println);
            System.out.println("*********************************************");

            p2.setNombre("Juan MODIFICADO!!!!");

            System.out.println("*********************************************");
            System.out.println("***********UNA VEZ MODIFICADA UNA PERSONA ***");
            System.out.println("*********************************************");
            System.out.println("************** Lista de personas original ***");
            personas.forEach(System.out::println);
            System.out.println("************** Lista de personas clonada ***");
            personas2.forEach(System.out::println);
            System.out.println("*********************************************");
            
        }
    }

    public static ArrayList<Persona> deepCloneArtesanal(ArrayList<Persona> personas){
        ArrayList<Persona> personasClonadas = new ArrayList<>();

        for (Persona p : personas) {
            personasClonadas.add(new Persona(p.getNombre(),p.getEdad()));
        }

        return personasClonadas;
    }

    public static ArrayList<Persona> deepClone(ArrayList<Persona> personas) throws CloneNotSupportedException{
        ArrayList<Persona> personasClonadas = new ArrayList<>();

        for (Persona p : personas) {
            personasClonadas.add(p.clone());
        }

        return personasClonadas;
    }
}
