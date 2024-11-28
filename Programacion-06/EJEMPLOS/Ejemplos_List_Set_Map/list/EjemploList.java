/**
 * 
 */
package list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import modelo.Persona;

public class EjemploList {

    /**
     * @param args
     */
    public static void main(String[] args) {

        

        // LINKEDLIST: Si no tenemos una buena razón para usar linkedlist
        // En términos de funcionalidad no habría diferencia ninguna
        /*
         * La principal diferencia es un tema de implementación ArrayList
         * implementa la lista con arreglos linkeados, lo que la hace muy
         * eficiente para recorrer pero ineficiente para insertar o eliminar
         * elementos que se no encuentren en el final.
         * En cambio LinkedList es una lista de elementos linkeados
         * (en realidad es una lista doblemente enlazada) lo que la hace
         * lenta para recorrer pero sumamente eficiente para insertar
         * o eliminar elementos.
         * 
         * Por lo tanto ArrayList :
         * - usa internamente un arreglo dinámico para almacenar los elementos.
         * - proporciona una manipulación lenta
         * - es la mejor opción para almacenar y acceder a datos o elementos
         * consecutivos.
         * 
         * Por lo tanto LinkedList:
         * - proporciona una manipulación más rápida porque utiliza una lista doblemente
         * enlazada.
         * - se puede utilizar como lista y cola porque implementa interfaz de List,
         * Deque y Queue.
         * - es mejor para manipulación de elementos, es decir, para insertar y eliminar
         * elementos.
         * 
         * Por lo tanto si necesitamos agregar elementos consecutivos
         * y recorrerlos debemos utilizar ArrayList y si en cambio
         * necesitamos insertar y eliminar valores no consecutivos debemos usar
         * LinkedList.
         */

        List<Persona> listaPersonas = new ArrayList<>();
        //List<Persona> listaPersonas = new LinkedList<>();

        listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1992, 3, 4)));
        //listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        listaPersonas.add(new Persona("34567890Z", "Ana", "Elola", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1992, 3, 4)));

        // Duda de Saúl
        List<Persona> listaLinkedPersonas = new LinkedList<>(listaPersonas);

        // Recorrer la lista completa
        System.out.println("Listado completo de personas:");
        for (Persona per : listaPersonas)
            System.out.println(per);

        // Acceso posicional (3ª posición)
        Persona p = listaPersonas.get(2);
        System.out.println("\nPersona en tercera posición: " + p);

        // Añadir un nuevo elemento al final de la lista
        listaPersonas.add(new Persona("56789012E", "Julio", "Azcárate", LocalDate.of(1994, 5, 6)));

        // Añadir/modificar un elemento en medio de la lista. Cambio el elemento de la
        // posición 3 (sustituye Ana por Alfonso y Julio está al final)
        listaPersonas.set(2, new Persona("67890123F", "Alfonso", "García", LocalDate.of(1995, 6, 7)));

        // Añadir un objeto repetido
        listaPersonas.add(new Persona("56789012E", "Julio", "Azcárate", LocalDate.of(1994, 5, 6)));

        // Recorrer la lista completa
        System.out.println("\nNuevo listado de personas:");
        for (Persona per : listaPersonas)
            System.out.println(per);

        
        // TRUQUI!!!! Eliminar personas repetidas
        Set<Persona> conjuntoPersonas = new TreeSet<>(listaPersonas);
        System.out.println("\nConjunto de personas:");
        conjuntoPersonas.forEach(System.out::println);

        System.out.println("\nListado de personas por dni (método natural):");
        Collections.sort(listaPersonas);
        //Collections.reverse(listaPersonas);
        // listaPersonas.sort(Comparator.naturalOrder());
        // listaPersonas.sort(Comparator.reverseOrder());
        listaPersonas.forEach(System.out::println);


        // ************** ORDENACIONES ******************

        // FORMA 1: COMPARATOR CLÁSICO DEL RnR
        // Ordenado por nombre
        listaPersonas.sort(new ComparatorByNombre());
        System.out.println("\nListado de personas por nombre (forma clásica):");
        listaPersonas.forEach(System.out::println);

        // Ordenado por fecha
        Collections.sort(listaPersonas, new ComparatorByFechaNac());
        //listaPersonas.sort(new ComparatorByFechaNac());
        System.out.println("\nListado de personas por fechaNac (forma clásica):");
        listaPersonas.forEach(System.out::println);


        
        // FORMA 2: COMPARATOR ANÓNIMO
        listaPersonas.sort(new Comparator<Persona>() {

            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
                //return p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
            }

        });
        System.out.println("\nListado de personas por nombre (forma comparator anónimo):");
        listaPersonas.forEach(System.out::println);

        // FORMA 3: COMPARATOR CON LAMBDA

        System.out.println("\nListado de personas por NOMBRE (forma lambda):");
        listaPersonas.sort((p1,p2) -> p1.getNombre().compareTo(p2.getNombre()));
        listaPersonas.forEach(System.out::println);

        System.out.println("\nListado de personas por apellidos (forma lambda):");
        listaPersonas.sort((p1,p2) -> p1.getApellidos().compareTo(p2.getApellidos()));
        listaPersonas.forEach(System.out::println);
        
        System.out.println("\nListado de personas por fecha de nacimiento (forma lambda):");
        listaPersonas.sort((p1,p2)->p2.getFechaNacimiento().compareTo(p1.getFechaNacimiento()));
        

        // ----------------------------------
        // DEL EJERCICIO 3: POR NOMBRE Y APELLIDOS
        System.out.println("**************************************");
        System.out.println("* EJERCICIO 3: POR NOMBRE Y APELLIDOS");

        // PRIMERA FORMA: CON DOS COMPARADORES
        // Creo un objeto comparator
        Comparator<Persona> compByNombre = (p1,p2) -> p1.getNombre().compareTo(p2.getNombre()); 
        Comparator<Persona> compByApellido = (p1,p2) -> p1.getApellidos().compareTo(p2.getApellidos());
        // Creo un objeto comparator
        ComparatorByNombre compByNombre2 = new ComparatorByNombre();

        //listaPersonas.sort(compByNombre);
        listaPersonas.sort( compByNombre.thenComparing(compByApellido));
        listaPersonas.forEach(System.out::println);


        // SEGUNDA FORMA: CONCATENANDO ATRIBUTOS
        Collections.sort(listaPersonas,new ComparatorByNombreCompleto());
        System.out.println("**************************************");
        // ----------------------------------

        // ------------------------------------------------
        // BUSCAR
        // Quiero encontrar a una persona....
        // List<Persona> lista = new ArrayList<>();
        // lista.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1992, 3, 4)));
        // lista.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        // lista.add(new Persona("34567890Z", "Ana", "Elola", LocalDate.of(1992, 3, 4)));
        // lista.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));        
        // lista.add(new Persona("45678901D", "María", "López", LocalDate.of(1992, 3, 4)));        

        System.out.println("* Buscar a persona:");
        Persona personaBuscar = new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3));
        System.out.println(personaBuscar);

        // Collections.sort(lista);
        // int pos = Collections.binarySearch(lista,personaBuscar);

        // BinarySearch: más eficiente que indexOf pero requiere que la lista esté ordenada.
        //Collections.sort(listaLinkedPersonas);
        int pos = Collections.binarySearch(listaLinkedPersonas, personaBuscar); // requisito que Persona implements Comparable

        // Comparator<Persona> byNombre = (pa, pb) ->  pa.getNombre().compareTo(pb.getNombre());
        // Collections.sort(listaPersonas, byNombre);
        // pos = Collections.binarySearch(listaPersonas, Pepe, byNombre);

        System.out.println("posición encontrada:" + pos);
        // ----------------------------------------------

        // ----------------------------------------------
        // BORRANDO OBJETOS (POR POSICIÓN)
        // if (pos >= 0)
        // listaPersonas.remove(pos);

        // BORRANDO OBJETOS (EQUALS)
        listaPersonas.remove(personaBuscar);

        System.out.println("\nLista actualizada tras borrar:");
        for (Persona per : listaPersonas)
            System.out.println(per);
        // ----------------------------------------------

        // ----------------------------------------------
        // PRÓXIMAMENTE.... API STREAM...
        // ----------------------------------------------
        System.out.println("***************** EJEMPLOS CON API STREAM ***********************");
        System.out.println("\nLista actualizada tras borrar (con API STREAM):");
        listaPersonas.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nLista actualizada tras borrar y ordenar por apellidos (con API STREAM):");
        listaPersonas.stream()
                .sorted(Comparator.comparing(Persona::getApellidos))
                .forEach(System.out::println);

        System.out.println("\nLista actualizada tras borrar y ordenar por fecha y nombre (con API STREAM):");
        Comparator<Persona> comparatorByName = (pa, pb) -> pa.getNombre().compareTo(pb.getNombre());
        Comparator<Persona> comparatorByFechaNac = (pa, pb) -> pa.getFechaNacimiento().compareTo(pb.getFechaNacimiento());
        listaPersonas.sort(comparatorByFechaNac.thenComparing(comparatorByName));
        listaPersonas.forEach(System.out::println);

        System.out.println("\nLista de nombres de las personas:");
        listaPersonas.stream()
            .map(Persona::getNombre)
            .forEach(System.out::println);
        // ----------------------------------------------

    }

}
