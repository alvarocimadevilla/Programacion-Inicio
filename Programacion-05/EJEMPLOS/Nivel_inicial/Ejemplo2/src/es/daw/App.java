package es.daw;

import es.daw.model.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
    /*
     Vehículo1: monovolumen

    marca = Renault
    modelo=Space
    pasajeros = 7
    capacidad depósito = 50
    consumo = 14*/

    Vehiculo monovolumen = 
        new Vehiculo("Renault", "Space", 7, 50, 14);

    System.out.println("Información del monovolumen:\n"+monovolumen.toString());
    System.out.println("Y su autonomía es:"+monovolumen.calcularAutonomia());

    monovolumen.setModelo("Space Deluxe");

    /*Vehículo2: deportivo

    marca = Lexus
    modelo= F Sport
    pasajeros = 2
    capacidad depósito = 66
    consumo = 18,8

     */
    Vehiculo deportivo = new Vehiculo("Lexus","F Sport" ,2, 66, 18.8f);

    System.out.println("Información del deportivo:\n"+deportivo.toString());
    System.out.println("Y su autonomía es:"+deportivo.calcularAutonomia());

    
    //deportivo.calcularAutonomia();

    }
}
