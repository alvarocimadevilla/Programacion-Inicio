package es.daw.practicaguiadapoo;

import java.util.Scanner;

import es.daw.practicaguiadapoo.model.Persona;
import es.daw.practicaguiadapoo.util.Utils;

public class PracticaGuiadaPOO {

    public static Scanner lectorCadena = new Scanner(System.in);
    public static Scanner lectorEnteros = new Scanner(System.in);

    public static void main(String[] args) {

        // Llamar a un método para cargar personas....
        /*
         * Persona[] personas = Utils.cargarPersonas();
         * 
         * for (Persona persona : personas) {
         * System.out.println(persona.toString());
         * 
         * }
         */
        // ------------------------------

        Persona persona1 = new Persona("51519669Z", "Ivan", "Izquierdo Castillo", 18);
        //System.out.println("Valor contador p1:"+Persona.getContador());
        System.out.println("Valor contador p1:"+persona1.getContador());
        Persona persona2 = new Persona("45542552Y", "Felix", "Izquierdo Castillo",22);
        //System.out.println("Valor contador p2:"+Persona.getContador());
        System.out.println("Valor contador p2:"+persona2.getContador());
        Persona persona3 = new Persona("63368998T", "Paula", "Castillo Rodrigo", 12);
        //System.out.println("Valor contador p3:"+Persona.getContador());
        System.out.println("Valor contador p3:"+persona3.getContador());
        Persona persona4 = new Persona("78875115H", "Juan", "Castillo Vela", 79);
        //System.out.println("Valor contador p4:"+Persona.getContador());
        System.out.println("Valor contador p4:"+persona4.getContador());

        // PRUEBAS CON EL NIF QUE ES FINAL
        // Persona persona1 = new Persona("51519669Z", "Ivan", "Izquierdo Castillo", 18, "11111111A");
        // Persona persona2 = new Persona("45542552Y", "Felix", "Izquierdo Castillo", 22, "11111111A");
        // Persona persona3 = new Persona("63368998T", "Paula", "Castillo Rodrigo", 12, "11111111A");
        // Persona persona4 = new Persona("78875115H", "Juan", "Castillo Vela", 79, "11111111A");

        persona1.setNombre("MARI PURI");

        System.out.println("LA MAYORÍA DE EDAD EN ESPAÑA ES:" + Persona.MAYOR_EDAD);

        persona1.imprime();
        persona2.imprime();

        if (persona1.esMayorEdad())
            System.out.println(persona1.getNombre() + " es mayor de edad");
        else
            System.out.println(persona1.getNombre() + " no es mayor de edad");

        if (persona3.esMayorEdad())
            System.out.println(persona3.getNombre() + " es mayor de edad");
        else
            System.out.println(persona3.getNombre() + " no es mayor de edad");

        if (persona4.esJubilado())
            System.out.println(persona4.getNombre() + " esta jubilado");
        else
            System.out.println(persona4.getNombre() + " no esta jubilado");

        System.out.println("La diferencia de edad entre " + persona2.getNombre() + " y " + persona4.getNombre() + " es "
                + persona4.diferenciaEdad(persona2));


        // ARRAY DE OBJETOS PERSONA
        Persona[] personas = new Persona[4];
        personas[0]=persona1;
        personas[1]=persona2;
        personas[2]=persona3;
        personas[3]=persona4;
        System.out.println("Pintando mi array:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        Persona[] estudiantes = {persona1,persona2,persona3,persona4};
        System.out.println("Pintando mis estudiantes:");
        for (Persona p : estudiantes) {
            System.out.println(p);
        }

        Utils.cambiarEdadByName(estudiantes, "Paula", 18);

        System.out.println("Comprobando que Paula ha cambiado su edad:");
        System.out.println(persona3);

        for (Persona p : estudiantes) {
            System.out.println(p);
        }

        // Probando a copiar objetos (quiero copiar a Paula)
        Persona personaCopiada = persona3; // el objeto persona3 es Paula

        //Persona personaClonada = persona.clone // pendiente ... clonar objetos!!!

        System.out.println("Esta es paula:"+persona3);
        System.out.println("El clon de Paula:"+personaCopiada);
        personaCopiada.setApellidos("García García");
        System.out.println("Esta es paula:"+persona3);
        System.out.println("El clon de Paula:"+personaCopiada);



    }


}
