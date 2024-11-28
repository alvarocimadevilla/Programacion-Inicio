package es.daw.concesionario.model;

import java.time.LocalDate;

/**
 *
 * @author melola
 */
public class Coche {
    
    // ATRIBUTOS
    private String matricula;
    private int numPuertas;
    private String marca;
    private int kilometros;
    private int precio;
    
    //private LocalDate fechaAlta; //fecha cuando se da de alta el coche en el concesionario
    
    // CONSTRUCCIONES
    public Coche(String matricula, int numPuertas, String marca, int kilometros, int precio) {
        this.matricula = matricula;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.kilometros = kilometros;
        this.precio = precio;
    }
    
    public Coche(String matricula, int numPuertas, String marca) {
        this.matricula = matricula;
        this.numPuertas = numPuertas;
        this.marca = marca;
    }

    public Coche(String matricula, int precio) {
        this.matricula = matricula;
        this.precio = precio;
    }

    public Coche(String matricula){
        this.matricula = matricula;
    }
    public Coche(){

    }
        
    // GETTERS & SETTER
    public String getMatricula() {
        return matricula;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    /*
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }*/
    

    // MÉTODOS DE COMPORTAMIENTO...
    /**
     * El descuento es la cantida en euros (no porcentaje)
     * @param descuento 
     */
    public void aplicarDescuento(int descuento){
        if (descuento > 0 && descuento < precio)
            precio -= descuento;
        
    }

    /*
    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", numPuertas=" + numPuertas + ", marca=" + marca + ", kilometros="
                + kilometros + ", precio=" + precio + "]";
    }*/

    
    @Override
    public String toString() {
        // StringBuilder sb2 = new StringBuilder();
        // sb2.append("uno");
        // sb2.append("dos");
        // sb2.append("tres");
        // String resultado = sb2.toString();

        StringBuilder sb = new StringBuilder("\nLa información del coche es:");
        sb.append("\n\tLa matricula=" + matricula);
        sb.append("\n\tEl número de puertas=" + numPuertas);
        sb.append("\n\tLa marca=" + marca);
        sb.append("\n\tLos kilometros=" + kilometros);
        sb.append("\n\tEl precio final=" + precio);
        //sb.append("\n\tLa fecha de alta del coche en el concesionario=" + fechaAlta+"\n");
        
        return sb.toString();
        
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coche other = (Coche) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }
    
    
    
    
}
