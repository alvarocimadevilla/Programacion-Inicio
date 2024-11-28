package es.daw.poo;

import java.util.ArrayList;
import java.util.Collections;

import es.daw.poo.dao.PersonaDAO;
import es.daw.poo.dao.ProductoDAO;
import es.daw.poo.dao.ValidableDAO;
import es.daw.poo.exceptions.NotValidException;
import es.daw.poo.model.Persona;
import es.daw.poo.model.Producto;
import es.daw.poo.model.Validable;


public class Actividad2 {
    public static void main(String[] args){

        // -------------------------------------------
        // PRODUCTOS
        System.out.println("************ PRODUCTOS *****************");
        ProductoDAO daoProd = new ProductoDAO();

        ArrayList<Producto> productos = daoProd.select();

        for (Producto producto : productos) {
            System.out.println(producto);
            
        }

        System.out.println("\n* Productos no válidos:");
        for (Producto producto : productos) {
            try {
                if (!producto.validar())
                    System.out.println(producto);
            } catch (NotValidException e) {
                System.out.println(e.getMessage());
                System.out.println(producto+"\n");
            }
        }
        // -------------------------------------------
        // PERSONAS
        System.out.println("\n************ PERSONAS *****************");
        PersonaDAO daoPer = new PersonaDAO();

        ArrayList<Persona> personas = daoPer.select();

        for (Persona persona : personas) {
            System.out.println(persona);
            
        }

        System.out.println("\n* Personal que no ha pasado la validación:");
        for (Persona persona : personas) {
            try {
                if (!persona.validar())
                    System.out.println(persona);
            } catch (NotValidException e) {
                e.getMessage();
                System.out.println(persona);
                System.out.println();

            }
        }

        // -------------------------------------------
        // PERSONAS ORDENADAS
        System.out.println("\n PERSONAS ORDENADAS POR NOMBRE COMPLETO ASCENDENTE:");
        Collections.sort(personas);
        personas.forEach(System.out::println);

        // PRODUCTOS ORDENAD0S
        System.out.println("\n PRODUCTOS ORDENADOS POR FECHA ASCENDENTE:");
        Collections.sort(productos);
        productos.forEach(System.out::println);

        // -------------------------------------------
        // POLIMORFISMO TOPE POWER (un único DAO)
        System.out.println("\nLISTADO DE TODOS LOS OBJETOS VALIDABLES:");
        ValidableDAO daoVal = new ValidableDAO();
        ArrayList<Validable> validables = daoVal.select();
        validables.forEach(System.out::println);


    }
}
