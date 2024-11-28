package es.daw.poo.model;

public class Profesor extends Persona{

    private int aniosExperiencia;

    public Profesor(String nombreCompleto, String direccion, int aniosExperiencia) {
        super(nombreCompleto, nombreCompleto);
        this.aniosExperiencia = aniosExperiencia;
    }

    /**
     * 
     * @return
     */
    public boolean validar(){
        if (aniosExperiencia < 2)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+"-> Profesor [aniosExperiencia=" + aniosExperiencia + "]";
    }


    
    
}
