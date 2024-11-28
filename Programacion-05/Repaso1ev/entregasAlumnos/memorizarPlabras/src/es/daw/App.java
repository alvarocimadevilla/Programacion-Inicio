package es.daw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static String[] palabras = { "java", "php", "python", "c", "sql" };
    static String[] palabrasYaElegidas = new String[5];
    static String[] palabrasUsuario = new String[5];

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        String opcion;
        System.out.println("Repite la secuencia");

        String palabraMaquina = "";
        String palabraUsuario = "";
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Repite la secuencia");
            String palabraElegida = elegirPalabra(palabraMaquina);
            // System.out.println(palabraElegida);

            System.out.print("> ");
            opcion = lector.nextLine();
            palabraMaquina = comprobar(palabraElegida);
            palabraUsuario = comprobar(opcion);

            if (palabraMaquina.equals(palabraUsuario)) {
                System.out.println("Has acertado");
            } else {
                System.out.println("Has perdido");
                break;
            }
            
        }
        // split
    }

    public static String elegirPalabra(String elegirPalabra) {
        Random r = new Random();
        int numRandom = 0;
        boolean repetido = false;
        String palabra = "";

        while (!repetido) {
            numRandom = r.nextInt(5);
            palabra = palabras[numRandom];

            if (palabras[numRandom].equals("x")) {
                repetido = false;
            } else {
                repetido = true;
                palabras[numRandom] = "x";
            }
        }
        System.out.println(palabra);
        elegirPalabra += palabra;
        return elegirPalabra;
    }

    public static String comprobar(String opcion) {
        String nuevaPalabra = "";
        char caracter;

        for (int i = 0; i < opcion.length(); i++) {
            caracter = opcion.charAt(i);
            if (caracter == ' ') {

            } else {
                nuevaPalabra += opcion.charAt(i);
            }

        }
        return nuevaPalabra.toLowerCase();

    }

}
