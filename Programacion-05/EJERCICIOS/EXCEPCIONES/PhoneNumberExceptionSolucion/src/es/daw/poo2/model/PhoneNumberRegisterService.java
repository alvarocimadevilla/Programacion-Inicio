package es.daw.poo2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.daw.poo2.exceptions.PhoneNumberAlreadyExistsException;

public class PhoneNumberRegisterService {
     /// -------------------------------------------
     // --------------- VERSIÓN 1 ------------------
     //---------------------------------------------
     // String[] phoneNumbers = { "+34 111 111 111", "+34 111 111 112",
     //           "+34 111 111 113", "+34 111 111 114" };
     // // List<String> registeredPhoneNumbers = Arrays.asList("+34 111 111 111", "+34
     // // 111 111 112", "+34 111 111 113", "+34 111 111 114");

     // List<String> registeredPhoneNumbers = Arrays.asList(phoneNumbers);

     // /**
     //  * Comprueba si el número de teléfono existe
     //  * @param phoneNumber indica el número de teléfono
     //  * @throws PhoneNumberAlreadyExistsException si ya existe el teleono
     //  */
     // public void validatePhone(String phoneNumber) throws PhoneNumberAlreadyExistsException {
     //      // for (String phone : registeredPhoneNumbers) {
     //      //      if (phone.equalsIgnoreCase(phoneNumber))
     //      //           // crear, lanzar y propagar la excepción
     //      // }

     //      if (registeredPhoneNumbers.contains(phoneNumber)){
     //           throw new PhoneNumberAlreadyExistsException("El número de teléfono "+phoneNumber+" está en uso por otro cliente!");
     //      }
     // }

     /// -------------------------------------------
     // --------------- VERSIÓN 2 ------------------
     //---------------------------------------------
     // El método de validación valida de la lista de clientes un número de teléfono
     public void validatePhone(ArrayList<Client> clients, String phoneNumber) throws PhoneNumberAlreadyExistsException{
          for (Client client : clients) {
               if (client.getPhoneNumber().equalsIgnoreCase(phoneNumber)){
                    throw new PhoneNumberAlreadyExistsException("El número de teléfono "+phoneNumber+" está en uso por otro cliente!");
               }
          }
     }
}
