package es.daw.poo2.productosperecederos;

import es.daw.poo2.productosperecederos.model.Perecedero;
import es.daw.poo2.productosperecederos.model.Producto;
import es.daw.poo2.productosperecederos.dao.ProductoDAO;
import es.daw.poo2.productosperecederos.exceptions.CantidadIncorrectaException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;

/**
 *
 * @author melol
 */
public class ProductosPerecederosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Producto> productos;

        ProductoDAO dao = new ProductoDAO();

        productos = dao.select();

        // Mostar todos los productos
        System.out.println("********* LISTADO PRODUCTOS*********");
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        // 5 productos
        System.out.println("********* LISTADO PRODUCTOS, PRECIOS Y DEVOLUCIÓN *********");
        for (Producto producto : productos) {
            System.out.println("");
            // Jerarquía normal
            System.out.println(producto);
            // Sobreescribir método del padre (calcular)
            try {
                System.out.println("\tPrecio total de 5:"+producto.calcular(5));
            } catch (CantidadIncorrectaException e) {
                System.err.println(e.getMessage());
                //e.printStackTrace();
            }
            // Usar método abstracto de padre (permiteDevolución)
            System.out.println("\tPermite devolución:"+producto.permiteDevolucion());
            // Usar método abstracto de la inteface (convert2XML)
            System.out.println("\tXML:"+producto.convert2XML());
        }

        System.out.println("********* LISTADO PRODUCTOS ORDENADOS POR NOMBRE ASCENDENTE *********");
        
        Collections.sort(productos);

        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.println(producto.getClass().getSimpleName());
        }

        System.out.println("***************************************");
        System.out.println("********** PRUEBAS EXCEPTION **********");
        System.out.println("***************************************");
        Producto p = new Perecedero(1,"PRUEBA EXCEP",100);
        try {
            System.out.println("\tPrecio total de 5:"+p.calcular(5));
            System.out.println("\tPrecio total de 0:"+p.calcular(0));
        } catch (CantidadIncorrectaException e) {
            System.err.println(e.getMessage());
            //e.printStackTrace();
        }

    }
    
}