package ut02e05lecturadelteclado;

import java.util.Scanner;

/**
 * En este ejemplo vamos a leer información desde el teclado que luego
 * podremos emplear en nuestro programa.
 * Existen dos formas de leer información desde el teclado mediante la
 * terminal:
 *   System.console().readLine(). Esta versión no la emplearemos ya que
 *   genera errores cuando trabajamos en entornos de desarrollo como 
 *   NetBeans o Eclipse.
 *   La clase Scanner. Esta clase forma parte de la librería
 *   java.util. Para poder usarla en nuestros programas debemos importarla,
 *   pero NetBeans nos ayudará.
 */
public class UT02E05LecturaDelTeclado {

    public static void main(String[] args) {
        
        // Lectura con System.console().readLine()
        // En estos comentarios se muesta la forma
        // de hacerlo, pero está todo el código
        // comentado para que generar errores.
        // No es importante saber usarla, ya que
        // usaremos la clase Scanner durante el
        // curso.
            // String nombre;
            // System.out.print("Introduce tu nombre: ");
            // nombre = System.console().readLine();
            // System.out.println("Hola " + nombre);
        // Si queremos un número debemos recogerlo
        // como String y luego hacer una conversión
        // de tipos.
        
        
        
        // Lectura desde el teclado con la clas Scanner
        Scanner lectorTeclado = new Scanner(System.in);
        // lectorTeclado es una variable de tipo Scanner
        // nextLine
        String localidad, calle;
        System.out.print("¿En qué localidad vives?: ");
        localidad = lectorTeclado.nextLine();
        System.out.print("¿En qué calle vives?: ");
        calle = lectorTeclado.nextLine();  // Podemos reutilizarla
        System.out.println("Localidad: " + localidad);
        System.out.println("Calle: " + calle);
        
        // next
        String primera, segunda;
        System.out.println("Escribe dos palabras separadas por espacio:");
        primera = lectorTeclado.next();
        segunda = lectorTeclado.next();
        System.out.println("Primera palabra: " + primera);
        System.out.println("Segunda palabra: " + segunda);
        
        // nextInt
        int edad;
        System.out.print("¿Cuántos años tienes?: ");
        edad = lectorTeclado.nextInt();
        System.out.println("Tienes " + edad + " años.");

    }

}

