/*
 * Mi primer programa. Practicando con variables de tipo entero.
 * Aprenderé:
 * - que Java es Case Sensitive
 * - sobreescribir valores en una variable
 * - que no puedo declarar la misma variable dos veces
 * Del día 14/09/23
 */
package EJEMPLOS.pruebavariables;

/**
 *
 * @author melola
 */
public class PruebasConVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 1.Variables
        int num_a = 1;
        int num_b = 2;
        
        int numA = 2;
        int numB = 25;
        
        int numa = 3;
        int numb = 25;
        
        int result;
        
        //System.out.println(result); //Esto da error
        //int result = num_a * num_b;
        
        // int num_a = 666; // Esto da error porque no puedo declarar la misma variable dos veces!!!
        
        // num_a = 666;
        
        System.out.print("Valor de num_a: ");
        System.out.println(num_a);
        
        System.out.print("Valor de numA: ");
        System.out.println(numA);
        
        System.out.print("Valor de numa: ");
        System.out.println(numa);
        
        num_a = 10;
        
        System.out.print("Nuevo valor de num_a: ");
        System.out.println(num_a);
        
        
        result = num_a * num_b;
        System.out.print("El resultado de la multiplicación es:");
        System.out.println(result);
        
        
        
    }
}

