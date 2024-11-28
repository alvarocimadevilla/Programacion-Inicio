/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/retosAlgoritmicos#reto-1
 * Dado un tiempo en minutos, calcula los días, horas y minutos que le corresponden.
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int minutos = 0;
        int dias = 0, horas = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe los minutos: ");
        minutos = sc.nextInt();
        
        
        dias = minutos / (24 * 60);  // 24 horas en un día, 60 minutos en una hora
        horas = (minutos % (24 * 60)) / 60;  // Restante después de calcular los días
        minutos = minutos % 60;  // Restante después de calcular las horas      
        
        System.out.println("Son "+dias+" dias, "+horas+" horas y "+minutos+" minutos");
        
        /*
        horas = minutos / 60;
        int minutos2 = minutos % 60;
        dias = horas / 24;
        int horas2 = horas % 24;*/
        
        //System.out.println(dias+" dias, "+horas2+" horas y "+minutos2+" minutos");        
        
        
        
        
        
    }
    
}
