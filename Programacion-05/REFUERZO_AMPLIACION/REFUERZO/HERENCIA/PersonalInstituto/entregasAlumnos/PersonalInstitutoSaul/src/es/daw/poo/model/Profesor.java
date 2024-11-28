package es.daw.poo.model;

public class Profesor extends Persona {

    private int aniosExperiencia;

    public Profesor(String nombreCompleto, String direccion, int aniosExperiencia) {
        super(nombreCompleto, direccion);
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" -> "+Profesor.class.getSimpleName());
        sb.append(" [aniosExperiencia=").append(aniosExperiencia+"]");
        return sb.toString();
        
    }

    @Override
    public boolean validar() {
        if (aniosExperiencia < 2) {
            return false;
        }
        else return true;
    }

    
    
    
}
