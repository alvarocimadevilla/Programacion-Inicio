package es.daw.poo2.empleados.model;


/**
 *
 * @author melol
 */
public class Tecnico extends Operario {

    private String especialidad;

    public Tecnico() {
    }

    public Tecnico(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }

}
