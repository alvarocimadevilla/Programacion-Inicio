package es.daw.colecciones.model;

public class Chocolatina extends Chuche{
    private String marca;

    public Chocolatina(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Chocolatina [marca=" + marca + "]";
    }

    
}
