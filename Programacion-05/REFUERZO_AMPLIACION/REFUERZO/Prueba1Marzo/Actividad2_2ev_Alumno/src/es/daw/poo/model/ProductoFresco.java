package es.daw.poo.model;

import java.time.LocalDate;

public class ProductoFresco extends Producto{

    private String paisOrigen;

    private static final String[] PAISES = {"España","Portugal","Francia","Italia"};

    public ProductoFresco(LocalDate fechaCaducidad, int numeroLote,String paisOrigen){
        super(fechaCaducidad,numeroLote);
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
        return super.toString()+"-> ProductoFresco [paisOrigen=" + paisOrigen + "]";
    }

    
    
}
