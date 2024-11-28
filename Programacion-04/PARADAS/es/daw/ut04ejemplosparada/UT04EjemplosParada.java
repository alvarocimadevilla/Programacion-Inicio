/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/PARADAS
 */
package es.daw.ut04ejemplosparada;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melola
 */
public class UT04EjemplosParada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hola soy un programa que va a parar 2 segundos");
        
        // Ejemplo de espera con Thread
        try {
            Thread.sleep(2000);
            
            System.out.println("Y he dormido y me despierto!!!");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(UT04EjemplosParada.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Ejemplo de espera con TimeUnit
        System.out.println("Ahora me duermo otra vez 3 segundos");
        try {
            TimeUnit.SECONDS.sleep(3);
            
            System.out.println("Ya me he despertado y paro");
        } catch (InterruptedException ex) {
            Logger.getLogger(UT04EjemplosParada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
