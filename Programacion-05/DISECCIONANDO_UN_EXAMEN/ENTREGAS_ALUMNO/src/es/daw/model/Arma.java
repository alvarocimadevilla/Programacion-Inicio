package es.daw.model;

public class Arma {
    //ATRIBUTOS
    private String nombre;
    private int damage;

    private static int contador;

    //CONSTRUCTORES
    public Arma(String nombre, int damage) {
        this.nombre = nombre;
        this.damage = damage;
        contador++;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "Arma [nombre=" + nombre + ", damage=" + damage + "]";
    }

    
}
