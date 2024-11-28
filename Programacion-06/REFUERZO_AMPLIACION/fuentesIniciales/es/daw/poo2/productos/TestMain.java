package REFUERZO_AMPLIACION.fuentesIniciales.es.daw.poo2.productos;

import java.util.ArrayList;
import es.daw.poo2.productos.dao.ProductoDAO;
import es.daw.poo2.productos.model.Producto;

/**
 *
 * @author melola
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductoDAO dao = new ProductoDAO();
        ArrayList<Producto> productos = dao.select();
        
        // PENDIENTE COMPLETAR!!!!!!!!!
        
        
        
    }

}
