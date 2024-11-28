/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/retosAlgoritmicos#reto-3
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el valor de a:");
        a = sc.nextInt();
        
        System.out.println("Escribe el valor de b:");
        b = sc.nextInt();
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("Los valores intercambiados");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        
    }
    
}
