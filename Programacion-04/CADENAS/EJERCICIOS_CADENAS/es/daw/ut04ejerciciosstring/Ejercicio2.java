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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var sc = new Scanner(System.in);

        System.out.println("Introduzca la cadena a verificar");
        String str = sc.nextLine();

        boolean repetido = false;
        char caracterRepetido = ' ';
        int i = 0;
        while (i < str.length() && !repetido) {
            char c = str.charAt(i);
            int j = i + 1;
            while (j < str.length() && !repetido) {
                if (c == str.charAt(j)) {
                    repetido = true;
                    caracterRepetido = c;
                } else {
                    j++;
                }
            }
            i++;
        }

        if (repetido) {
            System.out.println("El primer carácter repetido es " + caracterRepetido);
        } else {
            System.out.println("No hay ningún carácter repetido");
        }

        sc.close();
    }

}
