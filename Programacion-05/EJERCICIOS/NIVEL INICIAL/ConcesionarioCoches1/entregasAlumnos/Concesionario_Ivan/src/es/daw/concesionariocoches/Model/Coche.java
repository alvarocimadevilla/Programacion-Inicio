package es.daw.concesionariocoches.Model;

import es.daw.concesionariocoches.ConcesionarioCoches;

public class Coche {

    private String matricula;
    private int numPuertas;
    private String marca;
    private int kilometros;
    private int precio;

    public Coche(String matricula, int numPuertas, String marca, int kilometros, int precio) {
        this.matricula = matricula;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.kilometros = kilometros;
        this.precio = precio;
    }

    public Coche(String matricula, int precio) {
        this.matricula = matricula;
        this.precio = precio;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public Coche() {
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coche: ");
        sb.append("matricula = ").append(matricula);
        sb.append(", numPuertas = ").append(numPuertas);
        sb.append(", marca = ").append(marca);
        sb.append(", kilometros = ").append(kilometros);
        sb.append(", precio = ").append(precio);
        return sb.toString();
    }


}
