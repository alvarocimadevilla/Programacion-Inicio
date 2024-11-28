/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT05_Introducci%C3%B3n%20POO/Concesionario
 */
package es.daw.concesionario;

import es.daw.concesionario.model.Coche;
import es.daw.concesionario.model.Concesionario;
import es.daw.concesionario.util.Utilidades;
import java.util.Arrays;

/**
 *
 * @author melola
 */
public class ConcesionarioApp {
    
    //Pendiente: poner global el array de coches
    
    public static void main(String[] args) {
        
        
        // MI CONCESIONARIO (10 PLAZAS)
        //Coche[] concesionario = new Coche[10];
        Concesionario miConcesionario = new Concesionario("Coches baratos de la Mari");
        miConcesionario.addCoche(new Coche("1111BVJ",3,"BMW",50,50000));
        miConcesionario.addCoche(new Coche("2222BVK",5,"BMW"));
        miConcesionario.addCoche(new Coche("4444AAA", 5, "Audi"));
        miConcesionario.addCoche(new Coche("3333BVL",3,"BMW",3000,10000));
        miConcesionario.addCoche(new Coche("5555KKK", 5, "Audi", 3000, 25500));

        // 1. OBTENER NÚMERO DE PLAZAS LIBRES
        System.out.printf("EL CONCESIONARIO %s TIENE %d COCHES",miConcesionario.getName(),miConcesionario.getCantidadCoches());
        
        
        // 2. APLICAR DESCUENTO A COCHES CUYA MARCA SEA XXXX
        Utilidades.mostrarInfoConcesionario(miConcesionario);

        // Utilidades.aplicarDescuentoPorMarca(concesionario, "BMW", 5000);
        // System.out.println("Info después de aplicar descuento:");
        // Utilidades.mostrarInfoConcesionario(concesionario);

        // PUNTO 2 PLUS ++: BORRAR COCHE DEL CONCESIONARIO POR MATRÍCULA
        miConcesionario.removeCoche(new Coche("1111BVJ"));

        // -------------------------
        // 3. PONER PRECIO A UN COCHE CON UNA MATRÍCULA EN CONCRETO
        Utilidades.ponerPrecioPorMatricula(miConcesionario, "2222BVK", 55000);
        Utilidades.mostrarInfoConcesionario(miConcesionario);

        // 4. Mostrar informe solo de los coches cuyo precio sea inferior a una cantidad dada
        Utilidades.mostrarInfoCochesByPrecio(miConcesionario, 30000);









        // -----------------------------
        // Voy a poner el precio al último BMW
        //miBMW.setPrecio(30000);
        /*coches[5].setPrecio(30000); // uso la referencia
        System.out.println("* Información del coche con matrícula ["+miBMW.getMatricula()+"] sin aplicar el descuento:\n"+coches[5].toString());
        miBMW.aplicarDescuento(800);
        System.out.println("* Información del coche con matrícula ["+miBMW.getMatricula()+"] una vez aplicado el descuento:\n"+coches[5].toString());*/
        /*
        // Poner precio por matrícula
        Utilidades.ponerPrecioPorMatricula(concesionario, "4444AAA", 36500);
        
        
        // Aplicar campaña de descuento a los coches de marca Audi
        Utilidades.mostrarInfoConcesionario(concesionario,"AUDI");
        Utilidades.aplicarDescuentoPorMarca(concesionario, "AUDI", 500);
        System.out.println("* Aplicado descuento de 500 euros a los Audi");
        Utilidades.mostrarInfoConcesionario(concesionario,"AUDI");
        
        // Método para devolver el número de plazas libres que hay en el local del concesionario
        System.out.println("* Número de plazas vacías en el concesionario: "+Utilidades.obtenerNumPlazasLibres(concesionario));
        
               
        // Pendiente: poner el precio 50000 al coche con matrícula 1111BVJ
        */
        
        
    }
    
    
}
