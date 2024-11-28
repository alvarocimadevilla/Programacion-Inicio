package retos;

import java.util.Scanner;

/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/Retos#reto-1-sin-usar-array
 */

/**
 *
 * @author melola
 */
public class Reto1String {

    // ámbito global
    static int contLetras=0, contDigitos=0, contEspacios=0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //String cadena = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe una cadena:");
        contarTiposCaracteres(sc.nextLine());
        
        System.out.printf("La cadena tiene %d dígitos, %d letras y %d espacios\n",contDigitos,contLetras,contEspacios);
        System.out.println("La cadena tiene "+contDigitos+" dígitos, "+contLetras+" letras y "+contEspacios+" espacios");
        
        
    }
    
    public static void contarTiposCaracteres(String cadena){
        //int contLetras=0, contDigitos=0, contEspacios=0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            
            if (Character.isDigit(c))
                contDigitos++;
            else if (Character.isLetter(c))
                contLetras++;
            else if (Character.isWhitespace(c))
                contEspacios++;
            
        }
        
//        System.out.printf("La cadena tiene %d dígitos, %d letras y %d espacios\n",contDigitos,contLetras,contEspacios);
//        System.out.println("La cadena tiene "+contDigitos+" dígitos, "+contLetras+" letras y "+contEspacios+" espacios");
           
    }
    
    
    
}
