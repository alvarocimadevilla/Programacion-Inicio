package es.daw.poo.model;

public class Estudiante extends Persona{
    private String NIA;

    public Estudiante(String nombreCompleto, String direccion, String nIA) {
        super(nombreCompleto, direccion);
        NIA = nIA;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" -> ").append(Estudiante.class.getSimpleName());
        sb.append(" -> NIA=").append(NIA+"]");
        return sb.toString();
    }

    @Override
    public boolean validar() {
       
        if (NIA.matches("\\d{8}[A-Z]")) {
            return true;
        } else return false;
    }

    
    
    
}
