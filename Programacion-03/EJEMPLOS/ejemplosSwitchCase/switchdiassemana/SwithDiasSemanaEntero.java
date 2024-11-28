/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJEMPLOS/ejemplosSwitchCase#ejercicio-2-d%C3%ADas-semana-entero
 */
package switchdiassemana;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class SwithDiasSemanaEntero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número del 1 al 7:");
        int numero = sc.nextInt();

        String diaSemana;

        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Error: Debes ingresar un número del 1 al 7";
                break;
        }

        System.out.println("Día de la semana: " + diaSemana);
        sc.close();
    }

}
