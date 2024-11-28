/*
 * 
 * EJEMPLO CON DATOS FIJOS. SIRVE PARA ENTENDER CÓMO MANEJAR UNA MATRIZ.
 */
package es.daw.ut04gestionnotasalumnos;

import java.util.Arrays;

/**
 *
 * @author melol
 */
public class GestionNotasVersion1 {

    static String[] nombresAlumnos;
    
    static final String[] MODULOS = {"PR", "LM", "BD", "SI", "EN", "FOL"};

    public static void main(String[] args) {

        // ------------------------------------------------
        // TRABAJANDO CON 4 ALUMNOS Y 6 NOTAS CADA ALUMNO
        // ------------------------------------------------
        int numAlumnos = 4;
        int numModulos = 6;
        
        // DIFERENTES FORMAS DE CREAR ARRAYS UNIDIMENSIONALES (VECTORES)
        // CON LAS NOTAS
        
        // Alumno 1
        float[] notas1 = {4.5f, 5, 7, 8.3f, 10, 5};
        // Alumno 2
        float[] notas2 = {3 , 5, 6.7f, 9, 2, 3.4f};
        // Alumno 3
        float[] notas3 = {9 , 5, 6.7f, 9, 3, 5.4f};
        // Alumno 4
        float[] notas4 = new float[numModulos];
        notas4[0] = 5;
        notas4[1] = 6;
        notas4[2] = 7.5f;
        notas4[3] = 5.8f;
        notas4[4] = 3;
        notas4[5] = 9;
        
        // ------------------------------
        // ----------------------------
        // MATRIZ (ALUMNOS X NOTA_MODULO)
        // primero las filas y luego las columnas
        // las filas == alumnos
        // las columnas ==  notas
        
        // DIFERENTES FORMAS DE METER NOTAS EN UNA MATRIZ
        
        // 1. INICIALIZACIÓN CELDA A CELDA
        float[][] notasClase1 = new float[numAlumnos][numModulos]; 
        
        // notas del Alumno1
        notasClase1[0][0] = 4.5f;
        notasClase1[0][1] = 5;
        notasClase1[0][2] = 7;
        notasClase1[0][3] = 8.3f;
        notasClase1[0][4] = 10;
        notasClase1[0][5] = 5;
        
        // notas del Alumno2
        notasClase1[1][0] = 3;
        notasClase1[1][1] = 5;
        notasClase1[1][2] = 6.7f;
        notasClase1[1][3] = 9;
        notasClase1[1][4] = 2;
        notasClase1[1][5] = 3.4f;
        
        // notas del Alumno3
        notasClase1[2][4] = 3;
        
        // notas del Alumno4
        
        //pendiente rellenar el resto de celdas....
        
        //2.  INICIALIZACIÓN FILA A FILA
        float[][] notasClase2 ={
            {4.5f, 5, 7, 8.3f, 10, 5},
            {3 , 5, 6.7f, 9, 2, 3.4f},
            {9 , 5, 6.7f, 9, 3, 5.4f},
            {1,1,1,1,1,1}
        };
        
        float[][] notasClase3 ={notas1,notas2,notas3,notas4};
        
        float[][] notasClase4 ={notas1,{3 , 5, 6.7f, 9, 2, 3.4f},notas3,notas4};
        
        float[][] notasClase5 = new float[4][6];
        notasClase5[0] = notas1;
        notasClase5[1] = notas2;
        notasClase5[2] = notas3;
        notasClase5[3] = notas4;
        
        // ------------------------------
        // -------------
        // DAMOS POR HECHO QUE EL PROFESOR HA INDICADO QUE VA A TRABAJAR CON 4 ALUMNOS
        //4 es el número de alumnos y el número de filas de la matriz
        nombresAlumnos = new String[numAlumnos]; 
        nombresAlumnos[0] = "Pepe";
        nombresAlumnos[1] = "Ana";
        nombresAlumnos[2] = "María";
        nombresAlumnos[3] = "Carlos";
        // ---------------
        // ------------------------------
        
        // ------------------------------
        // AHORA VAMOS A PINTAR DATOS DE LA MATRIZ
        // ------------------------------
        System.out.println("* LAS FILAS DE LA MATRIZ SON LAS NOTAS OBTENIDAS POR EL ALUMNO EN LOS DIFERENTES MÓDULOS:");
        pintaFilasMatriz(notasClase5);
        
        System.out.println("\nPINTAR LA MATRIZ ENTERA: ");
        pintaMatriz(notasClase5);
        
        System.out.println("\n* LAS COLUMNAS DE LA MATRIZ SON LAS NOTAS DE LOS ALUMNOS POR MÓDULO:");
        System.out.println("\tNotas de los alumnos en el módulo BD:");
        pintaColumna(notasClase5,2);
        System.out.println("-----");
        System.out.println("\tNotas de los alumnos en el módulo PR:");
        pintaColumna(notasClase5,0);
         

    }

    /**
     * LAS FILAS DE LA MATRIZ SON LAS NOTAS OBTENIDAS POR EL ALUMNO EN LOS DIFERENTES MÓDULOS
     * @param matriz
     * @param nombres
     */
    private static void pintaFilasMatriz(float[][] matriz) {

        // Recorremos el número de filas
        for (int i = 0; i < matriz.length; i++) {
            //System.out.println(matriz[i]); //sale dir memoria
            System.out.println("Notas del alumno " + nombresAlumnos[i]);
            System.out.println(Arrays.toString(matriz[i]));
        }

    }

    /**
     * pintar celda a celda
     *
     * @param matriz
     */
    private static void pintaMatriz(float[][] matriz) {
        // bucle para recorrer las filas 
        for (int i = 0; i < matriz.length; i++) {
            // bucle para recorrer las columnas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }
    }

    /**
     * LAS COLUMNAS DE LA MATRIZ SON LAS NOTAS DE LOS ALUMNOS POR MÓDULO
     * @param matriz
     * @param col es la posición del módulo en el array de MODULOS y en la
     * columna de la matriz
     */
    private static void pintaColumna(float[][] matriz, int col) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Alumno " + nombresAlumnos[i] + " ha sacado en " + MODULOS[col] + " un <" + matriz[i][col] + ">");
        }

    }


}
