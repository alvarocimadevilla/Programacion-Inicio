import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class EjemploColaLimiteCapacidad {
    public static void main(String[] args) {

     Queue<String> cola = new ArrayBlockingQueue<>(3);

     // Agregar elementos a la cola
     cola.offer("X");
     cola.offer("Y");
     cola.offer("Z");
     System.out.println("Añado elemento superando la capacidad con offer:");
     boolean rdo = cola.offer("otro");
     System.out.println(rdo);
     try{
        System.out.println("Añado elemento superando la capacidad con add:");
        cola.add("refinitivo");
     }catch(IllegalStateException e){
        e.printStackTrace();
     }

     // Imprimir la cola
     System.out.println("Contenido de la cola: " + cola);

     // Primera forma: Obtener y eliminar el elemento al frente de la cola
     String elementoFrente = cola.poll();
     System.out.println("Elemento al frente de la cola: " + elementoFrente);
     System.out.println("Contenido de la cola después de poll: " + cola);

     // Segunda forma: Obtener y eliminar el elemento al frente de la cola
     elementoFrente = cola.remove();
     System.out.println("Elemento al frente de la cola: " + elementoFrente);
     System.out.println("Contenido de la cola después de poll: " + cola);

     // Verificar si la cola está vacía
     boolean estaVacia = cola.isEmpty();
     System.out.println("¿La cola está vacía? " + estaVacia);

     // borro el contenido de la cola
     System.out.println("Borro el contenido de la cola");
     cola.clear();
     System.out.println("¿La cola está vacía? " + cola.isEmpty());

     //Quiero borrar un elemento cuando la cola está vacía
     cola.remove();
    }
}
