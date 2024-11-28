package grafo;
import java.util.*;

// Clase para representar un grafo no dirigido utilizando una lista de adyacencia
class Grafo {
    private int V; // Número de vértices
    private LinkedList<Integer>[] listaAdyacencia; // Lista de adyacencia para almacenar las conexiones

    // Constructor para inicializar el grafo con un número dado de vértices
    public Grafo(int v) {
        V = v;
        listaAdyacencia = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            listaAdyacencia[i] = new LinkedList<>();
        }
    }

    // Método para agregar una arista al grafo
    public void agregarArista(int v, int w) {
        listaAdyacencia[v].add(w);
        listaAdyacencia[w].add(v);
    }

    // Método para imprimir el grafo
    public void imprimirGrafo() {
        for (int i = 0; i < V; ++i) {
            System.out.println("Lista de adyacencia del vértice " + i);
            System.out.print("Vértice " + i);
            for (Integer nodoAdyacente : listaAdyacencia[i]) {
                System.out.print(" -> " + nodoAdyacente);
            }
            System.out.println("\n");
        }
    }
}
