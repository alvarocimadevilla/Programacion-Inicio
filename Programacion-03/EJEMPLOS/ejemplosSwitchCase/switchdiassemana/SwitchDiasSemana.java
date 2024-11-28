/*
 * Click https://github.com/profeMelola/Programacion-03-2023-24/blob/main/ejemplosSwitchCase/readme.md#ejercicio-2-d%C3%ADas-semana-entero
 */
package switchdiassemana;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class SwitchDiasSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables 
        String dia;
        
        // Objetos
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el día de la semana: ");
        dia = sc.nextLine();
        
        /*
        // Hay dos método para convertir una cadena de texto a May y Min
        String cadena = "Hola";
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
        */
        
        dia = dia.toLowerCase();
        
        switch (dia){
            case "lunes":
                System.out.println("Es el primer día de clase de la semana!");
                break;
            case "martes":
            case "miércoles":
            case "jueves":
                System.out.println("Estamos a mitad de semana");
                break;
            case "viernes":
                System.out.println("Han acabado las clases esta semana!!!");
                break;
            case "sábado":
            case "domingo":
                System.out.println("Estamos a finde..");
                break;
            default:
                System.out.println("No has escrito bien el nombre de la semana");
            
        }
    }
}
