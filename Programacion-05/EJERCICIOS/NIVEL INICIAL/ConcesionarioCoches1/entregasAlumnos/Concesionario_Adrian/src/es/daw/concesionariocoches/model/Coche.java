/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.concesionariocoches.model;

/**
 *
 * @author alumnot
 */
public class Coche {
    // Atributos
    private String matricula;
    private int numPuertas;
    private String marca;
    private int kilometros;
    private double precio;

    
    // Contructores
    
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
    
    
    // Metodos Getters & Setters

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nmatricula\t|\t").append(matricula);
        sb.append("\nnumPuertas\t|\t").append(numPuertas);
        sb.append("\nmarca\t\t|\t").append(marca);
        sb.append("\nkilometros\t|\t").append(kilometros).append(" km");
        sb.append("\nprecio\t\t|\t").append(precio).append(" €");
        return sb.toString();
    }
    
    
    
    
    
}
