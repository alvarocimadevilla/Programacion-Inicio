package es.daw.poo2.productosperecederos.model;

import es.daw.poo2.productosperecederos.exceptions.CantidadIncorrectaException;

//public abstract class Producto implements  Exportable2XML{
public abstract class Producto implements  Exportable2XML, Comparable<Producto>{
    // ATRIBUTOS
    private String nombre;
    private double precio;

    // ------------------
    // CONSTRUCTOR/ES
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Si el enunciado dice: se pueden dar de alta en el sistema
    // productos con solo el nombre
    public Producto(String nombre) {
        this.nombre = nombre;
    }
    // -------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    // MÉTODOS DE COMPORTAMIENTO: funcionalidades
    public double calcular(int cantidad) throws CantidadIncorrectaException{
        // vamos a controlar que la cantidad sea mayor que cero
        if (cantidad <= 0 ){
            //lanzar la excepción
            throw new CantidadIncorrectaException("La cantidad de productos debe ser mayor que cero");
        }

        return precio * cantidad;
        

    }

    // MÉTODOS ABSTRACTOS
    public abstract boolean permiteDevolucion();
    
    // Si el enunciado dice que el nombre del producto una vez
    // creado no se puede modificar....
    // SOLUCIÓN: No debería crear el setNombre (encapsulación)

    // MÉTODOS SOBREESCRITOS DE OBJECT..
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
    }

    //@Override
    /*
     * CURIOSIDAD:
     * En Java, las clases pueden acceder directamente a los atributos privados de 
     * otras instancias de la misma clase. 
     * Esto se conoce como "acceso directo" y está permitido para facilitar la 
     * implementación de métodos dentro de la misma clase. 
     * Así, aunque nombre sea privado, puedes acceder a él desde el mismo tipo de objeto 
     * dentro de sus propios métodos.
     * Sin embargo, si intentaras hacer lo mismo desde una clase externa, recibirías un error de compilación 
     * porque el atributo nombre es privado y no es accesible desde fuera de la clase.
     */
    public int compareTo(Producto o) {
        //return nombre.compareTo(o.nombre);
        return Double.compare(precio, o.precio);
        //return Double.compare(o.precio, precio);
    }

}
