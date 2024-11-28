/*
 * CLASE DE UTILIDADES CON MÉTODOS QUE TRABAJAN SOBRE MATRICES
 */
package es.daw.matrices_desde_cero.util;

import static es.daw.matrices_desde_cero.MatricesApp.TECLADO;

/**
 * Método que devuelve la matriz con las plazas de parking (tal cual la pizarra)
 * @author melola
 */
public class ParkingUtils {
    
    public static int[][] cargarParkingAutomatico(){
        
        // Forma 1
        int[][] parkings = {
        {10,20,5},
        {20,30,0},
        {15,25,10}
        };
    
        // Forma2: recordad que una matriz es un array de arrays.
        // Cada posición del array no tiene un tipo primitivo simple, lo que tiene es otro array
        int[] plazasPaloma = {10,20,5};
        int[] plazasObispado = {20,30,0};
        int[] plazasComplutense = new int[3];
        plazasComplutense[0] = 15;
        plazasComplutense[1] = 25;
        plazasComplutense[2] = 10;
        
        int[][] parkings2 = new int[3][3];
        parkings2[0] = plazasPaloma;
        parkings2[1] = plazasObispado;
        parkings2[2] = plazasComplutense;
        
        return parkings2;
        
    }
    
    
    /**
     * Método que recibe una matriz (da igual sus dimensiones)
     * y la carga con valores introducidos por consola
     * @param parking 
     */
    public static void cargarParking(int[][] parking){
        
        System.out.println("VAS A CARGAR DATOS EN LA MATRIZ:");
        
        // parking.length ==> número de filas
        for (int fila = 0; fila < parking.length; fila++) {
            //System.out.println("*FILA <"+fila+">");
            for(int col = 0; col < parking[fila].length; col++){
                System.out.printf("Introduce el valor en la posicion [%d , %d]: \n",fila,col);
                //System.out.println("Introduce el valor en la posicion ["+fila+","+col+"]");
                parking[fila][col] = TECLADO.nextInt();
            }
            //System.out.println("");
        }
        
    }
    
    /**
     * Método que pinta por consola los valores de una matriz (da igual sus dimensiones)
     * @param matriz 
     */
    public static void pintaParking(int[][] matriz){
        for(int fila=0; fila<matriz.length; fila++){
            for(int col=0;col<matriz[fila].length;col++){
                System.out.print(matriz[fila][col]+" ");
            }
            System.out.println("");
        }
        
    }
    
    /**
     * Devuelve la suma de todas las celdas.
     * En este caso serían, las plazas totales de aparcamiento
     * @param matriz
     * @return 
     */
    public static int sumaTotalMatriz(int[][] matriz){
        return 0;
    }
    
    /**
     * Devuelve la suma de una fila concreta
     * En este caso la fila es uno de los parking y devolvería el número de plazas de un parking concreto
     * @param matriz
     * @param fila
     * @return 
     */
    public static int sumaFila(int[][] matriz, int fila){
        
        /*
        int[] filaArray = matriz[fila]; // vector de la fila
        
        for (int i = 0; i < filaArray.length; i++) {
            
        }*/
        int suma = 0;
        for (int col = 0; col < matriz[fila].length; col++) {
            suma += matriz[fila][col];
        }
        return suma;
    }
    
    /**
     * Devuelve la suma de una columna concreta
     * En este caso la columna es las plazas de un tipo de vehículo concreto
     * @param matriz
     * @param col
     * @return 
     */
    public static int sumaColumna(int[][] matriz, int col){
        int suma = 0;
        
        //for (int i = 0; i < matriz[0].length; i++) // es lo mismo porque es una matriz regular
        // matriz.length ==> número filas
        //matriz[0].length ==> el número de columnas
        
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][col];
        }
        
        return suma;
    }
    
    /**
     * Devuelve el valor de una celda concreta
     * La celda indica el número de plazas de un tipo concreto en un parking concreto
     * @param matriz
     * @param fila
     * @param col
     * @return 
     */
    public static int valorCelda(int[][] matriz, int fila, int col){
        return matriz[fila][col];
    }
    
}
