package es.daw.poo.model;

public abstract  class Persona {
    private String nombreCompleto;
    private String direccion;
   
    public Persona(String nombreCompleto, String direccion){
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }
   
    public abstract boolean validar();

    @Override
    public String toString() {
        return "Persona [nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + "]";
    }

    
}
    

