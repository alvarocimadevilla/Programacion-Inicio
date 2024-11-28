package es.daw;

import es.daw.model.Persona;

public class Ejemplo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejecuto el ejemplo 1");

        // -----------------------------------------------
        // 1.CREACIÓN DE UN OBJETO PERSONA CON CONSTRUCTOR VACÍO.
        // LOS DATOS DE LA PERSONA LOS HE ASIGNADO CON LOS SETTERS CORRESPONDIENTES
        Persona persona1 = new Persona();

        // Solo lo puedo usar si los atributos son públicos
        // persona1.nombre="Pepe";
        // persona1.profesion="Cantante";

        persona1.setNombre("Pepe");
        persona1.setProfesion("Cantante");

        persona1.nacer();
        persona1.caminar();
        persona1.hablar();
        persona1.morir();

        // -----------------------------------------------
        // 2. CREACIÓN DE UN OBJETO PERSONA CON UN CONSTRUCTOR COMPLETO.
        // PARA ELLO UTILIZO EL CONSTRUCTOR APROPIADO
        Persona persona2 = new Persona("Juanito", "actor");

        persona2.nacer();
        persona2.hablar();
        persona2.morir();

        // -----------------------------------------------
        // 3. CREACIÓN DE UN OBJETO PERSONA CON UN CONSTRUCTOR CON SOLO LA PROFESIÓN
        Persona persona3 = new Persona("Programador de Java en VSC");
        persona3.setNombre("Menganito");

        persona3.nacer();


    }
}
