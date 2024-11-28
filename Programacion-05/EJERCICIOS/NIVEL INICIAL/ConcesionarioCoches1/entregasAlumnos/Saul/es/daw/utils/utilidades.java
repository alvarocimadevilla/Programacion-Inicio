package es.daw.utils;
import es.daw.model.*;
import es.daw.*;

public class utilidades {
    

    public static void calcularEspaciosVacios(Coche[] coches){
        int cantCoches = 0;
        for (int i = 0; i < coches.length; i++) {
            if (coches[i] != null) {
                cantCoches++;
            }

        }

        System.out.println("Hay "+(coches.length-cantCoches)+" espacios libres en el concesionario");
    }

    public static int cochesEnConcesionario(Coche[] coches){
        int cochesDentro = 0;
        for (int i = 0; i < coches.length; i++) {
            if (coches[i] != null) {
                cochesDentro++;
            }
        }

        
        return cochesDentro;
    }

    public static void aplicarDescuentoMarca(Coche coches){
        coches.setPrecio(coches.getPrecio()-2000);
    }

    public static void sacarCochesConPrecioMenor(Coche coches){
        System.out.println(coches.toString());
    }

    public static void establecerPrecioPorMatricula(String matricula, int precio){
        for (int i = 0; i < utilidades.cochesEnConcesionario(App.coches); i++) {
            if (App.coches[i].getMatricula().equals(matricula)) {
                App.coches[i].setPrecio(precio);
            }
        }
    }

    public static void concesionarioEntero(Coche[] coches){
        for (int i = 0; i < utilidades.cochesEnConcesionario(coches); i++) {
                
            System.out.println(coches[i].toString());
        
    }
    }

}
