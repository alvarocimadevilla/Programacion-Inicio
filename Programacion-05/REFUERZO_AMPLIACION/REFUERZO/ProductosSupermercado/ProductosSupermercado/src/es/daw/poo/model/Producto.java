package es.daw.poo.model;


public class Producto {
    // PROTECTED: permitirá a las clases hijas acceder a los atributos de la clase padre sin necesidad
    // de getter and setter
    
    // protected String nombre;
    // protected double precio;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

}
