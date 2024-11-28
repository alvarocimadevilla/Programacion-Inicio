package EJERCICIOS;

import java.util.*;

public class Ejercicio1 {
    public static void eliminarDuplicados(List<String> artefactos) {
        // Utilizaría TreeSet que voy a ordenar sus elementos
        // En este caso solo borro, y como el más eficiente es HashSet pues...
         Set<String> artefactosUnicos = new HashSet<>(artefactos);

         System.out.println("************ SET SIN ELEMENTOS REPETIDOS *************");
         artefactosUnicos.forEach(System.out::println);

        //  for (String a : artefactosUnicos) {
        //     System.out.println(a);
        //  }
         
         artefactos.clear();
         artefactos.addAll(artefactosUnicos);
    }

    public static void main(String[] args) {

        List<String> artefactos = new ArrayList<>();

        artefactos.add("Reloj antiguo");
        artefactos.add("Vaso de cerámica");
        artefactos.add("Reliquia de oro");
        artefactos.add("Reloj antiguo"); // Duplicado
        artefactos.add("Amuleto de plata");
        artefactos.add("Vaso de cerámica"); // Duplicado

        System.out.println("Artefactos antes de eliminar duplicados: " + artefactos);

        eliminarDuplicados(artefactos);

        System.out.println("Artefactos después de eliminar duplicados: " + artefactos);
    }
}
