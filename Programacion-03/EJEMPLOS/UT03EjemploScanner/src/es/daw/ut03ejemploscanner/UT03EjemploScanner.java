package es.daw.ut03ejemploscanner;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class UT03EjemploScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, num2;
        String cadena;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        if (teclado.hasNextInt()) {
            num = teclado.nextInt();
        } else {
            System.out.println("No has escrito un número!!!!!");
        }

        teclado.nextLine();

        System.out.println("Escribe otro número: ");
        num2 = teclado.nextInt();

        teclado.nextLine(); // Para poder leer la cadena de texto

        System.out.println("Escribe una cadena de texto: ");
        cadena = teclado.nextLine();

        /*
        // WRAPPERS O CLASES ENVOLTORIO. PROXIMAMENTE...
        int num3 = Integer.parseInt(cadena);
        double num4 = Double.parseDouble(cadena);
         */
//        System.out.println("Escribe un número: ");
//        num = teclado.nextInt();
        // ------------------------------------------
        // LEER TOKEN A TOKEN CON NEXT()
        String token1, token2;

        System.out.println("Escribe dos palabras separadas por espacio:");
        token1 = teclado.next();
        token2 = teclado.next();

        System.out.println("Has escrito estas palabras <" + token1 + "><" + token2 + ">");

        // --------------------------------------------
        teclado.nextLine();
        System.out.println("Escribe un mensaje de despedida:");
        String despedida = teclado.nextLine();

        // -------------------------------
        // Cambiar la marca del decimal
        //Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Escribe un decimal:");
        //double decimal = sc.nextDouble();
        double decimal = teclado.nextDouble();
        System.out.println("Fin del programa!!!!!!");

    }

}
