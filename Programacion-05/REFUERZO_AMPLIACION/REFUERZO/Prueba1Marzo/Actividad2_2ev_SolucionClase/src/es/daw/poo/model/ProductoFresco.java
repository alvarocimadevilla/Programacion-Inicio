package es.daw.poo.model;

import java.time.LocalDate;

import es.daw.poo.exceptions.NotValidException;

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
     * @throws NotValidException 
     */
    public boolean validar() throws NotValidException{
        for (String p : PAISES) {
            if (p.equalsIgnoreCase(paisOrigen))
                return true;
        }
        throw new NotValidException("El país no está permitido");
    }

    @Override
    public String toString() {
        return super.toString()+"-> ProductoFresco [paisOrigen=" + paisOrigen + "]";
    }

    
    
}
