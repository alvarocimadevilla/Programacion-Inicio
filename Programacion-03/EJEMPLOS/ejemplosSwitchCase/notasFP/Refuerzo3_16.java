/*
 */
package notasFP;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Refuerzo3_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Escribe la nota de tu examen: ");
        nota = sc.nextInt();
        
        /*
        // VERSIÓN LARGA
        if (nota > 0){
            if (nota <3){
                System.out.println("Muy deficiente");
            }
            else if(nota < 5){
                System.out.println("Insuficiente");
            }
            else if (nota < 6){
                System.out.println("Bien");
            }
            else if (nota < 9){
                System.out.println("Notable");
            }
            else if (nota == 11){
                System.out.println("Sobresaliente");
            }
            else{
                System.out.println("Eres el master del universo!!!");
                System.out.println("Pero es imposible sacar más de");
            }
        }else if (nota == 0){
            System.out.println("Has sacado un pedazo 0!!!");
        }
        else{
            System.out.println("Has metido mal la nota!");
        }
        */
        
        // VERSIÓN CORTA
        if (nota > 0){
            if (nota <3)
                System.out.println("Muy deficiente");
            else if(nota < 5)
                System.out.println("Insuficiente");
            else if (nota <= 6)
                System.out.println("Bien");
            else if (nota < 9)
                System.out.println("Notable");
            else if (nota < 11)
                System.out.println("Sobresaliente");
            else{
                System.out.println("Eres el master del universo!!!");
                System.out.println("Pero es imposible sacar más de 10");
            }
        }else if (nota == 0)
            System.out.println("Has sacado un pedazo 0!!!");
        else
            System.out.println("Has metido mal la nota!");
        
        
    }
    
}
