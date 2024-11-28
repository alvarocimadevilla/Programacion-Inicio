/*
 * CLASE DE UTILIDADES CON MÉTODOS AUXILIARES
 */
package es.daw.ut04gestionnotasalumnos.util;

import static es.daw.ut04gestionnotasalumnos.GestionNotasVersion2.TECLADO;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Utils {
    /**
     * Método que pinta el menú principal por consola
     */
    public static void pintaMenu() {
        System.out.println("********* PROGRAMA DE GESTIÓN DE NOTAS DE ALUMNOS ********");
        System.out.println("1. Cargar datos de alumnos");
        System.out.println("2. Informes");
        System.out.println("3. Salir");
        System.out.println("----------------");
        System.out.println("4. TRUQUI!!!! PARA NO TENER QUE METER NOTAS TODO EL RATO (Cargar datos de alumnos ficticios)");
        System.out.println("-----------------");
        System.out.println("Elige una opción");
    }
    
     /**
     * Hasta que no se escriba un número que repita
     *
     * @return
     */
    public static int leerNumero() {
        boolean correcto = false;
        int opcion = 0;
        try {
            while (!correcto) {
                opcion = TECLADO.nextInt();
                correcto = true;
            }
        } catch (Exception e) {
            System.out.println("Excepción de teclado");
            TECLADO.nextLine();
        }
        return opcion;
    }
    
    public static void leerIntro(){
        TECLADO.nextLine();
        System.out.println("Pulsa INTRO para continuar...");
        boolean intro = false;
        do{
            intro = TECLADO.nextLine().isBlank();
        }
        while(!intro);
            
        
    }

}
