
package es.daw.concesionariocoches.Util;

import es.daw.concesionariocoches.ConcesionarioCoches;
import es.daw.concesionariocoches.Model.Coche;

public class Utils {
    
    static public Coche[] cargarCochesConcesionario(){
        
        System.out.println("******* METER COCHES AL CONCESIONARIO *******");
        System.out.println("¿Cuantos coches vas a meter en el concesionario?");
        
        int numCoches = ConcesionarioCoches.lectorEnteros.nextInt();
        
        Coche[] coches = new Coche[numCoches];
        
        for (int i = 0; i < coches.length; i++) {
            
            System.out.println("Información del coche " +(i+1)+ "");
            System.out.println("\tIntroduce la matricula: ");
            String matricula = ConcesionarioCoches.lectorCadena.nextLine();
            System.out.println("Información del coche " +(i+1)+ "");
            System.out.println("\tIntroduce el numero de puertas: ");
            int numPuertas = ConcesionarioCoches.lectorEnteros.nextInt();
            System.out.println("Información del coche " +(i+1)+ "");
            System.out.println("\tIntroduce la marca: ");
            String marca = ConcesionarioCoches.lectorCadena.nextLine();
            System.out.println("Información del coche " +(i+1)+ "");
            System.out.println("\tIntroduce los kilometros: ");
            int kilometros = ConcesionarioCoches.lectorEnteros.nextInt();
            System.out.println("Información del coche " +(i+1)+ "");
            System.out.println("\tIntroduce el precio: ");
            int precio = ConcesionarioCoches.lectorEnteros.nextInt();
            
            Coche coche = new Coche(matricula, numPuertas, marca, kilometros, precio);
            
            coches[i] = coche;
            
            coches[i] = new Coche(matricula, numPuertas, marca, kilometros, precio);
        }
        
        return coches;
    }
    
    static public int parkingLibre(Coche[] concesionario) {

        int espaciosLibres = 0;

        for (Coche coche : concesionario) {
            if (coche == null) {
                espaciosLibres++;
            }
        }
        return espaciosLibres;
        
    }
    public static void cambiarPrecio(Coche[] concesionario, String matricula, int precioNuevo) {

        for (Coche coche : concesionario) {
            if (matricula.equals(coche.getMatricula())) {
                coche.setPrecio(precioNuevo);
                System.out.println("Precio actualizado: " + coche.getPrecio());
                System.out.println(coche.toString());
                break;
            } else {
                System.out.println("No existe esta matricula");
                break;
            }
        }

    }
    
    public static void descuentoPorMatricula(Coche[] concesionario, String marca, int descuento){       
        
        for (Coche coche : concesionario) {
            if(marca.equals(coche.getMarca())){
                coche.setPrecio(coche.getPrecio()-((coche.getPrecio()*descuento)/100));
                System.out.println("Precio actualizado: "+coche.getPrecio());
                break;
            }
        }
    }
    
    public static void informeDescuentos(Coche[] concesionario){
    
        System.out.println("*********INFORME*********");
        
        for (Coche coche : concesionario) {
            if(coche != null)
            System.out.println(coche.toString());                
        }
        
    }
    
    public static void informeByPrecio(Coche[] concesionario, int precioLimite){
       
        System.out.println("*********INFORME DE COCHES POR PRECIO************");
        
        for (Coche coche : concesionario) {
            if(coche != null && coche.getPrecio() < precioLimite)
                System.out.println(coche.toString());
        }
        
    }
    
    
    
    
}
