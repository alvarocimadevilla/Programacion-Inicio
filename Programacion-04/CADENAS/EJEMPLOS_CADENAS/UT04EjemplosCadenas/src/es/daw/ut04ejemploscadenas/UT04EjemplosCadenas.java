/*
 * Ejemplo formateando cadenas
 * Ejemplo concatenando cadenas
 */
package es.daw.ut04ejemploscadenas;

/**
 *
 * @author melola
 */
public class UT04EjemplosCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // -----------------------------------
        // Formateando de 3 formas diferentes
        String mensaje="¿Quieres ser mi amigo?";
        String nombre = "Pepe";
        String apellido = "López";
        
                
        // Forma 1
        System.out.println("Hola, soy "+nombre+" "+apellido+" y quiero saludarte diciéndote "+mensaje);
        
        // Forma 2
        String mensajefinal = String.format("Hola, soy %s %s y quiero saludarte diciéndote %s", nombre, apellido, mensaje);
        System.out.println(mensajefinal);
        
        // Forma 3
        System.out.printf("Hola, soy %s %s y quiero saludarte diciéndote %s y tengo %d años", nombre, apellido, mensaje,48);
        
        System.out.println("");
        // --------------------------------
        // Ejemplo concatenando cadenas y números
        int num1 = 6;
        double num2 = 63.5;
        
        String cadena = "" + num1 + num2;
        String cadena2 = num1 + num2 + "";
        String cadena3 = (num1 + num2) + "";
        String cadena4 = "" + (num1 + num2);
        
        System.out.println(cadena);
        System.out.println(cadena2);
        System.out.println(cadena3);
        System.out.println(cadena4);
        
                
        
        
    }
    
}
