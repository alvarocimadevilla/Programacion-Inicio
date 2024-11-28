/*
 * Diferentes ejemplos de usos de métodos de la clase Arrays
 */
package es.dasw.ut04ejemplosclasearrays;

import java.util.Arrays;

/**
 *
 * @author melola
 */
public class Ut04EjemplosClaseArrays {

    // Arrays declarados de forma global
    static int[] enteros = new int[5];
    static int[] enteros2 = {5,8,9,78,45,3};
    static int[] enteros3 = new int[5];
    static int[] enteros4 = new int[6];
    static double[] doubles = {8.5,9.6,6};
    static double[] doubles2 = new double[3];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Rellenar un array con un mismo valor
        Arrays.fill(enteros,8);
        Arrays.fill(doubles2,6.6);
        
        // Ordenación ascendente
        Arrays.sort(doubles);
        //Arrays.sort(enteros2);
        
        //imprimirArrays();
        
        // 
        // Búsquedas
        int indice = buscarEntero(45,enteros2);
        System.out.printf("El número %d está en la posición %d\n",45,indice);
        
        indice = buscarEntero(9,enteros2);
        System.out.printf("El número %d está en la posición %d\n",9,indice);
        
        indice = buscarEnteroArtesanal(9,enteros2);
        System.out.printf("[artesanal] El número %d está en la posición %d\n",9,indice);
        
        // el array enteros no está ordenado!!!
//        indice = buscarEntero(8, enteros);
//        System.out.println(indice);
        
        // COPIAR ARRAYS
        // copiar enteros2 a enteros3
        enteros3 = enteros2;
        System.out.println("Contenidos de enteros2:");
        System.out.println(Arrays.toString(enteros2));
        System.out.println("Contenido de enteros3:");
        System.out.println(Arrays.toString(enteros3));
        
        enteros3[0]=666;
        
        System.out.println("Contenidos de enteros2:");
        System.out.println(Arrays.toString(enteros2));
        System.out.println("Contenido de enteros3:");
        System.out.println(Arrays.toString(enteros3));
        
        // PENDIENTE!!!
        //Arrays.copyOf(args, indice);
        
        System.out.println("COPIADO ENTEROS2 EN ENTEROS4");
        copiarArtesanal(enteros2, enteros4);
        
        // modificada la posición 2
        enteros4[1]=9999;
        
        System.out.println("Contenidos de enteros2:");
        System.out.println(Arrays.toString(enteros2));
        System.out.println("Contenido de enteros4:");
        System.out.println(Arrays.toString(enteros4));
        

    }
    
    private static void imprimirArrays(){
        
        for(int e : enteros)
            System.out.printf("[%d] ",e);
        System.out.println("");
        
        for(int e : enteros2)
            System.out.printf("[%d] ",e);
        System.out.println("");
        
        
        for(double d : doubles)
            System.out.printf("[%f] ",d);
        System.out.println("");
        
        for(double d : doubles2)
            System.out.printf("[%.2f] ",d);
        System.out.println("");
        
    }
    
    /**
     * Método que recibe el valor entero a buscar dentro del array
     * @param valor
     * @param arrayEnteros
     * @return el índice del array donde se encuentra el valor
     */
    private static int buscarEntero(int valor, int[] arrayEnteros){
        Arrays.sort(arrayEnteros);
        return Arrays.binarySearch(arrayEnteros, valor);
    }
    
    private static int buscarEnteroArtesanal(int valor, int[] arrayEnteros){
        for (int i = 0; i < arrayEnteros.length; i++) {
            if (arrayEnteros[i] == valor)
                return i;
        }
        return -1;
        
    }
    
    private static void copiarArtesanal(int[] arrayOriginal, int[] arrayFinal){
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayFinal[i] = arrayOriginal[i];
        }
        
        arrayOriginal[0]=111;
            
    }
    
}
