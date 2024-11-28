/**
 * Clase principal ejecutable de la herramienta LIENZO
 * 
 */
package es.daw.practica2.lienzo;

import static es.daw.practica2.lienzo.util.Historial.*;
import static es.daw.practica2.lienzo.util.Lienzo.*;
import static es.daw.practica2.lienzo.util.Utils.*;

/**
 * 
 * @author Adrian Bogdan
 */
public class AppLienzo {
    static boolean finPrograma = false;
    
    private static final String[][] lienzo = new String[LETRAS.length][NUM_COLS];
    
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println(" ▄█        ▄█     ▄████████ ███▄▄▄▄    ▄███████▄   ▄██████▄       ████████▄     ▄████████  ▄█     █▄  \n" +
"███       ███    ███    ███ ███▀▀▀██▄ ██▀     ▄██ ███    ███      ███   ▀███   ███    ███ ███     ███ \n" +
"███       ███▌   ███    █▀  ███   ███       ▄███▀ ███    ███      ███    ███   ███    ███ ███     ███ \n" +
"███       ███▌  ▄███▄▄▄     ███   ███  ▀█▀▄███▀▄▄ ███    ███      ███    ███   ███    ███ ███     ███ \n" +
"███       ███▌ ▀▀███▀▀▀     ███   ███   ▄███▀   ▀ ███    ███      ███    ███ ▀███████████ ███     ███ \n" +
"███       ███    ███    █▄  ███   ███ ▄███▀       ███    ███      ███    ███   ███    ███ ███     ███ \n" +
"███▌    ▄ ███    ███    ███ ███   ███ ███▄     ▄█ ███    ███      ███   ▄███   ███    ███ ███ ▄█▄ ███ \n" +
"█████▄▄██ █▀     ██████████  ▀█   █▀   ▀████████▀  ▀██████▀       ████████▀    ███    █▀   ▀███▀███▀  \n" +
"▀                                                                                                     ");
        System.out.println("[LIENZO DAW - DIBUJAR POR CONSOLA] Realizado por Adrian Bogdan");
        leerEnter("Pulsa intro para mostrarte el lienzo");
        
        limpiarLienzo(lienzo);
        limpiarHistorial();
        
