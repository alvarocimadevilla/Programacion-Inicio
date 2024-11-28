/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.ut04ejerciciosstring;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena de caracteres");
        String str = sc.nextLine();

        String minusculas = str.toLowerCase();

        int cantidadVocales = 0;

        for (int i = 0; i < minusculas.length(); i++) {
            char c = minusculas.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cantidadVocales++;
            }
        }

        System.out.println("La cantidad de vocales es: " + cantidadVocales);

        sc.close();
    }

}
