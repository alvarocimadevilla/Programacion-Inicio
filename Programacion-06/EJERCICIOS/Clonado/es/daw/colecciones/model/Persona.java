package es.daw.colecciones.model;

public class Persona implements Comparable<Persona>, Cloneable{
    private String nombre;
    private int edad;

    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Persona other) {
        /*if (other.getEdad() > edad)
            return -1;
        else if (edad > other.getEdad())
            return 1;
        else
            return 0;*/
        
        return edad - other.getEdad();

        //return Integer.compare(edad, other.edad);
        
    }

    @Override
    public Persona clone() throws CloneNotSupportedException {
        return (Persona) super.clone();
    }

}

