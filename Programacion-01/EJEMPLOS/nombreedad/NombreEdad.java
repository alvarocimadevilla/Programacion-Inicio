/*
 * Programa que muestra por consola distintos valores de variables
 * Aprenderás el uso del operador + para concatenar valores
 */
package EJEMPLOS.nombreedad;

/**
 *
 * @author melola
 */
public class NombreEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "Mari Luz";
        int edad = 48;
        int edad2 = 18;
        int total;
        
        total = edad + edad2;
        
        System.out.println("Hola, me llamo "+nombre+".");
        System.out.println("Tengo "+edad+" años!!");
        //System.out.println("La edad total es "+edad+edad2);
        //System.out.println("La edad total es "+(edad+edad2));
        System.out.println("La edad total es "+total);
        
    }
    
}
