/**
 * Clase que contiene métodos estáticos (funciones) de uso general de la aplicación
 */
package es.daw.practica2.lienzo.util;

import static es.daw.practica2.lienzo.util.Lienzo.*;
import java.util.Scanner;

/**
 *
 * @author Adrian Bogdan
 */
public class Utils {
    
    public static final Scanner sc = new Scanner(System.in);
    
    // COLORES
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    /**
     * Método que lee del teclado y comprueba si es un enter
     * @return verdadero si es un enter
     */
    public static boolean leerEnter(String cadena){
        Scanner teclado = new Scanner(System.in);
        System.out.print(cadena);
        return teclado.nextLine().isEmpty();
    }
    
    public static void limpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Extrae los numeros de una cadena de texto
     * @param cadena
     * @return 
     */
    public static int soloNumeros(String cadena){
        String cadenaSoloNumeros = "";
        for (int i = 0; i < cadena.length(); i++)
            if (Character.isDigit(cadena.charAt(i)))
                cadenaSoloNumeros += cadena.charAt(i);
        return Integer.parseInt(cadenaSoloNumeros);
    }
    

    public static int leerEntero(String dialogo){
        boolean incorrecto = true;
        while (incorrecto){
            System.out.print(dialogo);
            try{  
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e ){
                System.out.println("Introduce un entero valido");
            }
        }
        return 0;
    }
    
    public static String obtenerCoordenadas(int[] coordenadas){
        return "" + LETRAS[coordenadas[1]] + (coordenadas[0] + 1);
    }
    
    public static int[] leerCoordenada(String dialogo){
        boolean incorrecto = true;
        String coordenadaValida = "[a-zA-Z][0-9]{1,2}";
        int[] coordenadas = new int[2];
        String leerCoordenada = "";
        while (incorrecto){
            System.out.print(dialogo);
            leerCoordenada = sc.nextLine();
            if (leerCoordenada.matches(coordenadaValida) && soloNumeros(leerCoordenada) > 0 && soloNumeros(leerCoordenada) <= 25){
                incorrecto = false;
            }else{
                System.out.println("Introduce una coordenada valida");
            }
        }
        coordenadas[0] = soloNumeros(leerCoordenada) - 1;
        coordenadas[1] = leerCoordenada.toUpperCase().charAt(0) - 65;
        return coordenadas;
    }
    
    /**
     * Generar una array con 2 campos
     * @param x
     * @param y
     * @return 
     */
    public static int[] xy(int x, int y){
        int[] a = {x, y};
        return a;
    }
    
    /**
     * Añadir una cadena de texto en una array
     */
    public static String[] empujar(String cadena, String[] array){
        String[] nuevoArray = new String[array.length];
        nuevoArray[0] = cadena;
        System.arraycopy(array, 0, nuevoArray, 1, array.length - 1);
        return nuevoArray;
    }
            
}
