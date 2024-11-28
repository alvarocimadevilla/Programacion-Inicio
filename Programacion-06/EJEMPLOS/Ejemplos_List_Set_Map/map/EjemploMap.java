/**
 *
 */
package map;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import modelo.Persona;

public class EjemploMap {

    static Map<String, Persona> agenda = new HashMap<>();
    
    /**
     * @param args
     */
    public static void main(String[] args) {

        //Insertamos los pares clave, valor
        //Simulando una agenda de teléfono: clave el teléfono y el valor la persona con su datos
        agenda.put("954000001", new Persona("11111111A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
        agenda.put("954000004", new Persona("44444444D", "María", "López", LocalDate.of(1993, 4, 5)));
        agenda.put("954000002", new Persona("22222222B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        agenda.put("954000003", new Persona("33333333C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        
        //Si insertamos un elemento con la misma clave, lo sustituimos
        //No podemos tener dos claves que tenga valores diferentes
        agenda.put("954000004", new Persona("56789012E", "Martín", "García", LocalDate.of(1990, 12, 15)));

        //La forma más normal de recorrer un Map es tomar su conjunto de claves, iterar por ellas, y
        //para cada una de ellas, obtener el valor.
        for (String key : agenda.keySet()) {
            //System.out.printf("%s %s %n", key, agenda.get(key));
            System.out.println("* Clave:"+key);
            System.out.println("* Valor:"+agenda.get(key));
        }
        
        // Si falla el primero, el segundo no se busca
        try{
            System.out.println("Persona con teléfono 8888888: "+searchPersonByPhone("8888888"));
            System.out.println("Persona con teléfono 954000002: "+searchPersonByPhone("954000002"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("CHIMPÚN!!!!!");

    }
    
    
    
    // Método para buscar los datos de una persona a través del teléfono.
    public static Persona searchPersonByPhone(String telefono) throws Exception{
        if (agenda.containsKey(telefono)) return agenda.get(telefono);
        throw new Exception("No existe en la agenda una persona con el teléfono "+telefono); //propaga una excepción que debes chequear con try catch y volvera a propagar
    }
    
}
