/**
 * Clase que contiene metodos estaticos relacionados con el historial
 */
package es.daw.practica2.lienzo.util;


import static es.daw.practica2.lienzo.util.Lienzo.*;
import static es.daw.practica2.lienzo.util.Utils.*;
import java.util.Arrays;

/**
 *
 * @author Adrian Bogdan
 */
public class Historial {
    public static final int HISTORIAL_LONGITUD = 5;
    public static String[] historialAcciones = new String[10];
    public static String[][][] historialLienzos = new String[HISTORIAL_LONGITUD][LETRAS.length][NUM_COLS];
    
    public static void limpiarHistorial(){
        for (String[][] historialLienzo : historialLienzos)
            limpiarLienzo(historialLienzo);
        historialAcciones = new String[10];
    }
    
    public static void guardarAccionYLienzo(String cadena, String[][] lienzo){
        historialAcciones = empujar(cadena, historialAcciones);
        guardarLienzo(lienzo);
    }
    
    public static void guardarAccion(String cadena){
        historialAcciones = empujar(cadena, historialAcciones);
    }
    
    public static void guardarLienzo(String[][] lienzo){
        for (int i = historialLienzos.length - 2; i >= 0; i--)
            copiarLienzo(historialLienzos[i], historialLienzos[i+1]);
        copiarLienzo(lienzo, historialLienzos[0]);
    }
    
    public static void deshacerLienzo(String[][] lienzo){
        copiarLienzo(historialLienzos[0], lienzo);
        for (int i = 0; i < historialLienzos.length - 1; i++)
            copiarLienzo(historialLienzos[i+1], historialLienzos[i]);
        limpiarLienzo(historialLienzos[HISTORIAL_LONGITUD - 1]);
    }

    public static void dibujarHistorial(){
        for (int i = 0; i < historialLienzos.length; i++) {
            System.out.println("HISTORIAL " + i);
            for (String[] historialLienzo : historialLienzos[i]) {
                System.out.println(Arrays.toString(historialLienzo));
            }
        }
    }
}
