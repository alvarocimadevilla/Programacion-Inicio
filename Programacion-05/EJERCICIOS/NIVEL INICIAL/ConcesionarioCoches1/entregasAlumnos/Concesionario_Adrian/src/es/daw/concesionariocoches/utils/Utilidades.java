/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.concesionariocoches.utils;

import es.daw.concesionariocoches.model.Coche;

/**
 *
 * @author alumnot
 */
public class Utilidades {
    
    public static int obtenerPlazasLibres(Coche[] concesionario){
        int libres = 0;
        for (Coche coche : concesionario)
            if (coche == null)
                libres++;
        return libres;
    }
    
    public static void aplicarDescuento(Coche[] concesionario, String marca, int descuento){
        for (Coche coche : concesionario) {
            if (coche == null || coche.getMarca() == null)
                continue;
            
            if (coche.getMarca().equals(marca)){
                System.out.printf("Se le ha aplicado descuento al coche con matricula %s\n", coche.getMatricula());
                coche.setPrecio(coche.getPrecio()-((coche.getPrecio()*descuento)/100));
            }
        }
    }
    
    public static void cambiarPrecioACoche(Coche[] concesionario, String matricula, int precio){
        for (Coche coche : concesionario) {
            if (coche != null || coche.getMatricula() != null){
                if (coche.getMatricula().equals(matricula)){
                    coche.setPrecio(precio);
                    break;
                }
            }
                
        }
    }
    
    public static void mostrarInforme(Coche[] concesionario){
        int index = 1;
        for (Coche coche : concesionario) {
            if (coche == null)
                continue;
            System.out.printf("-- Coche [%-3d] -------------------------", index);
            System.out.println(coche.toString());
            index ++;
        }
    }
    
    public static Coche[] filtrarPorPrecio(Coche[] concesionario, int precio){
        Coche[] concecionarioFiltrado = new Coche[concesionario.length - obtenerPlazasLibres(concesionario) + 1];
        int index = 0;
        for (Coche coche : concesionario) {
            if (coche == null)
                continue;
            
            if (coche.getPrecio() < precio){
                concecionarioFiltrado[index] = coche;
                index++;
            }
        }
        return concecionarioFiltrado;
    }
}
