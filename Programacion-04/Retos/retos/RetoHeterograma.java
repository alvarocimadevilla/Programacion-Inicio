/*
 * https://github.com/profeMelola/Programacion-04-2023-24/blob/main/Retos/readme.md#reto-4-heterograma
 * HETEROGRAMA: palabra o frase en la que no parece repetida ninguna de las letras que la componen (vocales y consonantes)
 */
package retos;

/**
 *
 * @author melol
 */
public class RetoHeterograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Condición, la frase no lleva acentos
        String cadena = "centrifugado,hiperblanduzcos,Java,yuxtaponer,cocodrilo, y fin";
        
        //1. Compruebo que la cadena no esté vacía
        if (!cadena.isEmpty()) {

            //2. Obtengo el listado de palabras
            String[] palabras = cadena.split(",");

            //3. Recorro cada palabra y compruebo si es heterograma
            
//            for (String palabra : palabras) {
//                String mensaje = "\"" + palabra + "\"";
//                mensaje += (esHeterograma(palabra)) ? " es heterograma" : " no es heterograma";
//                System.out.println(mensaje);
//            }
            
            for (int i = 0; i < palabras.length; i++) {
                if (esHeterograma(palabras[i]))
                    System.out.println("\""+palabras[i]+"\" es heterograma");
                else
                    System.out.println("\""+palabras[i]+"\" no es heterograma");
            }

        } else {
            System.out.println("La cadena está vacía");
        }
    }

    /**
     * Método que comprueba si una cadena es heterograma
     * @param cadena
     * @return 
     */
    private static boolean esHeterograma(String cadena) {
        // Elimino espacios
        //cadena = cadena.replaceAll("\\s", "");
        cadena = cadena.replaceAll(" ", "");

        // Transformo todos las letas a minúsculas o mayúsculas para que 
        // al comparar caracteres la C == c (por ejemplo)
        cadena = cadena.toLowerCase();
        
        // Algoritmo por comparación (caracter comparado con el siguiente)
        // Forma 1:
//        for (int i = 0; i < cadena.length(); i++) {
//            for (int j = i + 1; j < cadena.length(); j++) {
//                if (cadena.charAt(i) == cadena.charAt(j)) {
//                    return false;
//                }
//            }
//        }
        
        // Forma 2
//        for (int i = 0; i < cadena.length(); i++) {
//            String subcadena = cadena.substring(i+1); //desde ese caracter (no incluido hasta el final)
//            if(subcadena.contains(String.valueOf(cadena.charAt(i))))
//                return false;
//        }
        
        // Forma 3
        for (int i = 0; i < cadena.length(); i++) {
            String subcadena = cadena.substring(i+1); //desde ese caracter (no incluido hasta el final)
            if (subcadena.indexOf(cadena.charAt(i)) != -1) //si indexOf da distinto de -1 es que lo ha encontrado y devuelve la posición
                return false;
        }
        
        return true;
    }

}
