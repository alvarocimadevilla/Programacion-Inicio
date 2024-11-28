package es.daw.poo.model;

public abstract class Persona implements Validable,Comparable<Persona>{
    private String nombreCompleto;
    private String direccion;
   
    public Persona(String nombreCompleto, String direccion){
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }
   
    //public abstract boolean validar();

    @Override
    public String toString() {
        return "Persona [nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + "]";
    }

    @Override
    public int compareTo(Persona o) {
        return nombreCompleto.compareTo(o.nombreCompleto);
    }

    
    
}
    

