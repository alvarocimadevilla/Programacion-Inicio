package EJEMPLOS.Ejemplo_Referencia_Metodo;

import java.util.ArrayList;
import java.util.List;

/*
 * Una de las características más destacadas introducidas en Java 8 son los métodos de referencia. 
 * Estos nos permiten escribir código más conciso y legible al referenciar 
 * métodos existentes o constructores de una manera elegante. 
 */
public class ConvertList2May {
    public static void main(String[] args) {
        // Crear una lista de cadenas
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("hola");
        listaCadenas.add("adiós");
        listaCadenas.add("bienvenido");
        listaCadenas.add("gracias");

        // Usar forEach con referencia a método para convertir todas las cadenas a
        // mayúsculas
        listaCadenas.forEach(ConvertList2May::convertirAMayusculas);

        // Imprimir la lista de cadenas después de convertirlas a mayúsculas
        System.out.println(listaCadenas);

        System.out.println("********** CON API STREAM ***************");
        listaCadenas.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println); 

    }

    // Método para convertir una cadena a mayúsculas
    private static void convertirAMayusculas(String cadena) {
        System.out.println(cadena.toUpperCase());
    }
}
