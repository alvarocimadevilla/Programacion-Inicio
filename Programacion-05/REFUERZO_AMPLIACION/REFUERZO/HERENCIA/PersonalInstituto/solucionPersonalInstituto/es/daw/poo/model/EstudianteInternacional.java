package es.daw.poo.model;


public class EstudianteInternacional extends Estudiante{

    private String paisOrigen;

    private static final String[] PAISES = {"España","Portugal","Francia","Italia"};

    public EstudianteInternacional(String nombreCompleto, String direccion, String NIA, String paisOrigen){
        super(nombreCompleto,direccion,NIA);
        this.paisOrigen = paisOrigen;
    }

    /**
     * 
     * @param pais
     * @return
     */
    public boolean validar(){
        for (String p : PAISES) {
            if (p.equalsIgnoreCase(paisOrigen))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+"->EstudianteInternacional [paisOrigen=" + paisOrigen + "]";
    }


    
    
}