        while (!finPrograma)
            menuOpciones();

    }
    
    private static void menuOpciones() {
        limpiarPantalla();
        int opcion;
        dibujarLienzo(lienzo);
        System.out.println("Selecciona la operación que desea realizar:");
        System.out.println(" 1 - Dibujar líneas");
        System.out.println(" 2 - Dibujar formas");
        System.out.println(" 3 - Cubo de pintura");
        System.out.println(" 4 - Deshacer");
        System.out.println(" 5 - Historial");
        System.out.println(" 6 - Limpiar");
        System.out.println(" 7 - Salir");
        
        do {
            opcion = leerEntero("Selección (introduzca número de opción): ");
            switch (opcion) {
                case 1:
                    menuLineas();
                    break;
                case 2:
                    menuFormas();
                    break;
                case 3:
                    menuCuboPintura();
                    break;
                case 4:
                    deshacerLienzo(lienzo);
                    break;
                case 5:
                    mostrarHistorial();
                    break;
                case 6:
                    guardarAccionYLienzo("Limpiado el lienzo", lienzo);
                    limpiarLienzo(lienzo);
                    break;
                case 7:
                    finPrograma = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion > 7);
    }
    
    private static void menuLineas(){
        int opcion;
        System.out.println("Dibujar líneas");
        System.out.println("¿Que tipo de linea desea dibujar?");
        System.out.println(" 1 - Línea horizontal -");
        System.out.println(" 2 - Línea vertical   |");
        System.out.println(" 3 - Línea diagonal   /");
        System.out.println(" 4 - Línea diagonal   \\");
        System.out.println(" 5 - Salir");
        do{
            opcion = leerEntero("Selección (introduzca número de opción): ");
            
            switch (opcion) {
                case 1:
                    dibujarLineaEntera(lienzo,leerCoordenada("Introduzca una coordenada válida (Ejemplo: a10): "), xy(1, 0));
                    break;
                case 2:
                    dibujarLineaEntera(lienzo,leerCoordenada("Introduzca una coordenada válida (Ejemplo: a10): "), xy(0, 1));
                    break;
                case 3:
                    dibujarLineaEntera(lienzo,leerCoordenada("Introduzca una coordenada válida (Ejemplo: a10): "), xy(1, -1));
                    break;
                case 4:
                    dibujarLineaEntera(lienzo, leerCoordenada("Introduzca una coordenada válida (Ejemplo: a10): "), xy(1, 1));
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion > 5);
    }
    
    private static void menuFormas(){
        int opcion;
        System.out.println("Dibujar formas");
        System.out.println("¿Que tipo de forma desea dibujar?");
        System.out.println(" 1 - Rectangulo");
        System.out.println(" 2 - Cuadrado");
        System.out.println(" 3 - Rombo");
        System.out.println(" 4 - Salir");
        do{
            opcion = leerEntero("Selección (introduzca número de opción): ");
            
            switch (opcion) {
                case 1: // Dibujar rectangulo
                    dibujarRectangulo(
                            lienzo,
                            leerCoordenada("Introduzca una coordenada válida (Ejemplo: a10): "), 
                            leerEntero("Introduce la anchura: "),
                            leerEntero("Introduce la altura: "));
                    break;
                case 2: // Dibujar cuadrado
                    dibujarCuadrado(
                            lienzo,
                            leerCoordenada("Introduzca una coordenada válida (Ejemplo: a10): "), 
                            leerEntero("Introduce la longitud del lado: "));
                    break;
                case 3: // Dibujar rombo
                    dibujarRombo(
                            lienzo,
                            leerCoordenada("Introduzca una coordenada válida (Ejemplo: a10): "), 
                            leerEntero("Introduce la longitud del lado: "));
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }while (opcion > 4);
    }
    
    private static void menuCuboPintura(){
        int opcion;
        int[] coordenadas;
        String[] colores = {"Blanco", "Rojo", "Verde", "Amarillo", "Azul", "Morado", "Cyan"};
        System.out.println("Cubo de pintura");
        System.out.println("Selecciones la coordenada que desea pintar.");
        coordenadas = leerCoordenada("Introduzca una coordenada válida (Ejemplo: a10): ");
        System.out.println("Selecciona el color que deseas implementar");
        System.out.printf("1- %s\n", WHITE + "Blanco" + RESET);
        System.out.printf("2- %s\n", RED + "Rojo" + RESET);
        System.out.printf("3- %s\n", GREEN + "Verde" + RESET);
        System.out.printf("4- %s\n", YELLOW + "Amarillo" + RESET);
        System.out.printf("5- %s\n", BLUE + "Azul" + RESET);
        System.out.printf("6- %s\n", PURPLE + "Morado" + RESET);
        System.out.printf("7- %s\n", CYAN + "Cyan" + RESET);
        do{
            opcion = leerEntero("Selección (introduzca número de opción): ");
            switch (opcion) {
                case 1: case 2: case 3: case 4: case 5: case 6: case 7:
                    guardarAccionYLienzo("Cubo de pintura " + colores[opcion - 1] + " en " + obtenerCoordenadas(coordenadas), lienzo);
                    cuboPinutura(lienzo, coordenadas, obtenerCaracter(lienzo, coordenadas), CARACTERES[opcion + 1]);
                    break;
                default:
                    System.out.println("Color no valido");
            }
        }while(opcion > 7);
    }
    
    private static void mostrarHistorial(){
        System.out.println("Historial con las ultimas 10 instrucciones");
        for (int i = 0; i < historialAcciones.length; i++)
            System.out.printf(">%d - %s\n", i+1, (historialAcciones[i] == null) ? "" : historialAcciones[i]);
        leerEnter("Pulsa ENTER para continuar...");
    }

}
