package EJERCICIOS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {

        final int NUM_CLIENTES = 100;

        Queue<String> queue = new LinkedList<>();

        Random random = new Random();

        //int clientesEnCola = 0;
        int totalClientes = 0;
        
        while (totalClientes < NUM_CLIENTES) { // Simulamos el proceso durante 100 iteraciones

            double probabilidad = random.nextDouble(); // 0 0.999999

            if (probabilidad < 0.7) { // Nuevo cliente se pone en la cola (70% de probabilidad)
                totalClientes++;
                //clientesEnCola++;
                queue.add("Cliente " + totalClientes);
                //System.out.println("Nuevo cliente se ha unido a la cola. Total de clientes en cola: " + clientesEnCola);
                System.out.println("Nuevo cliente se ha unido a la cola. Total de clientes en cola: " + queue.size());
                
                if (queue.size() >= 10){
                //if (clientesEnCola >= 10) {
                    System.out.println("¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.");
                }
            } else { // Cliente ha sido atendido. Se va de la tienda (30% de probabilidad)
                if (!queue.isEmpty()) {
                    //clientesEnCola--;
                    String cliente = queue.poll();
                    //System.out.println("El cliente " + cliente + " ha sido atendido. Total de clientes en cola: " + clientesEnCola);
                    System.out.println("El cliente " + cliente + " ha sido atendido. Total de clientes en cola: " + queue.size());
                }
            }
        }
    }
}
