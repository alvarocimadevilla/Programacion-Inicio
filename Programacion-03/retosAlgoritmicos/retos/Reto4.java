/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Reto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int max = Integer.MIN_VALUE; // Inicializamos max con el valor mínimo posible
        int max = 0; // por defecto digo que el máximo es cero
        boolean tieneNegativo = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                tieneNegativo = true;
            }

            if (numero > max) {
                max = numero;
            }
        }

        if (tieneNegativo) {
            System.out.println("Al menos uno de los números introducidos es negativo.");
        } else {
            System.out.println("Ninguno de los números introducidos es negativo.");
        }

        System.out.println("El valor máximo introducido es: " + max);
    }
}


