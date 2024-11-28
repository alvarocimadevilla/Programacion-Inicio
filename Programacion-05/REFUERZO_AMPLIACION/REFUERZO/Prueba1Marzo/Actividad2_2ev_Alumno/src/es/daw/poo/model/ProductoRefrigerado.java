package es.daw.poo.model;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{

    private String codigoSupervision;

    public ProductoRefrigerado(LocalDate fechaCaducidad, int numeroLote, String codigoSupervision) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
    }

    /*
     * 
     */
    public boolean validar(){
        if (codigoSupervision.matches("[A-Z]{1}[0-9]{3}"))
            return true;
        
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+"-> ProductoRefrigerado [codigoSupervision=" + codigoSupervision + "]";
    }

    


}
