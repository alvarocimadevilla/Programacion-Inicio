/*
 * https://github.com/profeMelola/Programacion-01-2023-24/tree/main/DE_ALGORITMOS_A_PROGRAMAS
 * 
 */
package mayormenor;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class MayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. Declaración de variables y objetos...
        // Solo es necesario declarar un objeto Scanner. 
        // Lo puedo reutilizar
        
        Scanner lector = new Scanner(System.in);
        int a,b;
        
        // 2. Leer a y b de teclado
        System.out.println("Introduce el primer número:");
        a = lector.nextInt(); //leo un valor entero por consola
        
        System.out.println("Introduce el segundo número:");
        b = lector.nextInt();
        
        // PRIMERA FORMA
        /*if (a == b){
            System.out.println("Son iguales!!!!"); 
        }else{
            //System.out.println("No son iguales");
            
            if (a > b){
                System.out.println("El valor a es mayor b");
            }else {
                System.out.println("El valor b es mayor a");
            }
            
        }*/
        
        
        // SEGUNDA FORMA
        /*if ( a== b){
            System.out.println("Son iguales!!!!"); 
        }else if (a>b){
            System.out.println("El valor a es mayor b");
        }else{
            System.out.println("El valor b es mayor a");
        }*/
        
        // TERCERA FORMA
        if ( a== b)
            System.out.println("Son iguales!!!!"); 
        else if (a>b)
            System.out.println("El valor a es mayor b");
        else
            System.out.println("El valor b es mayor a");
        
        

        lector.close();
        System.out.println("Chimpún!!!!");
        
    }
    
}
