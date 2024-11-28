/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/ARRAYS/EJERCICIOS/2.GestionNotasAlumno#programa-para-la-gesti%C3%B3n-de-notas-de-los-alumnos
 */
package es.daw.ut04gestionnotasalumnos;

import static es.daw.ut04gestionnotasalumnos.util.Informes.gestionarInformes;
import es.daw.ut04gestionnotasalumnos.util.Utils;
import static es.daw.ut04gestionnotasalumnos.util.Utils.leerNumero;
import static es.daw.ut04gestionnotasalumnos.util.Utils.pintaMenu;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class GestionNotasVersion2 {

    // DECLARACIONES A NIVEL GLOBAL DE LA APLICACIÓN
    public static final String[] MODULOS = {"PR", "BD", "SI", "LM", "ED", "FOL"};
    public static String[] nombresAlumnos;    
    public static Scanner TECLADO = new Scanner(System.in);



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 3;

        // Declaro el array bidimensional para guardar las notas
        // Lo declaro local al main con la intención de pasarlo como argumento en las distintas funciones
        float[][] notasAlumno = null;
        
        do {
            pintaMenu();
            opcion = leerNumero();

            switch (opcion) {
                case 1:
                    notasAlumno = cargarNotas();
                    break;
                case 2:
                    if (notasAlumno == null){
                        System.out.println("No se pueden generar informes si no has introducido las notas");
                        Utils.leerIntro(); //en vez de importar llamo directamente a la clase con su full name
                    }
                    else
                        gestionarInformes(notasAlumno);
                    break;
                case 3:
                    System.out.println("Vas a salir del programa...");
                    break;
                case 4:
                    // Cargar datos ficticios
                    float[][] notasAlumno2 ={
                        {5,4,8,7,6,2},
                        {8f,7.5f,6f,5f,4f,9f}
                    };
                    // notasAlumno = {{5,4,8,7,6,2},{8f,7.5f,6f,5f,4f,9f}};// DA ERROR
                    notasAlumno = notasAlumno2;
                    nombresAlumnos = new String[2];
                    nombresAlumnos[0]="Pepito";
                    nombresAlumnos[1]="Menganito";
                    System.out.println("Datos cargados automáticamente...");
                    break;
                default:
                    System.out.println("Debes elegir una opción del menú correcta");
            }

        } while (opcion != 3);

    }

    /**
     * Método que pide al usuario el número de alumnos de los que va a cargar
     * las notas y carga todas esas notas de los 6 módulos en una matriz
     *
     * @return matriz con todas las notas de los alumnos cargadas
     */
    private static float[][] cargarNotas() {
        System.out.println("Vas a cargar las notas completas de cada alumno!!");
        System.out.println("¿De cuántos alumnos vas a introducir notas?");
        int numAlumnos = leerNumero();
        TECLADO.nextLine(); //coo vo a leer luego String (por el nombre del alumno)...
        
        // Una vez que se el número de alumnos tengo que declarar:
        // - La matriz con su número de filas
        // - El array de nombres con tu tamaño (nombres de los alumnos)
        float[][] notas = new float[numAlumnos][MODULOS.length];
        nombresAlumnos = new String[numAlumnos];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce el nombre del alumno <" + (i + 1) + ">:");
            nombresAlumnos[i] = TECLADO.nextLine();

            System.out.println("\tAhora vas a introducir las notas de " + nombresAlumnos[i]);

            for (int j = 0; j < notas[i].length; j++) {
                //for (int j = 0; j < MODULOS.length; j++) {
                System.out.println("\tIntroduce la nota de " + MODULOS[j]);
                notas[i][j] = TECLADO.nextFloat();
            }

            TECLADO.nextLine();
        }

        return notas;

    }


}
