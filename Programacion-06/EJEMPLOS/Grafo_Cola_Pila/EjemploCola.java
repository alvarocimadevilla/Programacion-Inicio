import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public static void main(String[] args) {

     Queue<String> cola = new LinkedList<>();

     // Agregar elementos a la cola
     cola.offer("X"); //también con add
     cola.offer("Y");
     cola.offer("Z");

     // Imprimir la cola
     System.out.println("Contenido de la cola: " + cola);

     // Obtener y eliminar el elemento al frente de la cola
     String elementoFrente = cola.poll(); //también con remove
     System.out.println("Elemento al frente de la cola: " + elementoFrente);
     System.out.println("Contenido de la cola después de poll: " + cola);

     // Verificar si la cola está vacía
     boolean estaVacia = cola.isEmpty();
     System.out.println("¿La cola está vacía? " + estaVacia);
    }
}
