package es.daw.poo.model;

public class EstudianteInternacional extends Estudiante{

    private String paisOrigen;
    String[] paises = {"España","Portugal","Francia","Italia"};

    public EstudianteInternacional(String nombreCompleto, String direccion, String nIA, String paisOrigen) {
        super(nombreCompleto, direccion, nIA);
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" -> "+EstudianteInternacional.class.getSimpleName());
        sb.append("[paisOrigen=").append(paisOrigen+"]");
        return sb.toString();
    }

    @Override
    public boolean validar() {
        for (int i = 0; i < paises.length; i++) {
            if (paisOrigen!= paises[i]) {
                return false;
            }
        }
        return true;
        
    }

    


    
    
}
