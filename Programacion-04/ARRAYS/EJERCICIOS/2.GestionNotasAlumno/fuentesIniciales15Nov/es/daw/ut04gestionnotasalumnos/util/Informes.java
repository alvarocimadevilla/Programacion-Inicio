/*
 * CLASE ENCARGADA DE REALIZAR TODOS LOS INFORMES
 */
package es.daw.ut04gestionnotasalumnos.util;

import static es.daw.ut04gestionnotasalumnos.GestionNotasVersion2.MODULOS;
import static es.daw.ut04gestionnotasalumnos.GestionNotasVersion2.nombresAlumnos;
import static es.daw.ut04gestionnotasalumnos.util.Utils.leerIntro;
import static es.daw.ut04gestionnotasalumnos.util.Utils.leerNumero;



/**
 *
 * @author melola
 */
public class Informes {
   
    /**
     * 
     * @param notas 
     */
    public static void gestionarInformes(float[][] notas) {
        int opcion = 6;
        do{
            System.out.println("**** SUBMENÚ DE INFORMES *****");
            System.out.println("1. Mostrar todas las notas\n"
                    + "2. Mostrar las notas de un módulo concreto\n"
                    + "3. Nota media de cada módulo\n"
                    + "4. Nota media de cada alumno\n"
                    + "5. Ver nota de un alumno en un módulo concreto\n"
                    + "6. Volver al menú principal\n"
                    + "-----------------------------------------\n"
                    + "Elige una opción:");

            opcion = leerNumero();

            switch (opcion) {
                case 1:
                    System.out.println("[OPCIÓN 1] Se van a mostrar las notas...");
                    mostrarNotas(notas);
                    break;
                case 2:
                    System.out.println("[OPCIÓN 2] Se va a mostrar las notas de un módulo concreto...");
                    mostrarNotasModuloConcreto(notas);
                    System.out.println("\tIndica el módulo del que quieres mostrar la nota");
                    break;
                case 3:
                    System.out.println("[OPCIÓN 3] Se va a mostrar la nota media de cada módulo");
                    mostrarNotaMediaPorModulo(notas);
                    break;
                case 4:
                    System.out.println("[OPCIÓN 4] Se va a mostrar la nota media de cada alumno");
                    mostrarNotaMediaPorAlumno(notas);
                    break;
                case 5:
                    System.out.println("[OPCIÓN 5] Se va a ver la nota de un alumno en un módulo concreto");
                    mostrarNotaAlumnoModuloConcreto(notas);
                    break;
                case 6:
                    System.out.println("Vuelvo al menú principal...");
                    break;
                default:
                    System.out.println("[AVISO] Debes elegir una opción del menú correcta");


            }
            leerIntro();
        }while(opcion != 6);
    }
    
    /**
     * Método que devuelve las notas de todos los alumnos
     * @param notas 
     */
    private static void mostrarNotas(float[][] notas){
        for (int fila=0;fila<notas.length;fila++) {
            System.out.println("\nNOTAS DEL ALUMNO "+nombresAlumnos[fila]+":");
            for(int columna=0;columna< notas[fila].length;columna++){
                System.out.print("\n\tEn "+MODULOS[columna]+": ");                
                System.out.println(notas[fila][columna]);
            }
        }
    }
    /**
     * Método que muestra las notas de un módulo concreto
     * PENDIENTE DE COMPLETAR!
     * @param notas 
     */
    private static void mostrarNotasModuloConcreto(float[][] notas){
        
    }
    
    /**
     * PENDIENTE DE COMPLETAR!
     * @param notas 
     */
    private static void mostrarNotaMediaPorAlumno(float[][] notas){
        
    }
    
    /**
     * PENDIENTE DE COMPLETAR!
     * @param notas 
     */
    private static void mostrarNotaMediaPorModulo(float[][] notas){
        
    }    
    
    /**
     * PENDIENTE DE COMPLETAR!
     * @param notas 
     */
    private static void mostrarNotaAlumnoModuloConcreto(float[][] notas){
        
    }       
    
    
}
