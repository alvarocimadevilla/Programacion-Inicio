package es.daw.colecciones.model;

public class Golosina extends Chuche{
    private String nombre;

    public Golosina(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Golosina [nombre=" + nombre + "]";
    }
    
    
}
