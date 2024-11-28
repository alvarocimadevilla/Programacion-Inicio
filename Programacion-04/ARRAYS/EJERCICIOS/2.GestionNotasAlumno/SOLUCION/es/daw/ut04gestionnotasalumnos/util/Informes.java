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
                    + "3. Nota media de un módulo concreto\n"
                    + "4. Nota media de cada alumno\n"
                    + "5. Ver nota de un alumno en un módulo concreto\n"
                    + "6. Nota media de todos los módulos\n"
                    + "7. Volver al menú principal\n"
                    + "-----------------------------------------\n"
                    + "Elige una opción:");

            opcion = leerNumero();
            int modulo;
            float notaMedia;
            
            switch (opcion) {
                case 1:
                    System.out.println("[OPCIÓN 1] Se van a mostrar las notas...");
                    mostrarNotas(notas);
                    break;
                case 2:
                    System.out.println("[OPCIÓN 2] Se va a mostrar las notas de un módulo concreto...");
                    modulo = elegirModulo();
                    mostrarNotasModuloConcreto(notas,modulo-1);
                    break;
                case 3:
                    System.out.println("[OPCIÓN 3] Se va a mostrar la nota media de un módulo concreto");
                    modulo = elegirModulo();
                    
                    notaMedia = obtenerNotaMediaPorModulo(notas,modulo-1);
                    System.out.println("La nota media de "+MODULOS[modulo-1]+" es:"+notaMedia);
                    
                    break;
                case 4:
                    System.out.println("[OPCIÓN 4] Se va a mostrar la nota media de cada alumno");
                    mostrarNotaMediaAlumnos(notas);
                    break;
                case 5:
                    System.out.println("[OPCIÓN 5] Se va a ver la nota de un alumno en un módulo concreto");
                    modulo = elegirModulo();
                    int alumno = eligeAlumno();
                    
                    System.out.println("La nota es: "+obtenerNotaAlumnoModuloConcreto(notas,alumno-1,modulo-1));
                   
                    
                    break;
                case 6:
                    System.out.println("[OPCIÓN 6] Mostrar nota media de todos los módulos");
                    for (int i = 0; i < MODULOS.length; i++) {
                        notaMedia = obtenerNotaMediaPorModulo(notas,i);
                        System.out.printf("\tLa nota media del módulo %s es %.2f \n",MODULOS[i],notaMedia);
                        
                    }
                    
                case 7:
                    System.out.println("Vuelvo al menú principal...");
                    break;
                default:
                    System.out.println("[AVISO] Debes elegir una opción del menú correcta");


            }
            leerIntro();
        }while(opcion != 7);
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
     * 
     * @param notas 
     */
    private static void mostrarNotasModuloConcreto(float[][] notas, int modulo){
        //i => fila ==> alumno
        //j => columna ==> módulo
        
        // Recorrer las filas (alumnos)
        System.out.println("Las notas del módulo "+MODULOS[modulo]+" son:");
        
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\tDel alumno %s:",nombresAlumnos[i]);
            System.out.println(notas[i][modulo]);
        }
        
        
    }
    
    /**
     * 
     * @param notas 
     */
    private static float obtenerNotaMediaPorModulo(float[][] notas, int modulo){
        float sumaNotas = 0;
        
        //recorro filas que son los alumnos
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i][modulo];
        }
        
        return sumaNotas/notas.length;
        
    }    
    
    /**
     * 
     * @param notas 
     */
    private static void mostrarNotaMediaAlumnos(float[][] notas){
        // cada fila es un alumno
        for (int i = 0; i < notas.length; i++) {
            
            // cada columna es la nota final de un módulo
            float sumaNotas = 0;
            for (int j = 0; j < notas[i].length; j++) {
                sumaNotas += notas[i][j];
            }
            
            System.out.println("La nota media del alumno "+nombresAlumnos[i]+" es:"+(sumaNotas/MODULOS.length));
        }
        
    }
    
    
    /**
     * PENDIENTE DE COMPLETAR!
     * @param notas 
     */
    private static float obtenerNotaAlumnoModuloConcreto(float[][] notas, int alumno, int modulo){
        return notas[alumno][modulo];
    }       
    
    
    //***********
    private static int elegirModulo(){
        System.out.println("\nLISTADO DE MÓDULOS:");
        for (int i = 0; i < MODULOS.length; i++) {
            System.out.print((i+1)+". "+MODULOS[i]);
            if (i <  (MODULOS.length - 1))
                System.out.print(", ");
        }
        System.out.println("\n************************************");
        System.out.println("Elige una opción:");
        return leerNumero();
        
    }
    
    private static int eligeAlumno(){
        System.out.println("\nLISTADO DE ALUMNOS:");
        for (int i = 0; i < nombresAlumnos.length; i++) {
            System.out.println((i+1)+". "+nombresAlumnos[i]);
        }
        System.out.println("************************");
        System.out.println("Elige una opción:");
        return leerNumero();
    }
    
}
