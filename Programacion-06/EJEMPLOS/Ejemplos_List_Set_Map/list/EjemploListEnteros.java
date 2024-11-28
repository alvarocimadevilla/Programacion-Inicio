package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * CONCEPTOS:
 * Repaso de ArrayList
 * Interface List
 * Nuevos métodos
 * Factory methods
 * Concepto de inmutabilidad
 * Ordenaciones
 */
public class EjemploListEnteros {
    public static void main(String[] args) {

        System.out.println("**************************************************");
        System.out.println("**EJEMPLOS DE ORDENACIÓN DE ARRAYLIST DE ENTEROS *");
        System.out.println("**************************************************");

        System.out.println("*****************************************************");
        System.out.println("** ARRAYLIST ENTEROS 1: creado de forma tradicional *");
        System.out.println("*****************************************************");

        // Forma tradicional
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(4);
        listInt.add(2);
        listInt.add(6);
        listInt.add(5);
        listInt.add(1);
        listInt.add(7);
        listInt.add(5);

        System.out.println("* Lista de enteros tal cual:");
        listInt.forEach(System.out::println);

        System.out.println("*****************************************************");
        System.out.println("** ARRAYLIST ENTEROS 2: Factory method List.of      *");
        System.out.println("*****************************************************");

        // Factory Methods para poder crear colecciones
        // List.of devuelve una lista inmutable, no una instancia de ArrayList. 
        // La inmutabilidad significa que no puedes modificar la lista después de crearla
        // NO SE PUEDE ORDENAR NI CREAR NI BORRAR ELEMENTOS!!!!!!!!!!
        List<Integer> listInt2 = List.of(3,4,2,6,5,1, 7);

        //listInt2.add(666); //Da error
        //Collections.sort(listInt2); //Da error

        // Si quieres tener una lista mutable
        //ArrayList<Integer> listInt3 = new ArrayList<>(List.of(3,4,2,6,5,1, 7));
        List<Integer> listInt3 = new ArrayList<>(List.of(3,4,2,6,5,1, 7));

        // Para los ejemplos vamos a usar listInt3 (serviría también con listInt)
        System.out.println("* Lista de enteros no ordenada (for..)");
        for (Integer i : listInt3) {
            System.out.println(i);
        }

        System.out.println("* Lista de enteros no ordenada (forEach)");
        listInt3.forEach(System.out::println);

        System.out.println("* Lista de enteros no ordenada (->)");
        listInt3.forEach( i -> System.out.println(i));
        // listInt2.forEach( (i) -> {
        //     System.out.println(i);
        // });

        System.out.println("* Lista de enteros ordenada por defecto (ascendente):");

        System.out.println("\tForma 1: con Collections.sort");
        Collections.sort(listInt3);
        listInt3.forEach(System.out::println);

        System.out.println("\tForma 2: con sort del ArrayList");
        listInt3.sort(Comparator.naturalOrder());
        listInt3.forEach(System.out::println);        

        System.out.println("* Lista de enteros ordenada descendente:");

        System.out.println("\tForma 1: con Collections.sort");
        Collections.sort(listInt3, Comparator.reverseOrder());
        listInt3.forEach(System.out::println);

        System.out.println("\tForma 2 con sort del ArrayList");
        listInt3.sort(Comparator.reverseOrder());
        listInt3.forEach(System.out::println);

        System.out.println("\tForma 3 con Collections.reverse");
        Collections.reverse(listInt3);
        listInt3.forEach(System.out::println);


        System.out.println("*****************************************************");
        System.out.println("** ARRAYLIST ENTEROS 4: Factory method Arrays.asList*");
        System.out.println("*****************************************************");
        /*
         * La lista devuelta por Arrays.asList() no es completamente mutable 
         * en el sentido de que no puedes agregar ni eliminar elementos de la lista, 
         * pero sí puedes modificar los elementos existentes en ella.
         */

        List<Integer> listInt4 = Arrays.asList(4, 5, 1, 2, 8, 9, 6);

        listInt4.sort(Comparator.naturalOrder());
        listInt4.forEach(System.out::println);

        //listInt4.add(666); //Da error

    }

}
