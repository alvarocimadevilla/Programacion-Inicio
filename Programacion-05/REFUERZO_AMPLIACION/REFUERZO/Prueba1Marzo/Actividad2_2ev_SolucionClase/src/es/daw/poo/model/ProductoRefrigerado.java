package es.daw.poo.model;

import java.time.LocalDate;

import es.daw.poo.exceptions.NotValidException;

public class ProductoRefrigerado extends Producto{

    private String codigoSupervision;

    public ProductoRefrigerado(LocalDate fechaCaducidad, int numeroLote, String codigoSupervision) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
    }

    /*
     * 
     */
    public boolean validar() throws NotValidException{
        if (codigoSupervision.matches("[A-Z]{1}[0-9]{3}"))
            return true;
        
        throw new NotValidException("El código de supervisión no cumple el patrón");
    }

    @Override
    public String toString() {
        return super.toString()+"-> ProductoRefrigerado [codigoSupervision=" + codigoSupervision + "]";
    }

    


}
