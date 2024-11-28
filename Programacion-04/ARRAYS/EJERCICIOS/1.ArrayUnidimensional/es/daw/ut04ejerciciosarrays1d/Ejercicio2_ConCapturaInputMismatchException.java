/*
 * https://github.com/profeMelola/Programacion-04-2023-24/blob/main/ARRAYS/EJERCICIOS/ArrayUnidimensional/readme.md#ejercicio-2
 */
package es.daw.ut04ejerciciosarrays1d;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio2_ConCapturaInputMismatchException {

    private static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int cantidad = 0;
        int[] enteros;
        
        // solicite al usuario cuántos números desea introducir
        cantidad = leerNumero("Introduce una cantidad de enteros:");

        // Crear e inicializar el array con la cantidad introducida por el usario
        enteros = new int[cantidad];

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = leerNumero("Introduce el número <"+(i+1)+">:");
        }

        // Pintar por consola el array en orden inverso
        System.out.println("Valores array inverso: ");
        for(int i= enteros.length -1 ; i>= 0; i--){
            System.out.print(enteros[i]+" ");
        }  
                

    }
        
    
    
    /**
     * 
     * @return 
     */
    public static int leerNumero(String mensaje){
        int entrada = 0;
        boolean incorrecto = true;
        
        while (incorrecto){
            try{
                System.out.println(mensaje);
                //sc.reset();
                entrada = sc.nextInt();
                //sc.close();
                
                incorrecto = false;
            } catch(Exception e){
                System.out.println("Excepción en teclado: " +e);
                sc.nextLine();
            }
        }
        return entrada;
    }
    
    
    
}
