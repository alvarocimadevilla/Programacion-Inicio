package es.daw.model;

public class Coche {
    private String matricula;
    private String marca;
    private double precio;

    public Coche(String matricula, String marca, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.precio = precio;
    }

    public Coche(String matricula){
        this.matricula = matricula;
    }

    public void aplicarDescuento(int descuento) {
        precio -= descuento;
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

    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", marca=" + marca + ", precio=" + precio + "]";
    }


    
}