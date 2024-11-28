package es.daw.poo.model;

import es.daw.poo.exceptions.NotValidException;

public class Estudiante extends Persona{

    private String NIA;

    public Estudiante(String nombreCompleto, String direccion, String NIA) {
        super(nombreCompleto, direccion);
        this.NIA = NIA;
    }

    /*
     * 
     */
    public boolean validar() throws NotValidException{
        if (NIA.matches("[0-9]{8}[A-Z]{1}"))
            return true;
        
        throw new NotValidException("El NIA no cumple con el patrón");
    }

    @Override
    public String toString() {
        return super.toString()+"-> Estudiante [NIA=" + NIA + "]";
    }


    


}
