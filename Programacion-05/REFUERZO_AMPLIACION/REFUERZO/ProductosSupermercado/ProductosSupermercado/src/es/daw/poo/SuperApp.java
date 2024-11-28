package es.daw.poo;

import java.util.ArrayList;

import es.daw.poo.model.Caduca;
import es.daw.poo.model.Conservas;
import es.daw.poo.model.Descuento;
import es.daw.poo.model.Electronica;
import es.daw.poo.model.Fruteria;
import es.daw.poo.model.Producto;

public class SuperApp {
    
    public static void main(String[] args) {
        // Lista de productos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Fruteria("Manzanas", 2.5, true));
        productos.add(new Fruteria("Fresas", 4, false));
        productos.add(new Fruteria("Apio", 1.5, false));
        productos.add(new Conservas("Sardinas", 5.99, false));
        productos.add(new Conservas("Garbanzos", 1.99, true));
        productos.add(new Conservas("Atún", 3.99, true));
        productos.add(new Electronica("Teléfono", 299.99));
        productos.add(new Electronica("Teclado", 49.99));


        // Mostrar productos caducados   
        System.out.println("--- Lista de productos caducados ---");
        for(Producto p : productos){
            if (p instanceof Caduca) {
                Caduca c = (Caduca)p;
                if (c.estaCaducado()) {
                    System.out.println(p.getNombre());
                }
            }
        }

        // Mostrar productos con descuento
        System.out.println("--- Lista de productos con descuento ---");
        for(Producto p : productos){
            if (p instanceof Descuento) {
                double desc = ((Descuento)p).aplicarDescuento();
                String precioDesc = String.format("%.2f", p.getPrecio() - desc); 
                System.out.println(p.getNombre() + " - " + precioDesc + "€");
            }
        }
         
        
    }

}
