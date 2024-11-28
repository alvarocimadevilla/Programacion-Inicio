package es.daw.poo;

import java.util.ArrayList;

import es.daw.poo.dao.ProductoDAO;
import es.daw.poo.model.Producto;

public class Actividad1 {
    public static void main(String[] args) throws Exception {
        ProductoDAO dao = new ProductoDAO();

        ArrayList<Producto> productos = dao.select();

        for (Producto producto : productos) {
            System.out.println(producto);
            
        }

        System.out.println("Productos no válidos:");
        for (Producto producto : productos) {
            if (!producto.validar())
                System.out.println(producto);
        }
        
        
    }
}
