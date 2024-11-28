
package es.daw.concesionario.util;

import es.daw.concesionario.model.Coche;
import es.daw.concesionario.model.Concesionario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author melola
 */
public class Utilidades {
    
    /**
     * 
     * @param coches
     * @return 
     */
    public static int obtenerNumPlazasLibres(Coche[] coches){
        int contador = 0;
        for(Coche c: coches){
            if (c == null) contador++;
        }
        
        return contador;
    }
    
    /**
     * 
     * @param coches
     * @param marca
     * @param descuento 
     */
    public static void aplicarDescuentoPorMarca(Coche[] coches, String marca, int descuento){
        for(Coche c: coches){
            if (c != null){
                if (c.getMarca().equalsIgnoreCase(marca)){
                    //c.aplicarDescuento(descuento);

                    //int kk = c.getPrecio();
                    c.setPrecio(c.getPrecio() - descuento);
                }
            }
        }
        
    }
    
    /**
     * 
     * @param coches
     * @param matricula
     * @param precio 
     */
    public static void ponerPrecioPorMatricula(Coche[] coches, String matricula, int precio){
        for(Coche c: coches){
            if (c != null){
                if (c.getMatricula().equalsIgnoreCase(matricula)){
                    c.setPrecio(precio);
                    break;
                }
            }
        }
        
    }
    public static void ponerPrecioPorMatricula(Concesionario concesionario, String matricula, int precio){  
        ArrayList<Coche> coches = concesionario.getCoches();

        // sin reutilizar
        for(Coche coche: coches){
             if (coche.getMatricula().equalsIgnoreCase(matricula)){
                 coche.setPrecio(precio);
                 break;
             }
        }
        
        // reutilizando
        //Coche[] cochesArray = (ArrayList<Coche>) Arrays.asList(coches);

        // -----------------------------------------
        // reutilizando
        // Convertir el Array en ArrayList
        // String[] cadenas = {"uno","dos"};
        // List<String> prueba = Arrays.asList(cadenas);

        // // Convertir el ArrayList en Array
        // String[] cadenas2 = prueba.toArray(new String[2]);
        // -----------------------------------------
        
            
        
    }  
    
    /**
     * 
     * @param coches 
     */
    public static void mostrarInfoConcesionario(Concesionario concesionario){
        System.out.println("** INFORMACIÓN DE LOS COCHES **");

        //ArrayList<Coche> coches = concesionario.getCoches();

        for (Coche coche : concesionario.getCoches()) {
        //for (Coche coche : coches) {
            //System.out.println(coche.toString()); //da excepción con coches nulos
            System.out.println(coche);
        }
        
    }
    
    public static void mostrarInfoConcesionario(Coche[] coches, String marca){
        System.out.println("** INFORMACIÓN DE LOS COCHES DE MARCA "+marca+" **");
        //System.out.println(Arrays.toString(coches));
        for (int i = 0; i < coches.length; i++) {
            if(coches[i] != null){
                if(coches[i].getMarca().equalsIgnoreCase(marca))
                    System.out.println(coches[i]);
            }
        }
        
    }
    
    /**
     * PENDIENTE!!!!
     * Mostrar informe solo de los coches cuyo precio sea inferior a una cantidad dada.
     */
    public static void mostrarInfoCochesByPrecio(Coche[] concesionario, int cantidad ){
        StringBuilder sb = new StringBuilder("INFORME DE COCHES CUYO PRECIO ES MENOR QUE "+cantidad);
        for (Coche coche : concesionario) {
            if (coche != null){
                if (coche.getPrecio() < cantidad){
                    sb.append(coche);            
                }
            }
        }

        //return sb.toString();

        //Muestro el informe
        System.out.println(sb.toString());

    }

    // SOBRECARGA DE MÉTODOS
    public static void mostrarInfoCochesByPrecio(Concesionario conce, int precio){
        ArrayList<Coche> coches = conce.getCoches();
        StringBuilder sb = new StringBuilder("INFORME DE COCHES CUYO PRECIO ES MENOR QUE "+cantidad);
        for (Coche coche: coches){
            if (coche.getPrecio() < precio){
                sb.append(coche);            
            }
    }

    }

    
}
