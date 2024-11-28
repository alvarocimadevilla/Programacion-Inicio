package es.daw.poo.model;

import java.time.LocalDate;

public class ProductoCongelado extends Producto{

    private int temperaturaCongelacion;

    public ProductoCongelado(LocalDate fechaCaducidad, int numeroLote, int temperaturaCongelacion) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    /**
     * 
     * @return
     */
    public boolean validar(){
        if (temperaturaCongelacion >= 0)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+"-> ProductoCongelado [temperaturaCongelacion=" + temperaturaCongelacion + "]";
    }

    
    
}
