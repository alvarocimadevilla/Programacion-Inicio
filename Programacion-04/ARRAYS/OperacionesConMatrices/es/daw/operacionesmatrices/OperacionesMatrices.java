/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/ARRAYS/OperacionesConMatrices
 */
package es.daw.operacionesmatrices;

/**
 *
 * @author melola
 */
public class OperacionesMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaración e inicialización de las matrices
//        int[][] matrizA2 = new int[2][3];
//        matrizA2[0][0] =3;
//        //....
        
        int[][] matrizA ={
            {3,7,5},
            {12,2,11}
        };
        
        int[][] matrizB = {
            {3,16,22},
            {1,4,4}
        };
        
        int[][] matrizC = {
            {3,16},
            {1,4},
            {4,22}
        };
        
        int[][] resultadoSuma = sumarMatrices(matrizA, matrizB);
        System.out.println("* El resultado de la suma de matrices es:");
        pintarMatriz(resultadoSuma);
        
        int[][] traspuesta = trasponerMatriz(matrizA);
        System.out.println("* La traspuesta es:");
        pintarMatriz(traspuesta);
        
//        int[][] resultadoResta = restarMatrices(matrizA, matrizB);
//        System.out.println("* El resultado de la resta de matrices es:");
//        pintarMatriz(resultadoResta);
        
        int[][] resultadoMulti = multiplicarMatrices(matrizA, matrizC);
        System.out.println("* El resultado de la multiplicación de matrices es:");
        pintarMatriz(resultadoMulti);
        
        
        
        
        
        
    }
    
    // MÉTODOS DE UTILIDADES (FUNCIONES)
    /**
     * Método que realiza la suma de matrices
     * @param mA
     * @param mB
     * @return 
     */
    private static int[][] sumarMatrices(int[][] mA, int[][] mB){
        // podría poner las dimensiones también de la mB (porque son iguales en dimensión)
        // mA.length ==> número filas
        // mA[0].length ==> número columnas 
        // mA[1].length ==> da el mismo número de columnas que mA[0] porque es una matriz regular
        int[][] suma = new int[mA.length][mA[0].length];
        
        // Recorrer las filas
        for (int i = 0; i < mA.length; i++) {
            // Recorrer las columnas de cada fila
            for (int j = 0; j < mA[i].length; j++) {
                suma[i][j] =mA[i][j] + mB[i][j];
            }
        }
        
        return suma;
    }
    
    /**
     * 
     * @param mA
     * @param mB
     * @return 
     */
    private static int[][] restarMatrices(int[][] mA, int[][] mB){
        int[][] resta = new int[mA.length][mA[0].length];
        
        // PENDIENTE COMPLETAR
        return resta;
    }
    
    private static int[][] multiplicarMatrices(int[][] mA, int[][] mB){
        // la matriz resultado de la multiplación tiene:
        // El número de filas de la mA
        // El número de columnas de la mB
        
        // Matriz resultante: número de filas de mA y número de columnas de mB
        int[][] producto = new int[mA.length][mB[0].length];
        
        // Por cada columna de la segunda matriz (B)
        // Cojo la longitud de la primera fila que dará el número de columnas de la segunda matriz
        for (int col = 0; col < mB[0].length; col++) {
            
            // Dentro recorremos las filas de la primera (A)
            for (int i = 0; i < mA.length; i++) {
                int suma = 0;
                
                // Y cada columna de la primera (A)
                for (int j = 0; j < mA[0].length; j++) {
                    // Multiplicamos y sumamos resultado
                    
                    suma += mA[i][j] * mB[j][col];
                    
                }
                
                // Lo acomodamos dentro del producto
                producto[i][col] = suma;
            }
        }
        return producto;
        
    }
    
    /**
     * 
     * @param m
     * @return 
     */
    private static int[][] trasponerMatriz(int[][] m){
        // las columnas de la matriz original serán las filas de la matriz traspuesta
        // las filas de la matriz orginal serán las columnas de la matriz traspuesta
        
        int[][] traspuesta = new int[m[0].length][m.length];
        
        //Recorro las filas de la matriz original
        for (int i = 0; i < m.length; i++) {
            // Recorro las columnas de cada fila de la matriz origal
            for (int j = 0; j < m[i].length; j++) {
                traspuesta[j][i] = m[i][j];
            }
            
        }
        return traspuesta;
        
    }
    
    private static void pintarMatriz(int[][] m){
        
        // Recorrer las filas
        for (int i = 0; i < m.length; i++) {
            // Recorrer las columnas de cada fila
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%d ",m[i][j]);
            }
            System.out.println("");
        }
    }
    
}
