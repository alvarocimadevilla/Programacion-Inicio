package es.daw.poo.model;

import es.daw.poo.exceptions.NotValidException;

public class Profesor extends Persona{

    private int aniosExperiencia;

    public Profesor(String nombreCompleto, String direccion, int aniosExperiencia) {
        super(nombreCompleto, nombreCompleto);
        this.aniosExperiencia = aniosExperiencia;
    }

    public boolean validar() throws NotValidException{
        if (aniosExperiencia < 2)
            throw new NotValidException("El profesor tiene menos de dos años de experiencia");
            
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+"-> Profesor [aniosExperiencia=" + aniosExperiencia + "]";
    }


    
    
}
