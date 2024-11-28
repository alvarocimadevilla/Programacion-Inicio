/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.concesionariocoches;

import es.daw.concesionariocoches.model.Coche;
import static es.daw.concesionariocoches.utils.Utilidades.*;

/**
 *
 * @author alumnot
 */
public class ConcesionarioCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int MAX_PLAZAS = 10;
        
        Coche[] concesionario = new Coche[MAX_PLAZAS];
        concesionario[0] = new Coche("0091DDA", 45000);
        concesionario[1] = new Coche("1653PPP", 40000);
        concesionario[2] = new Coche("1234ZYX", 2, "Ford", 30000, 50000);
        concesionario[3] = new Coche("1234ABC");
        concesionario[5] = new Coche("8497DEF", 23000);
        concesionario[6] = new Coche("8675HIJ", 4, "BMW", 15000, 30000);
        concesionario[8] = new Coche("9999OOO", 2, "Audi", 25000, 20000);
        concesionario[9] = new Coche("9876OLS", 2, "BMW", 15000, 20000);
        
        
        System.out.printf("Quedan %d plazas libres\n", obtenerPlazasLibres(concesionario));
        
        System.out.println("\n\nINFORME DE TODOS LOS COCHES ANTES DE APLICAR EL DESCUENTO");
        mostrarInforme(concesionario);
        
        System.out.println("\nAplicar descuento del 50% a todos los coches cuya marca sea BMW");
        aplicarDescuento(concesionario, "BMW", 50);
        
        System.out.println("\n\nINFORME DE TODOS LOS COCHES DESPUÉS DE APLICAR EL DESCUENTO");
        mostrarInforme(concesionario);
        
        System.out.println("\n\nINFORME DE TODOS LOS COCHES CUYO PRECIO ES MENOR DE 250€");
        mostrarInforme(filtrarPorPrecio(concesionario, 250));
        
    }
    
}
