package es.daw;

import java.util.ArrayList;

import es.daw.model.Coche;

/**
 * 
 */
public class EjemploArrayListApp {
    public static void main(String[] args) {
        // Crear un ArrayList de Coches
        ArrayList<Coche> listaDeCoches = new ArrayList<>();

        // Agregar algunos coches a la lista
        listaDeCoches.add(new Coche("1111AAA","VOLVO", 30000));
        listaDeCoches.add(new Coche("1111BBB","BMW", 35000));
        listaDeCoches.add(new Coche("1111CCC","SEAT", 25000));

        System.out.println("COCHES INICIALES:");
        pintaArrayList(listaDeCoches);

        // Encontrar la posición de un coche concreto (por ejemplo, marca "BMW")
        Coche cocheABuscar = new Coche("1111BBB"); // El precio no importa para la búsqueda
        int posicion = listaDeCoches.indexOf(cocheABuscar);

        // Verificar si se encontró el coche
        if (posicion != -1) {
            System.out.println("Coche encontrado en la posición: " + posicion);
            Coche cocheEncontrado = listaDeCoches.get(posicion);
            // Ahora puedes trabajar con el coche encontrado
            cocheEncontrado.aplicarDescuento(1000);
        } else {
            System.out.println("Coche no encontrado en la lista.");
        }

        System.out.println("COCHES FINALES:");
        pintaArrayList(listaDeCoches);


        // 
    }

    /**
     * 
     * @param lista
     */
    private static void pintaArrayList(ArrayList<Coche> lista){
        for (Coche coche : lista) {
            System.out.println(coche);
        }
    }

    
}
