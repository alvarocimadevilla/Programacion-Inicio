package es.daw.poo2.empleados.model;

/**
 *
 * @author melol
 */
public class Directivo extends Empleado{

    public Directivo() {
    }

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}