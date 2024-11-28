/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.ejemplosarray;

import java.util.Arrays;

/**
 *
 * @author melola
 */
public class EjemplosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] miArray = new int[10];
        
        int miArray2[] = new int[10];
        
        String miArray3[] = new String[5];
        
        String[] miArray4 = new String[5];
        
        System.out.println("Posición 1 del primer array:");
        System.out.println(miArray[0]);
        
        // posición 5 poner el valor 666
        miArray[4] = 666;

        System.out.println("Recorro el array entero:");
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(i+":"+miArray[i]);
        }
        
        
        System.out.println("Ejemplo de array de 1 a 10!!!");
        // Rellenar un array de 1 a 10
        for (int i = 0; i < 10; i++) {
            miArray2[i] = i+1;
        }
        
        System.out.println(miArray2);
        
        System.out.println("DIFERENTES FORMAS DE PINTAR EL CONTENIDO DE UN ARRAY:");
        System.out.println("Forma 1");
        for (int i = 0; i < miArray2.length; i++) {
            System.out.println(miArray2[i]);
        }
        
        System.out.println("Forma 2");
        for (int num : miArray2) {
            System.out.println(num);
        }
        
        System.out.println("Forma 3");
        System.out.println(Arrays.toString(miArray2));
    }
    
}
