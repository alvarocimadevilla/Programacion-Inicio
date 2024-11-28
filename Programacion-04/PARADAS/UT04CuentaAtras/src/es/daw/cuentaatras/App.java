/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.cuentaatras;

/**
 *
 * @author melol
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Establecer el tiempo inicial en segundos
        int tiempoInicial = 10; // Puedes cambiar este valor al que desees

        System.out.println("¡Iniciando la cuenta atrás para el lanzamiento del cohete!");

        while (tiempoInicial > 0) {
            System.out.println("Tiempo restante: " + tiempoInicial + " segundos");
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tiempoInicial--;
        }

        // Lanzamiento del cohete cuando la cuenta atrás llega a cero
        System.out.println("¡Cohete lanzado!");
    }
}
