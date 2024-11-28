/**
 * Clase que contiene métodos estáticos (funciones) específicos del lienzo
 */
package es.daw.practica2.lienzo.util;

import static es.daw.practica2.lienzo.util.Utils.*;
import static es.daw.practica2.lienzo.util.Historial.*;
import java.util.Arrays;

/**
 *
 * @author Adrian Bogdan
 */
public class Lienzo {
    // Variables globales
    public static final char[] LETRAS = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static final int NUM_COLS = 25;
    
    // CARACTERES DEL LIENZO
    public static final String[] CARACTERES = {
        WHITE   + "." + RESET,      // Transparente
        WHITE   + "*" + RESET,      // Lineas
        WHITE   + "#" + RESET,      // Cubo Pintura Blanco
        RED     + "#" + RESET,      // Cubo Pintura Rojo
        GREEN   + "#" + RESET,      // Cubo Pintura Verde
        YELLOW  + "#" + RESET,      // Cubo Pintura Amarillo
        BLUE    + "#" + RESET,      // Cubo Pintura Azul
        PURPLE  + "#" + RESET,      // Cubo Pintura Morado
        CYAN    + "#" + RESET       // Cubo Pintura Cyan
    };

    /**
     * Función para dibujar los marcos laterales del lienzo, el contenido del
     * lienzo y el marco inferior
     *
     * @param lienzo
     */
    public static void dibujarLienzo(String[][] lienzo) {

        // marco superior números
        System.out.print("         "); // 9 espacios
        for (int i = 0; i < lienzo[0].length; i++) {
            if (i < 9) {
                System.out.print((i + 1) + "   "); // 3 espacios
            } else {
                System.out.print((i + 1) + "  "); // 2 espacios
            }
        }

        // marco superior con @
        System.out.print("\n     @"); // 5 espacios
        for (int i = 1; i < lienzo[0].length + 1; i++) {
            System.out.print("   @"); // 3 espacios
        }
        System.out.println("   @"); //3 espacios y última arroba del marco superior

        // lienzo
        for (int i = 0; i < lienzo.length; i++) {
            System.out.print("  " + LETRAS[i] + "  @"); // 2 espacios + letra + 2 espacios + @
            for (int j = 0; j < lienzo[i].length; j++) {
                System.out.print("   " + lienzo[i][j]); // 3 espacios de separación
            }
            System.out.println("   @"); // 3 espacios
        }
        System.out.print("     @"); // 5 espacios

        // marco inferior
        for (int j = 0; j < lienzo[0].length; j++) {
            System.out.print("   @"); // 3 espacios
        }
        System.out.println("   @\n"); // 3 espacios

    }

    /**
     * Función para limpiar el lienzo dejandolo con '.'
     * @param lienzo
     */
    public static void limpiarLienzo(String[][] lienzo) {
        for (String[] fila : lienzo)
            for (int j = 0; j < fila.length; j++)
                fila[j] = CARACTERES[0]; 
    }

    /**
     * Función para dibujar el lienzo completo (marco y contenido)
     * @param lienzo
     */
    public static void dibujarCuadro(String[][] lienzo) {
        dibujarLienzo(lienzo); // se dibuja el lienzo completo con marco y su contenido
    }
    
    /**
     * Devuelve un caracter del lienzo, devuelve "0" si se indica coordenadas fuera del lienzo
     * @param lienzo
     * @param coordenadas
     * @return 
     */
    public static String obtenerCaracter(String[][] lienzo, int[] coordenadas){
        try{
            return lienzo[coordenadas[1]][coordenadas[0]];
        }catch(Exception e){
            return "0";
        }
    }
    
