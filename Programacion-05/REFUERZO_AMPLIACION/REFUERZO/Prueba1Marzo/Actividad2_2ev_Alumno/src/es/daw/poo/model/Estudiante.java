package es.daw.poo.model;

public class Estudiante extends Persona{

    private String NIA;

    public Estudiante(String nombreCompleto, String direccion, String NIA) {
        super(nombreCompleto, direccion);
        this.NIA = NIA;
    }

    /*
     * 
     */
    public boolean validar(){
        if (NIA.matches("[0-9]{8}[A-Z]{1}"))
            return true;
        
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+"-> Estudiante [NIA=" + NIA + "]";
    }


    


}
