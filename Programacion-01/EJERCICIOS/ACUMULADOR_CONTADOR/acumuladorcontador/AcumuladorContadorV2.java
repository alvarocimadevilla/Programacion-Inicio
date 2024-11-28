/*
 * https://github.com/profeMelola/Programacion-01-2023-24/tree/main/ACUMULADOR_CONTADOR
 */
package acumuladorcontador;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class AcumuladorContadorV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        String nombre;
        Scanner sc = new Scanner(System.in);
        float acumulador,notaMedia;

        // lógica (instrucciones)
        System.out.println("¿Cómo te llamas?");
        nombre = sc.nextLine();
        
        System.out.println("Introduce la nota del modulo 1:");
        acumulador = sc.nextFloat();
        
        System.out.println("Introduce la nota del modulo 2:");
        acumulador = acumulador + sc.nextFloat();
        
        System.out.println("Introduce la nota del modulo 3:");
        acumulador += sc.nextFloat();
        
        System.out.println("Introduce la nota del modulo 4:");
        acumulador += sc.nextFloat();
        
        System.out.println("Introduce la nota del modulo 5:");
        acumulador += sc.nextFloat();
        
        System.out.println("Introduce la nota del modulo 6:");
        acumulador += sc.nextFloat();
        
        notaMedia =acumulador/6;
        
        System.out.println("Hola "+nombre+", tu nota media es: "+notaMedia);
        
        // truncado
        System.out.println("Hola "+nombre+", tu nota media es: "+(int)notaMedia);
        
        System.out.println("Hola "+nombre+", tu nota media es: "+Math.round(notaMedia));
        
        System.out.println("Hola "+nombre+", tu nota media es: "+Math.ceil(notaMedia));
        
        System.out.println("Hola "+nombre+", tu nota media es: "+Math.floor(notaMedia));
        
    }
    
}