    /**
     * Dibuja un unico caracter en el lienzo
     * @param lienzo
     * @param coordenadas
     * @param caracter
     * @return 
     */    
    public static boolean dibujarCaracter(String[][] lienzo, int[] coordenadas, String caracter) {
        try {
            lienzo[coordenadas[1]][coordenadas[0]] = caracter;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    /**
     * Dibuja una linea o vector con una determinada longitud y dirección
     * @param lienzo
     * @param coordenadas
     * @param longitud 
     * @param direccion 
     */
    public static void dibujarLineaParcial(String[][] lienzo, int[] coordenadas, int longitud, int[] direccion) {
        int x = coordenadas[0];
        int y = coordenadas[1];
        for (int i = 0; i <= longitud; i++) {
            dibujarCaracter(lienzo, xy(x, y), CARACTERES[1]);
            x += direccion[0];
            y += direccion[1];
        }
    }

    /**
     * Dibuja una linea que recorre todo el lienzo
     * @param lienzo
     * @param coordenadas
     * @param direccion
     */
    public static void dibujarLineaEntera(String[][] lienzo, int[] coordenadas, int[] direccion) {
        String tipo;
        
        if (direccion[0] == 1 && direccion[1] == 0)
            tipo = "horizontal";
        else if (direccion[0] == 0 && direccion[1] == 1)
            tipo = "vertical";
        else if (direccion[0] == 1 && direccion[1] == -1)
            tipo = "diagonal /";
        else
            tipo = "diagonal \\";
        
        String mensajeExito = "Dibujado línea " + tipo + " en " + obtenerCoordenadas(coordenadas);
        
        guardarAccionYLienzo(mensajeExito, lienzo);
        dibujarLineaParcial(lienzo, coordenadas, lienzo.length, direccion);
        dibujarLineaParcial(lienzo, coordenadas, lienzo.length, xy(direccion[0] * -1, direccion[1] * -1));
    }
    
    /**
     * Dibuja un rectangulo en el lienzo
     * @param lienzo
     * @param coordenadas
     * @param w Anchura
     * @param h Altura
     */
    public static void dibujarRectangulo(String[][] lienzo, int[] coordenadas, int w, int h) {
        w--; h--;
        String forma = (w == h) ? "cuadrado" : "rectangulo";
        int x = coordenadas[0];
        int y = coordenadas[1];
        int[] limites = {x, y, x + w, y + h};
        String mensajeExito = "Dibujado " + forma + " de " + (w + 1) + "x" + (h + 1) + " en " + obtenerCoordenadas(coordenadas);
        String mensajeAviso = "El " + forma + " no cabe en el lienzo";
        String mensajeError = "Dimensiones incorrectas. No se ha dibujado el " + forma + " de " + w + "x" + h + " en " + obtenerCoordenadas(coordenadas);
        
        if (cabeEnLienzo(lienzo, limites)){
            guardarAccionYLienzo(mensajeExito, lienzo);
            dibujarLineaParcial(lienzo, coordenadas, w, xy(1,0));
            dibujarLineaParcial(lienzo, xy(x, y + h), w, xy(1, 0));
            dibujarLineaParcial(lienzo, coordenadas, h, xy(0,1));
            dibujarLineaParcial(lienzo, xy(x + w, y), h, xy(0,1));
        } else {
            leerEnter(mensajeAviso);
            guardarAccion(mensajeError);
        }
    }
    
    /**
     * Dibuja un cuadrado de lados iguales en el lienzo
     * @param lienzo
     * @param coordenadas
     * @param longitud 
     */
    public static void dibujarCuadrado(String[][] lienzo, int[] coordenadas, int longitud){
        dibujarRectangulo(lienzo, coordenadas, longitud, longitud);
    }
    
    /**
     * Funcion que dibuja un rombo en el lienzo
     * @param lienzo
     * @param coordenadas Las coordenadas del centro del rombo
     * @param longitud 
     */
    public static void dibujarRombo(String[][] lienzo, int[] coordenadas, int longitud){
        longitud--;
        int x = coordenadas[0];
        int y = coordenadas[1];
        int[] limites = {x - longitud, y - longitud, x + longitud, y + longitud};
        String mensajeExito = "Dibujado rombo de lado " + (longitud + 1) + " en " + obtenerCoordenadas(coordenadas);
        String mensajeAviso = "El rombo no cabe en el lienzo";
        String mensajeError = "Dimensiones incorrectas. No se ha dibujado el rombo de lado " + longitud + " en " + obtenerCoordenadas(coordenadas);
        
        if (cabeEnLienzo(lienzo, limites)){
            guardarAccionYLienzo(mensajeExito, lienzo);
            dibujarLineaParcial(lienzo, xy(x - longitud, y), longitud, xy(1, 1));
            dibujarLineaParcial(lienzo, xy(x + longitud, y), longitud, xy(-1, 1));
            dibujarLineaParcial(lienzo, xy(x - longitud, y), longitud, xy(1, -1));
            dibujarLineaParcial(lienzo, xy(x + longitud, y), longitud, xy(-1, -1));
        } else {
            leerEnter(mensajeAviso);
            guardarAccion(mensajeError);
        }
    }
    
    /**
     * Funcion que reemplaza todos los caracteres que tiene a su alrededor por otro
     * @param lienzo
     * @param coordenadas
     * @param caracterOld
     * @param caracterNew 
     */
    public static void cuboPinutura(String[][] lienzo, int[] coordenadas, String caracterOld, String caracterNew){
        int x = coordenadas[0];
        int y = coordenadas[1];
        if (!obtenerCaracter(lienzo, coordenadas).equals(caracterOld))
            return;
        dibujarCaracter(lienzo, coordenadas, caracterNew);
        cuboPinutura(lienzo, xy(x+1, y), caracterOld, caracterNew);
        cuboPinutura(lienzo, xy(x-1, y), caracterOld, caracterNew);
        cuboPinutura(lienzo, xy(x, y+1), caracterOld, caracterNew);
        cuboPinutura(lienzo, xy(x, y-1), caracterOld, caracterNew);
    }
    
    /**
     * Función para comprobar si una forma cabe en el lienzo
     * @param lienzo
     * @param limites
     * @return True si cabe en el lienzo, False si no
     */
    public static boolean cabeEnLienzo(String[][] lienzo, int[] limites){
        return !(obtenerCaracter(lienzo, xy(limites[0], limites[1])).equals("0") || obtenerCaracter(lienzo, xy(limites[2], limites[3])).equals("0"));
    }
    
    /**
     * Copiar el contenido de un lienzo a otro lienzo, esta funcion es util para el historial
     * @param origen
     * @param destino 
     */
    public static void copiarLienzo(String[][] origen, String[][] destino){
        for (int i = 0; i < origen.length; i++)
            destino[i] = Arrays.copyOf(origen[i], destino[i].length);
    }
}
