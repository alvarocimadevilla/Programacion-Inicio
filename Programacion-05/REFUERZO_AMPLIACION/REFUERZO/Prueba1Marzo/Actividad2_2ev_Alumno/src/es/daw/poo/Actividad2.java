package es.daw.poo;

import java.util.ArrayList;

import es.daw.poo.dao.PersonaDAO;
import es.daw.poo.dao.ProductoDAO;
import es.daw.poo.model.Persona;
import es.daw.poo.model.Producto;


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
            if (!producto.validar())
                System.out.println(producto);
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
            if (!persona.validar())
                System.out.println(persona);
        }

        // -------------------------------------------
        // PERSONAS ORDENADAS
        System.out.println("\n PERSONAS ORDENADAS POR NOMBRE COMPLETO ASCENDENTE:");
        // Pendiente completar

        // PRODUCTOS ORDENAD0S
        System.out.println("\n PRODUCTOS ORDENADOS POR FECHA ASCENDENTE:");
        // Pendiente completar

        // -------------------------------------------
        // POLIMORFISMO TOPE POWER (un único DAO)
        System.out.println("\nLISTADO DE TODOS LOS OBJETOS VALIDABLES:");
        // Pendiente completar


    }
}
