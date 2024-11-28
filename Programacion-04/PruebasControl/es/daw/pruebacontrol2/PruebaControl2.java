/*
 * Prueba de Control 2
 */
package es.daw.pruebacontrol2;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class PruebaControl2 {

    static String numero1, numero2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VERSIÓN 1: dos números con el mismo número de dígitos
//        String numero1 = "8257";
//        String numero2 = "9191";

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer número:");        
        numero1 = sc.nextLine();
        
        System.out.println("Escribe el segundo número:");        
        numero2 = sc.nextLine();
        
        System.out.println("La suma de "+numero1+" y "+numero2+" se hace así:");
        
        String resultado = sumar3();
        
        System.out.println("\nEl resultado de la suma:");
        System.out.println("  "+numero1);
        System.out.println("+ "+numero2);
        for(int i=0;i<=numero1.length()+2;i++)
            System.out.print("-");
        System.out.println("\n  "+resultado);
    }
    
    public static String sumar(){
        String resultado = "";
        int acarreo = 0;
        int contador = 1;
                
        
        // Como tienen la misma longitud da igual el length que coja
        for(int i=numero1.length()-1;i >= 0;i--){
            
            // DIFERENTES FORMAS DE CONVERTIR UN CARACTER EN UN ENTERO
            //int d1 = Integer.parseInt(""+numero1.charAt(i));
            //int d2 = Integer.parseInt(""+numero2.charAt(i));
            //int d1 = Integer.parseInt(String.valueOf(numero1.charAt(i)));
            //int d2 = Integer.parseInt(String.valueOf(numero2.charAt(i)));
            int d1 = Character.getNumericValue(numero1.charAt(i));
            int d2 = Character.getNumericValue(numero2.charAt(i));
            
            int suma = d1 + d2 + acarreo;
            
            if (acarreo > 0)
                System.out.println("\nPASO ["+contador+"]: "+d1+" + "+d2+"+ acarreo (1) "+" = "+suma);
            else
                System.out.println("\nPASO ["+contador+"]: "+d1+" + "+d2+" = "+suma);
            
            acarreo = suma/10;
            
            System.out.println("Y me llevo: "+acarreo);
            
            /*
            if( i == 0 && acarreo == 1)
                resultado =  acarreo +( (suma % 10) + resultado);
            else
                resultado =  (suma % 10) + resultado;
            */
            contador++;
            
        }
        //return resultado;
        return String.valueOf(Integer.parseInt(numero1)+Integer.parseInt(numero2));
        
    }
    
    public static String sumar2(){
        // Completar con ceros cuando los dígitos son distintos
        int numCeros = 0;
        if (numero1.length() > numero2.length()){
            numCeros = numero1.length() - numero2.length();
            for(int i=0; i<numCeros;i++)
                numero2 = "0"+numero2;
        }else{
            numCeros = numero2.length() - numero1.length();
            for(int i=0; i<numCeros;i++)
                numero1 = "0"+numero1;
            
        }
        
        return sumar();
    }
    
    public static String sumar3(){
        int numCeros = 0;
        
        numCeros = numero1.length() - numero2.length();
        
        if (numCeros > 0){
            for(int i=0; i<numCeros;i++)
                numero2 = "0"+numero2;            
        }else{
            for(int i=0; i>numCeros;i--)
                numero1 = "0"+numero1;            
        }
        
        return sumar();
    }
}
