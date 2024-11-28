import java.util.Stack;

public class EjemploPila {

    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        // Agregar elementos a la pila
        pila.push("A");
        pila.push("B");
        pila.push("C");
    
        // Imprimir la pila
        System.out.println("Contenido de la pila: " + pila);
    
        // Obtener y eliminar el elemento en la cima de la pila
        String elementoCima = pila.pop();
    
        System.out.println("Elemento en la cima de la pila: " + elementoCima);
        System.out.println("Contenido de la pila después de pop: " + pila);
    
        // Verificar si la pila está vacía
        boolean estaVacia = pila.isEmpty();

        System.out.println("¿La pila está vacía? " + estaVacia);    
        
    }

    

}
