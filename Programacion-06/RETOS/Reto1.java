import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reto1 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);

        // 3 FORMAS DIFERENTES DE HACERLO
        //borrarNumerosPares(numeros);
        //borrarNumerosParesIt(numeros);
        numeros.removeIf(num -> num % 2 == 0);

        //Imprimir la lista después de borrar los números pares
        System.out.println("Lista después de borrar los pares:");
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }

    /**
     * Con for...
     * @param lista
     */
    public static void borrarNumerosPares(List<Integer> lista){
        // Borro los números pares de la lista de enteros
        // for (Integer num : lista) { // Da excepción
        //     if (num % 2 == 0)
        //         lista.remove(num);
        // }

        // Del final al principio no da error...
        for (int i = lista.size() -1; i >= 0; i--) {
            if (lista.get(i) %2 == 0)
                lista.remove(i);
            
        }

    }

    /**
     * Con Iterator
     * @param lista
     */
    public static void borrarNumerosParesIt(List<Integer> lista){
        Iterator<Integer> it = lista.iterator();
        while(it.hasNext()){
            if (it.next() %2 == 0)
                it.remove();
        }

        
    }
}
