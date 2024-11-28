/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/retosAlgoritmicos#reto-4
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Reto4v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // Inicializamos max con el valor mínimo posible
        //int max = 0; // por defecto digo que el máximo es cero
        //int max;
        boolean tieneNegativo = false;
        int numero = 0;
        int contadorNegativos = 0;

        // El primer número introducido va a ser el max inicialmente
        // System.out.println("Introduce el número 1: ");
        // max = scanner.nextInt();
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el número " + i + ": ");
            numero = scanner.nextInt();

            if (numero < 0) {
                tieneNegativo = true;
                contadorNegativos++;
            }

            if (numero > max) {
                max = numero;
            }
        }

        if (!tieneNegativo){
            System.out.println("No has introducido ningún negativo");
        }
        else if (tieneNegativo){
        // if (tieneNegativo == true) { //NOOOOOOOOO
            System.out.println("Al menos uno de los números introducidos es negativo.");
            System.out.println("El número de números negativos es: "+contadorNegativos);
        } else {
            System.out.println("Ninguno de los números introducidos es negativo.");
        }

        System.out.println("El valor máximo introducido es: " + max);
    }
}


