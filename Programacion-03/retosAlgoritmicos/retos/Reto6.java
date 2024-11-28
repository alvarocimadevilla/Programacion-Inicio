/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/retosAlgoritmicos#reto-6
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Reto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String cadenaInvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("Cadena invertida: " + cadenaInvertida);
        sc.close();
    }
}
