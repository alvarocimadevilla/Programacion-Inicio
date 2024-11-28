package es.daw.model;

public class Vehiculo {

    // 1.ATRIBUTOS

    private String marca;
    private String modelo;
    private int numPasajeros;
    private int capacidadCombustible;
    private float consumo;
    
    // 2. CONSTRUCTORES
    public Vehiculo(String marca, String modelo, int numPasajeros, int capacidadCombustible, float consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPasajeros = numPasajeros;
        this.capacidadCombustible = capacidadCombustible;
        this.consumo = consumo;
    }

    // 3. GETTERS & SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setModulo(String model){
        modelo = model;
    }

    public int getNumPasajeros() {
        return this.numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }    

    

    // 4. MÉTODOS DE COMPORTAMIENTOS (FUNCIONALIDADES)
    public float calcularAutonomia() {
        return capacidadCombustible*consumo;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", numPasajeros=" + numPasajeros
                + ", capacidadCombustible=" + capacidadCombustible + ", consumo=" + consumo + "]";
    }

    // 5. SOBREESCRIBIR MÉTODOS HEREDADOS DE OBJECT
    

    
}
