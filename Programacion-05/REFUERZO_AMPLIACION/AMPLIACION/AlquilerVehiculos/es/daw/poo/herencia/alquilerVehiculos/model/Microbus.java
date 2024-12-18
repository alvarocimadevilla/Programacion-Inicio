/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.poo.herencia.alquilerVehiculos.model;

/**
 *
 * @author Knox
 */
public class Microbus extends Vehiculo{
    private int numPlazas;
    private final int EXTRA = 3;

    public Microbus(String MATRICULA, int numPlazas) {
        super(MATRICULA);
        this.numPlazas = numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public float getPrecioAlquiler() {
        return super.getPrecioAlquiler() + (EXTRA * numPlazas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n\t* N�mero de plazas: ").append(numPlazas);
         if (isAlquilado()) {
            sb.append("\n***********************************");
            sb.append("\nPrecio del alquiler: ").append(getPrecioAlquiler()).append(" euros");
        }
        return sb.toString();
    }
    
    
    
    
    
    
    
}
