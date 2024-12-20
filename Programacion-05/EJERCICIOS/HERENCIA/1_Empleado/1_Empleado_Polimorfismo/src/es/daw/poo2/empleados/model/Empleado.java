package es.daw.poo2.empleados.model;

import java.util.Objects;

/**
 *
 * @author melol
 */
public class Empleado {

    private String nombre;

    //constructor por defecto
    public Empleado() {
        super();
    }

    //constructor con un parámetro
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    //método toString()
    //devuelve un String formado por la palabra “Empleado” y el nombre de empleado                                
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
