package es.daw.model;

public class Coche {
    //ATRIBUTOS

    private String matricula;
    private int numPuertas;
    private String marca;
    private int kilometros;
    private int precio;

    //CONSTRUCTORES

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

    //GETTERS AND SETTERS

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
        return "Coche [matricula=" + matricula + ", numPuertas=" + numPuertas + ", marca=" + marca + ", kilometros="
                + kilometros + ", precio=" + precio + "]";
    }

    

    
    
    
}
