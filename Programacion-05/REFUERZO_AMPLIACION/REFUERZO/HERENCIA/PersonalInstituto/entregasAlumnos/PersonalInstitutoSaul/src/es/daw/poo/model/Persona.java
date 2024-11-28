package es.daw.poo.model;

public abstract class Persona {
    private String nombreCompleto;
    private String direccion;



    //CONSTRUCTOR
    public Persona(String nombreCompleto, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(Persona.class.getSimpleName());
        sb.append("  [").append("nombreCompleto=").append(nombreCompleto);
        sb.append(", direccion=").append(direccion+"]");
        return sb.toString();
    }

    public abstract boolean validar();

    
}
