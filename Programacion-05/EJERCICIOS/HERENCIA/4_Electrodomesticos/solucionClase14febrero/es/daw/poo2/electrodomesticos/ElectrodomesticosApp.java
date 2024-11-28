package es.daw.poo2.electrodomesticos;

import java.util.ArrayList;

import es.daw.poo2.electrodomesticos.dao.ElectrodomesticoDAO;
import es.daw.poo2.electrodomesticos.model.Electrodomestico;

/**
 *
 * @author melol
 */
public class ElectrodomesticosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electrodomesticos;

        ElectrodomesticoDAO dao = new ElectrodomesticoDAO();

        electrodomesticos = dao.select();

        for (Electrodomestico e : electrodomesticos) {
            System.out.println(e);
            System.out.println("El precio final es:"+e.getPrecioFinal());
            System.out.println();
        }


        
    }
    
}
