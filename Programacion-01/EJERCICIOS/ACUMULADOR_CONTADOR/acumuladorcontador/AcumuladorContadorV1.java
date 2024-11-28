/*
 * https://github.com/profeMelola/Programacion-01-2023-24/tree/main/ACUMULADOR_CONTADOR
 */
package acumuladorcontador;

import java.util.Scanner; //clase del paquete de utilidades del jdk

/**
 *
 * @author melola
 */
public class AcumuladorContadorV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaración de variables
        String nombre;
        Scanner sc = new Scanner(System.in);
        float nota1,nota2,nota3,nota4,nota5,nota6,notaMedia;

        // lógica (instrucciones)
        System.out.println("¿Cómo te llamas?");
        nombre = sc.nextLine();
        
        System.out.println("Introduce la nota del modulo 1:");
        nota1 = sc.nextFloat();
        
        System.out.println("Introduce la nota del modulo 2:");
        nota2 = sc.nextFloat();
        
        System.out.println("Introduce la nota del modulo 3:");
        nota3 = sc.nextFloat();
        
        System.out.println("Introduce la nota del modulo 4:");
        nota4 = sc.nextFloat();
        
        System.out.println("Introduce la nota del modulo 5:");
        nota5 = sc.nextFloat();
        
        System.out.println("Introduce la nota del modulo 6:");
        nota6 = sc.nextFloat();
        
        notaMedia = (nota1+nota2+nota3+nota4+nota5+nota6)/6;
        
        System.out.println("Hola "+nombre+", tu nota media es: "+notaMedia);
        
        // truncado
        System.out.println("Hola "+nombre+", tu nota media es: "+(int)notaMedia);
        
        System.out.println("Hola "+nombre+", tu nota media es: "+Math.round(notaMedia));
        
        System.out.println("Hola "+nombre+", tu nota media es: "+Math.ceil(notaMedia));
        
        System.out.println("Hola "+nombre+", tu nota media es: "+Math.floor(notaMedia));
        
        
    }
    
}
