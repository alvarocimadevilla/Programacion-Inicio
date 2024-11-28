package es.daw.util;

import java.util.ArrayList;
import java.util.Collections;

import es.daw.exception.DniFormatException;
import es.daw.model.Arco;
import es.daw.model.Arma;
import es.daw.model.EspadaAcero;
import es.daw.model.EspadaHielo;
import es.daw.model.GestorArmas;
import es.daw.model2.AgenteDAO;
import es.daw.model2.Cliente;
import es.daw.model2.Corporatable;
import es.daw.model2.Empleado;

/**
 *
 * @author melola
 */
public class Utilidades {

    /**
     * ejecutaEjercicio1
     */
    public static void ejecutaEjercicio1() {
        System.out.println("\n ********** EJERCICIO 1 *************");
        String dnis = "15007335L,9104351E,21947107A,52991600Z,12345V";

        String[] listaDnis = dnis.split(",");

        for (String d : listaDnis) {
            System.out.println("* DNI: " + d);
            try {
                validarDNI(d);
                System.out.println("\tDNI válido");
                System.out.println();
            } catch (DniFormatException e) {
                System.out.println("\t" + e.getMessage());
                System.out.println();
            }
        }
    }

    public static boolean validarDNI(String dni) throws DniFormatException {
        String[] letras = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
                "H", "L", "C", "K", "E" };

        if (!dni.matches("[0-9]{8}[A-Z]{1}")) {
            throw new DniFormatException("El DNI " + dni + " no sigue el patrón");
        }

        String numeroString = dni.substring(0, dni.length() - 1);
        int numero = Integer.parseInt(numeroString);
        int resto = numero % 23;

        String letraSub = dni.substring(8);
        if (!letraSub.equals(letras[resto])) {
            throw new DniFormatException("El DNI " + dni + " no tiene una letra válida");
        }
        return true;

    }

    /**
     * ejecutaEjercicio2
     */
    public static void ejecutaEjercicio2() {

        // NO TOCAR!!!! IMPLEMENTA EL MODELADO DE CLASES EN model2 SEGÚN LAS
        // ESPECIFICACIONES

        System.out.println("\n ********** EJERCICIO 2 *************");
        GestorArmas gestor = new GestorArmas();

        gestor.addArma(new EspadaAcero("Espada de acero inoxidable", 100, true));
        gestor.addArma(new EspadaHielo("Espada de hielo polar", 50, false));
        gestor.addArma(new Arco("Arco olímpico", 75, 125.5f));

        System.out.println("* Número de armas creadas:" + Arma.getContador());

        System.out.println("\n* Listado de armas:");
        System.out.println(gestor);

        gestor.removeArma();

        System.out.println("\n* Listado después de borrar todas las armas:");
        System.out.println(gestor);

    }

    /**
     * ejecutaEjercicio3
     */
    public static void ejecutaEjercicio3() {
        System.out.println("\n ********** EJERCICIO 3 *************");

        ArrayList<Corporatable> agentes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        AgenteDAO dao = new AgenteDAO();
        agentes = dao.select();

        System.out.println("* LISTADO DE DNIS INVÁLIDOS *");
        for (Corporatable agente : agentes) {
            if (agente instanceof Empleado) {
                try {
                    validarDNI(((Empleado)agente).getDNI());
                } catch (DniFormatException e) {
                    System.out.println(e.getMessage());
                }
                
            } 
        }

        System.out.println("\n* LISTADO DE EMPLEADOS ORDENADOS DE FORMA NATURAL (RAZÓN SOCIAL) *");

        for (Corporatable agente : agentes) {
            if (agente instanceof Empleado) {
                empleados.add((Empleado)agente);
            } else if (agente instanceof Cliente) {
                clientes.add((Cliente)agente);
            }
        }
        
        Collections.sort(empleados);

        for (Empleado e : empleados) {
            System.out.println(e.obtenerRazonSocial());
        }

        System.out.println("\n* LISTADO DE CLIENTES *");
        clientes.forEach(System.out::println);


        // -----------------------------------------------------------------
        System.out.println("\n******* COMPROBANDO SI UN CLIENTE EXISTE *********");
        Cliente clienteOK = new Cliente("Quantum Dynamics Innovations");
        Cliente clienteKO = new Cliente("Avellanda Sofware");

        int posicion = existeCliente(clientes, clienteOK);
        if (posicion == 1) {
            System.out.println("El cliente "+clienteOK.getNombre()+" está en la posición "+posicion);
        } else {
            System.out.println("El cliente "+clienteOK.getNombre()+" no está en la lista");
        }

        int posicion2 = existeCliente(clientes, clienteKO);
        if (posicion2 == 1) {
            System.out.println("El cliente "+clienteKO.getNombre()+" está en la posición "+posicion2);
        } else {
            System.out.println("El cliente "+clienteKO.getNombre()+" no está en la lista");
        }

        // -----------------------------------------------------------------
        System.out.println("\n******* CÓDIGOS DE DEPARTAMENTO QUE EMPIEZAN POR C *********");
        for (Empleado e : empleados) {
            if (e.getDepartamentos().getCodigo().startsWith("C")) {
                System.out.println(e.getDepartamentos()+" -> "+e.getDepartamentos().getCodigo());
            }
        }

    }

    private static void getDNI() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDNI'");
    }

    public static int existeCliente(ArrayList<Cliente> clientes, Cliente cliente){
        return clientes.indexOf(cliente);
    }

}
