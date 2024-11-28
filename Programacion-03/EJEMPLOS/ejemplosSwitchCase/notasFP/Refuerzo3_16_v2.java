/*
 */
package notasFP;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Refuerzo3_16_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Escribe la nota de tu examen: ");
        nota = sc.nextInt();
        
        //nota válida de FP
        if (nota > 0 && nota <= 10){
            System.out.println("Perfecto, la nota está entre 1 y 10");
            if (nota <3){
                System.out.println("Muy deficiente");
            }
            else if(nota >=3 && nota <5){
                System.out.println("Deficiente");
            }
            else if (nota >=5 && nota <6){
                System.out.println("Suficiente");
            }
            else if (nota == 6){
                System.out.println("Bien");
            }
            else if (nota >6 && nota < 9){
                System.out.println("Notable");
            }
            else{
                System.out.println("Sobresaliente");
            }
            
        }else if (nota == 0 ){
            System.out.println("En FP no se puede poner un 0");
        }
        else if (nota < 0){
            System.out.println("En FP no se puede poner una nota negativa");
        }
        else{
            System.out.println("En FP no puede ser mayor que 10");
        }
        
        
        
        // -------------------
        if (nota < 0)
            System.out.println("La nota en FP no puede ser negativa");
        else if (nota > 10)
            System.out.println("La nota en FP no puede ser mayor que 10");
        else if (nota == 0)
            System.out.println("No está permitido poner 0 en FP");
        else{
            // está entre 1 y 10
        }
        
    } // end main
        
}// end class
