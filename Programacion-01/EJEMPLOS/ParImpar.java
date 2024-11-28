/*
 * Ejemplos con Scanner
 */
package ut02ut03;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables
        Scanner sc = new Scanner(System.in);
        
        int num = 0; // variable que guarda el número introducido por el usuario
        int resto = 0; //variable que guarda el resto de la división
        
        //int num;
        
        System.out.println("**********************");
        System.out.println("*   ES PAR O IMPAR   *");
        System.out.println("**********************");
        
        System.out.println("Escribe un número: ");
        num = sc.nextInt();
        
        //System.out.println("El usuario ha escrito el número: "+num);
        
        //System.out.print("El usuario ha escrito el número:");
        //System.out.println(num);
        
        resto = num % 2;
        
        //System.out.println("El resto de "+num+"/2 es: "+resto);
        //System.out.println("El resto es: "+resto);
        //System.out.println(resto);
        
        
        if ( resto == 0)
            System.out.println("El número es par");
        else
            System.out.println("El número es impar");
             
        /*
        if ( resto == 0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }*/
        
        /*
        // Sobra hacer el else if porque si el resto no es cero es que es distinto
        else if( resto != 0){
            System.out.println("El número es impar");
        }
        */ 
        /*
        if ( resto != 0){
            System.out.println("El número es impar");
        }*/
        
        System.out.println("Fin del programa!!!!!!!!!");
        
    }
    
}
