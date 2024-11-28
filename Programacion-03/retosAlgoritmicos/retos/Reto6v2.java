/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/retosAlgoritmicos#reto-6
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Reto6v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        
        /*
        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);*/
        
        System.out.println("Cadena invertida: " + invertirCadena(cadena));
        
        
        sc.close();
    }
    
    /**
     * Método que invierte el contenido de una cadena
     * @param cadena
     * @return 
     */
    public static String invertirCadena(String cadena){
        String cadenaInvertida="";

        /*for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }*/
        
        
        int i = cadena.length() -1;
        
        while(i >= 0){
            //cadenaInvertida = cadenaInvertida + cadena.charAt(i);
            cadenaInvertida += cadena.charAt(i);
            i--;
        }
        
        
        return cadenaInvertida;
    }
}
