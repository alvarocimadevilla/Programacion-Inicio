package es.daw;

import es.daw.model.Punto;

public class App {
    public static void main(String[] args) throws Exception {
        Punto punto1 = new Punto(10, 2);
        Punto punto2 = new Punto(10, 2);
        Punto punto3 = new Punto(20, 4);

        if (punto1.equals(punto2))
            System.out.println("punto1 y punto2 pertenecen al mismo punto en el plano.");
            
        if (punto1.equals(punto3))
            System.out.println("punto1 y punto3 pertenecen al mismo punto en el plano.");
        else
            System.out.println("punto1 y punto3 no pertenecen al mismo punto en el plano.");
    }
}
