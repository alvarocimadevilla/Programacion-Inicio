/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.ut04clonadomatrices;

import java.util.Arrays;

/**
 *
 * @author melola
 */
public class UT04ClonadoMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[][] matrizA = {
            {"pera","manzana"},
            {"chocolate","chuche"}
        };
        
        String[][] matrizB = new String[2][2];
        
        String[][] matrizC = matrizA.clone();
        
        System.out.println("Matriz original:");
        pintaMatriz(matrizA);
        System.out.println("\nMatriz copia:");
        pintaMatriz(matrizC);
        
        //matrizA[1][1] = "tarta";
        System.out.println("**********************************");
        System.out.println("Modificado chuche por tarta!!!");
        
        System.out.println("Matriz original:");
        pintaMatriz(matrizA);
        
        System.out.println("\nMatriz copia:");
        pintaMatriz(matrizC);
        
        System.out.println("**********************************");
        // VAMOS A HACER UNA COPIA PROFUNDA
        matrizB = clonarMatriz(matrizA);
        System.out.println("Matriz original:");
        pintaMatriz(matrizA);
        
        System.out.println("\nMatriz copia:");
        pintaMatriz(matrizB);
        
        matrizA[1][1] = "tigretón";
        
        System.out.println("\nModificado chuche por tigretón!!!");
        System.out.println("Matriz original:");
        pintaMatriz(matrizA);
        
        System.out.println("\nMatriz copia:");
        pintaMatriz(matrizB);
        
        
        
        
        
        
        
        
        
    }
    
    /**
     * 
     * @param m 
     */
    private static void pintaMatriz(String[][] m){
        
        for (String[] fila : m) {
            System.out.println(Arrays.toString(fila));
        }
        
    }
    
    /**
     * clonado de matrices de String
     * @param m
     * @return 
     */
    private static String[][] clonarMatriz(String[][] m){
        String[][] matrizClonada = new String[m.length][];
        
        int i=0;
        for (String[] strings : m) {
            matrizClonada[i] = strings.clone();
            i++;
        }
        return matrizClonada;
    }
    
}
