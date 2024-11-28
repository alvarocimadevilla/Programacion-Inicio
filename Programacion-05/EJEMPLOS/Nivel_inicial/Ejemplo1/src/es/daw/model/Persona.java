package es.daw.model;

public class Persona {

    // ---------------------------------
    // ATRIBUTOS
    private String nombre;
    private String profesion;

    // public String nombre;
    // public String profesion;

    // ---------------------------------
    // CONSTRUCTORES
    // He tenido que crear el constructor por defecto porque he creado un
    // constructor con argumentos
    public Persona() {
    }

    public Persona(String profesion) {
        this.profesion = profesion;
    }

    public Persona(String nombre, String profesion) {
        this.nombre = nombre;
        this.profesion = profesion;
    }

    // ---------------------------------
    // MÉTODOS SETTERS & GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    // ---------------------------------
    // MÉTODOS DE COMPORTAMIENTO
    public void nacer() {
        System.out.println("Ha nacido " + nombre);
    }

    public void hablar() {
        System.out.println("Estoy hablando");
    }

    public void caminar() {
        System.out.println("Me voy a dar un paseito");
    }

    public void morir() {
        System.out.println("Oh! ha muerto " + nombre);
    }

    // ---------------------------------
    // MÉTODOS QUE SOBREESCRIBEN A MÉTODOS HEREDADOS DE OBJECT
}
