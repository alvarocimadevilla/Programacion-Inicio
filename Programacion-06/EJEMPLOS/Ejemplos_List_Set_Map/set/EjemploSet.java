/**
 * 
 */
package set;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import modelo.Persona;

public class EjemploSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// --------------------------------------------------------------------------------
		// -------------------- DECLARACIÓN DE DIFERENTES SET -----------------------------
		// --------------------------------------------------------------------------------
		//1. HashSet
		// No se garantiza que se devuelva en el orden de inserción
		//Set<Persona> juntaDirectiva = new HashSet<>();

		// 2. TreeSet
		// Exception in thread "main" java.lang.ClassCastException: class modelo.Persona
		// cannot be cast to class java.lang.Comparable
		// Para ordenar, Persona debe implementar Comparable
		Set<Persona> juntaDirectiva = new TreeSet<>();

		//3. LinkedHashSet
		// Se devuelve en el orden de inserción
		// Set<Persona> juntaDirectiva = new LinkedHashSet<>();
		// --------------------------------------------------------------------------------

		// --------------------------------------------------------------------------------
		// ----------------------- INICIALIZAMOS EL SET CON OBJETOS -----------------------
		// --------------------------------------------------------------------------------

		juntaDirectiva.add(new Persona("11111111B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
		juntaDirectiva.add(new Persona("11111111A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		juntaDirectiva.add(new Persona("11111111C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
		juntaDirectiva.add(new Persona("11111111D", "María", "López", LocalDate.of(1993, 4, 5)));


		// AÑADIR OBJETO REPETIDO
		// Si tratamos de añadir un elemento repetido...
		// No da error, simplemente no se inserta el nuevo elemento
		juntaDirectiva.add(new Persona("11111111D", "María", "López", LocalDate.of(1993, 4, 5)));

		System.out.println("* Listado de personas:");
		// Comprobamos que al listarlos todos, no aparece duplicado
		// Observa que dependiendo del tipo de Set que utilices, el listado es diferente...
		for (Persona p : juntaDirectiva)
			System.out.println(p);

		System.out.println("* Listado de personas en orden descendente:");
		System.out.println("\t* Como un ArrayList:");
		List<Persona> lista = new ArrayList<>(juntaDirectiva); // convierto un Set a un List
		lista.sort(Comparator.reverseOrder());
		//lista.sort(Collections.reverseOrder()); // otra forma
		// lista.sort( (pa,pb) -> pa.getNombre().compareTo(pb.getNombre())); // un comparator solo por nombre...
		lista.forEach(System.out::println);

		System.out.println("\t* Con descendingIterator:");
		Iterator<Persona> it = ((TreeSet<Persona>) juntaDirectiva).descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());

		

	}

}
