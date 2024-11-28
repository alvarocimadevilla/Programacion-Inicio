package es.daw.practica2.lienzo.util;

import static es.daw.practica2.lienzo.SolPracticaLienzo.COLOR_BASE;
import static es.daw.practica2.lienzo.SolPracticaLienzo.NUM_COLS;
import static es.daw.practica2.lienzo.SolPracticaLienzo.colores;
import static es.daw.practica2.lienzo.SolPracticaLienzo.coloresCode;
import static es.daw.practica2.lienzo.SolPracticaLienzo.log;
import static es.daw.practica2.lienzo.util.Lienzo.cuboPintura;
import static es.daw.practica2.lienzo.util.Lienzo.deshacer;
import static es.daw.practica2.lienzo.util.Lienzo.dibujarCuadrado;
import static es.daw.practica2.lienzo.util.Lienzo.dibujarCuadro;
import static es.daw.practica2.lienzo.util.Lienzo.dibujarLineas;
import static es.daw.practica2.lienzo.util.Lienzo.limpiarLienzo;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Utils {


    /**
     * Función para sacar el menú de opciones
     */
    public static void menuOpciones() {
        System.out.println("Selecciona la operación que desea realizar:");
        System.out.println(" 1 - Dibujar líneas");
        System.out.println(" 2 - Dibujar cuadrado");
        System.out.println(" 3 - Cubo de pintura");
        System.out.println(" 4 - Deshacer");
        System.out.println(" 5 - Historial");
        System.out.println(" 6 - Limpiar");
        System.out.println(" 7 - Salir");

        int opcion = 0;
        while (opcion < 1 || opcion > 7) {
            System.out.print("Selección (introduzca número de opción): ");
            opcion = tecladoNumero();
        }

        switch (opcion) {
            case 1:
                System.out.println("Dibujar líneas");
                dibujarLineas();
                break;
            case 2:
                System.out.println("Dibujar cuadrado");
                dibujarCuadrado();
                break;
            case 3:
                System.out.println("Cubo de pintura");
                cuboPintura();
                break;
            case 4:
                System.out.println("Deshacer");
                deshacer();
                escribirLog("Deshacer");
                dibujarCuadro();
                menuOpciones();
                break;
            case 5:
                System.out.println("Historial");
                imprimirHistorial();
                break;
            case 6:
                limpiarLienzo();
                dibujarCuadro();
                menuOpciones();                
                break;
            case 7:
                System.out.println("El programa LIENZO ha terminado. Espero que te haya gustado");
                break;
        }
    }

    /**
     * Leer coordenada
     *
     * @return
     */
    public static int[] leerCoordenada() {
        int[] coordenada= {0,0};
        String entrada = "", letra;
        int numero;
        boolean coordenadaCorrecta = false;
        
        while (!coordenadaCorrecta) {
            System.out.print("Introduzca una coordenada válida (Ejemplo: a10): ");
            try {
                Scanner sm = new Scanner(System.in);
                sm.reset();
                entrada = sm.nextLine();
                
                
                if (entrada.matches("[a-z][0-9]{1,2}")){
                    // comprobar que tanto la letra como el numero están en rango
                    letra = entrada.substring(0, 1);
                    numero = Integer.parseInt(entrada.substring(1));
                    
                    // Si cumple la ER entonces va a empezar por una letra en minúsculas
                    
                    // Validar rango numérico
                    int minNum = 1;
                    int maxNum = NUM_COLS;
                    boolean rangoNumerosCorrecto = false;
                    if (numero >= 1 && numero <= NUM_COLS) 
                        rangoNumerosCorrecto = true;
                    else
                        System.out.println("Coordenada incorrecta.");
                    
                    
                    // actualizar boolean
                    
                    if (rangoNumerosCorrecto) {
                        coordenadaCorrecta = true;
                        System.out.println("Coordenada correcta. " + letra + " " + numero);
                        coordenada[0]=(int)letra.charAt(0)-97; //97 es el código ascii de la a minúscula
                        coordenada[1]= numero-1;
                    }
                } else {
                    System.out.println("Coordenada incorrecta.");
                }
            } catch (Exception e) {
                System.out.println("Excepción en teclado: " + e);
            }
        }
        return coordenada;
    }

    /**
     * Función para leer números enteros del teclado
     *
     * @return
     */
    public static int tecladoNumero() {
        int entrada = 0;
        try {
            Scanner sm = new Scanner(System.in);
            sm.reset();
            entrada = sm.nextInt();
            //sm.close();
        } catch (Exception e) {
            System.out.println("Excepción en teclado: " + e);
        }
        return entrada;

    }

    public static boolean leerEnter(){
        Scanner teclado = new Scanner(System.in);
        //Comparación para saber si se presiono Enter
        if (teclado.nextLine().isEmpty()) return true;
        else return false;
        
    }
            
    /**
     * 
     * @return 
     */
    public static int elegirColor() {
        int opcion = 0;

        System.out.println("Selecciones el color que desea emplear: ");
        for (int i = 0; i < colores.length; i++) {
            System.out.print((i + 1) + " - ");
            System.out.print(coloresCode[i]);
            System.out.println(colores[i]);
            System.out.print(COLOR_BASE);
        }
        while (opcion < 1 || opcion > colores.length) {
            System.out.print("Selección (introduzca número de opción): ");
            opcion = tecladoNumero();
        }
        return opcion;

    }

    /**
     * 
     * @param sentenciaLog 
     */
    public static void escribirLog(String sentenciaLog) {
        for(int i = log.length-1; i> 0; i--){
            log[i] = log[i-1];
        }
        log[0] = sentenciaLog;
    }
    
    /**
     * 
     */
    public static void imprimirHistorial(){
        System.out.println("Historial con las 10 últimas instrucciones, de más recienta a más antigua:");
        for(int i = 0; i <= log.length-1; i++){
            System.out.println(">"+(i+1) + " - " + log[i]);
        }
//        System.out.println("Introduzca un número para continuar...");
//        tecladoNumero();

        System.out.println("Pulsa enter para continuar...");
        leerEnter();
        
        limpiarPantalla();
        dibujarCuadro();
        menuOpciones();
    }
    
    /**
     * 
     */
    public static void limpiarPantalla(){
        System.out.print("\33[H\033[2J");
    }
    
    
    
    
}
