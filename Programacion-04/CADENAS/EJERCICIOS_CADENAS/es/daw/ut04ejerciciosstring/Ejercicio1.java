/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/EJERCICIOS_CADENAS#ejercicio-1-validador-de-contrase%C3%B1as
 */
package es.daw.ut04ejerciciosstring;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // inferencia de tipos
        var sc = new Scanner(System.in);
        
        System.out.println("Introduce la contraseña:");
        String pwd = sc.nextLine();
        
        boolean correcta = isValidPwd(pwd);
        
        if (correcta)
            System.out.println("La contraseña es válida!!!");
        else
            System.out.println("La contraseña no es válida!!!");
        
        
    }
    
    /**
     * Método que comprueba si una pwd es válida 
     * @param password
     * @return 
     */
    public static boolean isValidPwd(String password){
        boolean longitudCorrecta = false;
        boolean tieneMay = false;
        boolean tieneMin = false;
        boolean tieneCharRaro = false;
        boolean tieneNumero = false;
        
        // Tiene entre 8 y 20 caracteres
        if (password.length() >=8 && password.length() <=20)
            longitudCorrecta = true;
        
        for (int i=0; i< password.length(); i++){
            char c = password.charAt(i);
            
            if (Character.isUpperCase(c))
                tieneMay = true;
            if (Character.isLowerCase(c))
                tieneMin = true;
            if (Character.isDigit(c))
                tieneNumero = true;
            if (c == '$' || c =='%' || c == '_' || c=='*')
                tieneCharRaro = true;
        }
        
        return (longitudCorrecta && tieneMay && tieneMin
                && tieneNumero && tieneCharRaro);
    }
    
}
