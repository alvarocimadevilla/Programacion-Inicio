package retos;

import java.util.Scanner;

/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/Retos#reto-2-reto-1-usando-array
 */

/**
 *
 * @author melola
 */
public class Reto2Array {

    // ámbito global
    static int contLetras=0, contDigitos=0, contEspacios=0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe una cadena:");
        contarTiposCaracteres(sc.nextLine());
        
        System.out.printf("La cadena tiene %d dígitos, %d letras y %d espacios\n",contDigitos,contLetras,contEspacios);
        //System.out.println("La cadena tiene "+contDigitos+" dígitos, "+contLetras+" letras y "+contEspacios+" espacios");
        
        
    }
    
    public static void contarTiposCaracteres(String cadena){
        //int contLetras=0, contDigitos=0, contEspacios=0;
        
        //char[] caracteres = cadena.toLowerCase().toCharArray();
        char[] caracteres = cadena.toCharArray();
        
        
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            
            if (Character.isDigit(c))
                contDigitos++;
            else if (Character.isLetter(c))
                contLetras++;
            else if (Character.isWhitespace(c))
                contEspacios++;
        }
    }
    
}
