package es.daw.poo2.empleados.model;

/**
 *
 * @author melol
 */
public class Operario extends Empleado{

    private int codOperario;

    public Operario(int codOperario, String nombre) {
        super(nombre);
        this.codOperario = codOperario;
    }
    
    //constructor con un parámetro
    public Operario(String nombre) {
        super(nombre);
    }

    //constructor por defecto
    public Operario() {
    }

    //modificación del método toString() para mostrar el mensaje adecuado                                         
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
    
}