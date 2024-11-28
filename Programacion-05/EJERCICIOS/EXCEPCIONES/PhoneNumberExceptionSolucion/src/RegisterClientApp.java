
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import es.daw.poo2.dao.ClientDAO;
import es.daw.poo2.exceptions.PhoneNumberAlreadyExistsException;
import es.daw.poo2.model.Client;
import es.daw.poo2.model.PhoneNumberRegisterService;

public class RegisterClientApp {
    public static void main(String[] args) {

        // Obtener el objeto servicio
        PhoneNumberRegisterService service = new PhoneNumberRegisterService();


        // ------------------------------------------
        // -------------- VERSIÓN 1 -----------------
        // Llamar al método de validación para comprobar si el teléfono está repetido
        // ------------------------------------------
        
        // // "+34 222 222 222", "+34 111 111 113"
        // String phoneNumber = "";
        // try {
        //     phoneNumber = "+34 222 222 222"; //OK
        //     service.validatePhone(phoneNumber);
        //     System.out.printf("Teléfono %s correcto. No está repetido!!!\n",phoneNumber);

        //     phoneNumber = "+34 111 111 113"; //KO
        //     service.validatePhone(phoneNumber);
        //     System.out.printf("Teléfono %s correcto. No está repetido!!!\n",phoneNumber);            

        // } catch (PhoneNumberAlreadyExistsException e) {
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }

        // ------------------------------------------
        // -------------- VERSIÓN 2 -----------------
        // ------------------------------------------
        // Crear el objeto DAO
        ClientDAO dao = new ClientDAO();
        ArrayList<Client> clients = dao.select();

        System.out.println("* CLIENTES DADOS DE ALTA EN EL SISTEMA:");
        // for (Client client : clients) {
        //     System.out.println(client);
        // }
        clients.forEach(System.out::println);

        System.out.println("* SIMULACIÓN DE CREACIÓN DE CLIENTES:");
        // Simulamos que el programa a pedido datos para dar de alta un cliente
        // Este programa no deja registrar clientes con el mismo número de teléfono
        Client clientOK = new Client("5A", "Cliente prueba OK", "+34 111 111 115",LocalDate.now());
        Client clientKO = new Client("6A", "Cliente prueba KO", "+34 111 111 113",LocalDate.now());

        try {
            service.validatePhone(clients, clientOK.getPhoneNumber());
            System.out.printf("Teléfono %s correcto. No está repetido!!!\n",clientOK.getPhoneNumber());
            service.validatePhone(clients, clientKO.getPhoneNumber());
            System.out.printf("Teléfono %s correcto. No está repetido!!!\n",clientKO.getPhoneNumber());

        } catch (PhoneNumberAlreadyExistsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // ------------------------------------------
        // -------------- VERSIÓN 3 -----------------
        // ------------------------------------------

        System.out.println("* CLIENTES ORDENADOS DE FORMA NATURAL:");

        // Formas de ordenar
        Collections.sort(clients); // con esta vale para el examen
        // clients.sort(Comparator.naturalOrder());
        // clients.sort(Comparator.reverseOrder());

        // Formas de pintar
        clients.forEach(System.out::println);
        //clients.forEach(c -> System.out.println(c));

        

        // ------------------------------------------
        // -------------- VERSIÓN 4 -----------------
        // ------------------------------------------
        // Simulamos buscar un cliente por el código 1A que ya existe
        Client client2Find = new Client("1A");
        System.out.println("¿Existe el cliente con código 1A?");

        // if (clients.contains(client2Find))
        //     System.out.println("Cliente encontrado");
        // else
        //     System.out.println("Cliente no encontrado");

        System.out.println((clients.contains(client2Find))?"Cliente encontrado":"Cliente no encontrado");


        // Si tuviera más código, se ejecutaría con normalidad
        System.out.println("********** FIN **************");
    }
}
