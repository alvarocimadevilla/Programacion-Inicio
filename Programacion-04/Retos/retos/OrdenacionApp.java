/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/Retos#reto-3-algoritmo-de-ordenaci%C3%B3n-la-burbuja
 */
package es.daw.ordenacion;

import java.util.Arrays;

/**
 *
 * @author melol
 */
public class OrdenacionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = {4,67,-3,54,1,23,98};
        
        int[] enteros = {8, 3, 1, 19, 14};

        System.out.println("Array sin ordenar:");
        System.out.println(Arrays.toString(numeros));
        
//        ordenarAscendenteIntercambio(numeros);
//        
//        System.out.println("Array ordenado por el algoritmo de intercambio:");
//        System.out.println(Arrays.toString(numeros));

        ordenarAscendenteBurbuja(numeros);
        System.out.println("Array ordenado por el algoritmo de la burbuja:");
        System.out.println(Arrays.toString(numeros));

        System.out.println("* Con el array de GitHib:");
        ordenarAscendenteBurbuja(enteros);
        System.out.println("Array ordenado por el algoritmo de la burbuja:");
        System.out.println(Arrays.toString(enteros));
        
        
        
    }
    
    /**
     * Algoritmo de ordenación por intercambio
     * @param numeros 
     */
    public static void ordenarAscendenteIntercambio(int[] numeros){
        // Recorremos el array desde la primera posición hasta la última
        for (int i=0; i < numeros.length;i++){
            //Recorremos el array desde el elemento siguiente (i+1) hasta la última posición
            for(int j= (i+1); j< numeros.length; j++){
                //Si el elemento en posición anterior es mayor que el elemento en posición posterior
                //hago el cambio
                if (numeros[i] > numeros[j]){
                    //Intercambiamos valores
                    int varAux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = varAux;
                }
            }
            
        }
    }    
    
    /**
     * 
     * @param numeros 
     */
    public static void ordenarAscendenteBurbuja(int[] numeros){
        
        // Hago tantas pasadas como elementos tenga el array menos el último
        // porque no puede compararse con el siguiente
        for (int i = 0; i < numeros.length - 1; i++) {
            // Por cada pasada recorro los elementos del array
            // menos el último en la primera pasada
            // menos el penúltimo y último en la segunda pasada
            // ......
            for (int j =0; j< (numeros.length - 1 -i); j++){
                // se intercambian
                if (numeros[j] > numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;

                }
            }
        }
    }
    
}
