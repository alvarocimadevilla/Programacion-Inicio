package es.daw.poo.model;

import java.time.LocalDate;

import es.daw.poo.exceptions.NotValidException;

public class ProductoCongelado extends Producto{

    private int temperaturaCongelacion;

    public ProductoCongelado(LocalDate fechaCaducidad, int numeroLote, int temperaturaCongelacion) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    /**
     * 
     * @return
     * @throws NotValidException 
     */
    public boolean validar() throws NotValidException{
        if (temperaturaCongelacion >= 0)
            throw new NotValidException("La temp de congelación es superior a cero");
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+"-> ProductoCongelado [temperaturaCongelacion=" + temperaturaCongelacion + "]";
    }

    
    
}
