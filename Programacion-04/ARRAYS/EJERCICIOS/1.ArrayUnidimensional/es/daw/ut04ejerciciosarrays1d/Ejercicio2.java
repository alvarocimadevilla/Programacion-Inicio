/*
 * https://github.com/profeMelola/Programacion-04-2023-24/blob/main/ARRAYS/EJERCICIOS/ArrayUnidimensional/readme.md#ejercicio-2
 */
package es.daw.ut04ejerciciosarrays1d;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        int[] enteros;
        
        boolean incorrecto = true;
        
        while(incorrecto){
            try{
                // solicite al usuario cuántos números desea introducir
                System.out.println("Introduce una cantidad de enteros:");
                cantidad = sc.nextInt();

                // Crear e inicializar el array con la cantidad introducida por el usario
                enteros = new int[cantidad];

                for (int i = 0; i < enteros.length; i++) {
                    System.out.println("Introduce el número <"+(i+1)+">:");
                    enteros[i] = sc.nextInt();
                }

                // Pintar por consola el array en orden inverso
                System.out.println("Valores array inverso: ");
                for(int i= enteros.length -1 ; i>= 0; i--){
                    System.out.println(enteros[i]);
                }  
                
                incorrecto = false;

            }catch(java.util.InputMismatchException e){
                System.out.println("[ERROR] No has introducido un entero");
                //incorrecto = true;
                sc.nextLine();
            }
        }
        
    }
    
}
