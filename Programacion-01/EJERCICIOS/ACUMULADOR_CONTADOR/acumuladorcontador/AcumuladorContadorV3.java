/*
 * https://github.com/profeMelola/Programacion-01-2023-24/tree/main/ACUMULADOR_CONTADOR
 */
package acumuladorcontador;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class AcumuladorContadorV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Constante
        final int NUM_MODULOS = 6;
        

        // Declaración de variables
        String nombre;
        Scanner sc = new Scanner(System.in);
        float acumulador=0,notaMedia;
        
        // lógica (instrucciones)
        System.out.println("¿Cómo te llamas?");
        nombre = sc.nextLine();
        
        for( int i = 1; i <= NUM_MODULOS; i++){
            System.out.println("Introduce la nota del modulo "+i+":");
            acumulador += sc.nextFloat();
        }
        
        notaMedia =acumulador/NUM_MODULOS;
        
        System.out.println("Hola "+nombre+", tu nota media es: "+notaMedia);
        
        // truncado
        System.out.println("Hola "+nombre+", tu nota media es: "+(int)notaMedia);
        
        System.out.println("Hola "+nombre+", tu nota media es: "+Math.round(notaMedia));
        
        System.out.println("Hola "+nombre+", tu nota media es: "+Math.ceil(notaMedia));
        
        System.out.println("Hola "+nombre+", tu nota media es: "+Math.floor(notaMedia));
        
        System.out.println("EL NÚMERO PI ES: "+Math.PI);
        
    }
    
}
