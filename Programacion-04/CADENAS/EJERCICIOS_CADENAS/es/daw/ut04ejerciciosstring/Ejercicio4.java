/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/CADENAS/EJERCICIOS_CADENAS#ejercicio-4-pal%C3%ADndromos
 */
package es.daw.ut04ejerciciosstring;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String cadena = "";
        
        Scanner sc = new Scanner(System.in);
        
        //1. Pedir y leer la fras
        System.out.println("Introduzca una palabra o frase:");
        cadena = sc.nextLine();
        
        //2.Llamo a la función que comprueba si es palíndromo
        if (esPalindromo(cadena))
            System.out.println("La frase es palíndroma");
        else
            System.out.println("La frase no es palíndroma");
        
        
    }
    
    /**
     * Método que devuelve si una cadena es palíndroma
     * @param frase cadena a comprobar
     * @return true/false si es palíndroma o no
     */
    private static boolean esPalindromo(String frase){
        
        String nuevaFrase = "";
        
        //1. Eliminar espacios en blanco
        frase = frase.trim();
        
        //2. Convertir todo a minúsculas
        frase = frase.toLowerCase();
        
        //3. Ignorar acentos
        for (int i = 0; i < frase.length(); i++) {
            
            String sub = frase.substring(i, i+1); //string
            //char c = frase.charAt(i); // char
            
            // es distinto de espacio blanco
            if(!sub.isBlank()){
                sub = sustituirVocalAcentuda(sub);
                nuevaFrase += sub;
            }
        }
        
        
        //4. Crear la frase al revés
        String inversa = "";
        
        // recorro la frase al revés
        for (int i = nuevaFrase.length()-1; i >= 0; i--) {
            inversa += nuevaFrase.charAt(i);
        }
        
        //5. Comprobar si son iguales
        return nuevaFrase.equals(inversa);
        
        
    }
    
    /**
     * Método que sustituye los acentos
     * @param letra
     * @return 
     */
    private static String sustituirVocalAcentuda(String letra){
        String nuevaLetra = "";
        
        switch (letra){
            case "á":
                nuevaLetra = "a";
                break;
            case "é":
                nuevaLetra = "e";
                break;
            case "í":
                nuevaLetra = "i";
                break;
            case "ó":
                nuevaLetra = "o";
                break;
            case "ú":
                nuevaLetra = "u";
                break;
            default:
                nuevaLetra = letra;
        }
        
        return nuevaLetra;
        
    }
}
