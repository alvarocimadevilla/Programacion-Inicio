package grafo;

public class AppGrafo {
    public static void main(String[] args) throws Exception {
        Grafo grafo = new Grafo(5); // Crear un grafo con 5 vértices

        // Agregar aristas al grafo
        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 4);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(1, 4);
        grafo.agregarArista(2, 3);

        // Imprimir el grafo
        grafo.imprimirGrafo();
    }
}
