package es.daw.examen2ev.util;

import java.util.ArrayList;
import java.util.Collections;

import es.daw.examen2ev.exception.DniFormatException;
import es.daw.examen2ev.model.Arco;
import es.daw.examen2ev.model.Arma;
import es.daw.examen2ev.model.EspadaAcero;
import es.daw.examen2ev.model.EspadaHielo;
import es.daw.examen2ev.model.GestorArmas;
import es.daw.examen2ev.model2.AgenteDAO;
import es.daw.examen2ev.model2.Cliente;
import es.daw.examen2ev.model2.Corporatable;
import es.daw.examen2ev.model2.Empleado;

/**
 *
 * @author melola
 */
public class Utilidades {

    /**
     * ejecutaEjercicio1
     */
    public static void ejecutaEjercicio1(){
        System.out.println("\n ********** EJERCICIO 1 *************");
        //String[] dnis = {"15007335L", "9104351E", "21947107A", "52991600Z", "12345V"};
        String dnis = "15007335L,9104351E,21947107A,52991600Z,12345V";
        String[] listadoDnis = dnis.split(",");

        // Recorrer el array y coger uno a uno cada DNI
        for (int i = 0; i < listadoDnis.length; i++) {
            System.out.println("* DNI: "+listadoDnis[i]);
                
            try {
                if (validarDNI(listadoDnis[i])) {
                    System.out.printf("\tDNI válido \n", listadoDnis[i]);
                }
            } catch (DniFormatException e) {
                System.out.println("\t"+e.getMessage());
            }

        }
    }
    /**
     * checkDNILastLetter
     *
     * @param dni
     * @return
     * @throws DniFormatException
     */
    public static boolean validarDNI(String dni) throws DniFormatException {

        String LETRAS = "T,R,W,A,G,M,Y,F,P,D,X,B,N,J,Z,S,Q,V,H,L,C,K,E";

        String[] letras = LETRAS.split(",");
        
        //String[] letras2 = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        // Comprobar el pattern
        if(!dni.matches("[0-9]{8}[A-Z]{1}"))
            throw new DniFormatException("El DNI " + dni + " no sigue el patrón [0-9]{8}[A-Z]{1}");

        // Si el patrón es correcto...
        // Obtener el número de DNI
        String numeroString = dni.substring(0, 8);
        //int numero = Integer.parseInt(dni.substring(0, 8));
        int numero = Integer.parseInt(numeroString);

        // Obtener el resto del número (operador %)
        int modulo = numero % 23;

        // Obtengo la letra
        //String letra = "" + dni.charAt(8);
        //String letra = "" + dni.charAt(dni.length()-1);
        String letra = String.valueOf(dni.charAt(dni.length()-1)); //obtendo String de char

        if (!letra.equalsIgnoreCase(letras[modulo])) {
            throw new DniFormatException("El DNI " + dni + " no tiene una letra válida");
        }

        return true;

    }


    /**
     * ejecutaEjercicio2
     */
    public static void ejecutaEjercicio2(){

        System.out.println("\n ********** EJERCICIO 2 *************");
        GestorArmas gestor = new GestorArmas();

        gestor.addArma(new EspadaAcero("Espada de acero inoxidable", 100, true));
        gestor.addArma(new EspadaHielo("Espada de hielo polar", 50, false));
        gestor.addArma(new Arco("Arco olímpico", 75, 125.5f));

        System.out.println("* Número de armas creadas:"+Arma.getContador());

        System.out.println("\n* Listado de armas:");
        System.out.println(gestor);

        gestor.removeArma(); //borra el último

        System.out.println("\n* Listado después de borrar la última arma:");
        System.out.println(gestor);

        gestor.removeArma();
        gestor.removeArma();

        System.out.println("Ya no hay armas... voy a intentar borrar...");
        gestor.removeArma();


    }

    /**
     * ejecutaEjercicio3
     */
    public static void ejecutaEjercicio3(){
        System.out.println("\n ********** EJERCICIO 3 *************");

        ArrayList<Corporatable> agentes = new AgenteDAO().select();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        //Polimorfismo: cargar lista de empleados
        for (int i = 0; i < agentes.size(); i++) {
            if (agentes.get(i) instanceof Empleado)
                empleados.add((Empleado)agentes.get(i));
            else
                clientes.add((Cliente)agentes.get(i));
        }
        
        System.out.println("* Listado de empleados ordenados de forma natural (razón social):");
        //empleados.sort(Comparator.naturalOrder());
        Collections.sort(empleados);
        for (Empleado empleado : empleados) {
            System.out.println(empleado.obtenerRazonSocial());
        }

        System.out.println("* Listado de clientes:");
        clientes.forEach(System.out::println);


        // -----------------------------------------------------------------
        System.out.println("******* COMPROBANDO SI UN CLIENTE EXISTE *********");
        Cliente clienteOK = new Cliente("Quantum Dynamics Innovations");
        Cliente clienteKO = new Cliente("Avellanda Sofware");

        int pos = existeCliente(clientes,clienteOK);
        if (pos != -1){
            System.out.println("El cliente "+clienteOK.getNombre()+" está en la posición "+pos);
        }
        else{
            System.out.println("El cliente "+clienteOK.getNombre()+" NO está en la lista");
        }

        pos = existeCliente(clientes,clienteKO);
        if (pos != -1){
            System.out.println("El cliente "+clienteKO.getNombre()+" está en la posición "+pos);
        }
        else{
            System.out.println("El cliente "+clienteKO.getNombre()+" NO está en la lista");
        }

        // -----------------------------------------------------------------
        System.out.println("******* CÓDIGOS DE DEPARTAMENTO QUE EMPIEZAN POR C *********");
        for (Empleado e: empleados) {
            if (e.getDepartamentos().getCodigo().startsWith("C"))
                System.out.println(e.getDepartamentos()+"->"+e.getDepartamentos().getCodigo());
        }

    }

    /**
     * existeCliente
     * @param clientes
     * @param cliente
     * @return
     */
    public static int existeCliente(ArrayList<Cliente> clientes, Cliente cliente){
        return clientes.indexOf(cliente);
    }


    

}
