package ut02ut03;

/**
 *
 * @author melola
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 5;
        
        //incrementar en 1
        numero = numero +1; // 6
        
        //incrementar en 1
        numero++; //7
        
        //decrementar en 1
        numero--; //aquí da 6
        
        //preincremento 
        ++numero; //7
        
        //predecremento
        --numero; //6
        
        
        System.out.println("1. Numero: "+numero);
        
        
        // ---------------------------
        /*
        p1 += op2       op1 = op1 + op2
        op1 -= op2      op1 = op1 - op2
        op1 *= op2      op1 = op1 * op2
        op1 /= op2      op1 = op1 / op2
        op1 %= op2      op1 = op1 % op        
        */
        int numero1 = 1;
        int numero2 = 3;
        
        // numero1 = numero1 + numero2;
        //numero1 += numero2;

        //numero1 = numero1 - numero2;
        numero1 -= numero2;
        
        System.out.println("2. Numero:"+numero1);
        
        
        // --------------------------------
        // OPERADORES LÓGICOS CONDICIONALES
        // -------------------------------
        
        // variables no inicializadas = no tienen asignado ningún valor
        
        // 2 formas de declar variables
        
        int num1 = 5, num2 = 5;
        
        // int num1 = 0;
        //int num2 = 0;
        
        System.out.println("num1 MAYOR num2: "+ (num1 > num2) );
        System.out.println("num2 MAYOR num1: "+ (num2 > num1) );
        System.out.println("num1 MENOR num2: "+ (num1 < num2) );
        System.out.println("num1 IGUAL num2: "+ (num1 == num2) );
        System.out.println("num1 MAYOR_IGUAL num2: "+ (num1 >= num2) );
        System.out.println("num1 DISTINTO num2: "+ (num1 != num2) );
        System.out.println("num1 MENOR_IGUAL num2: "+ (num1 <= num2) );
        
        
        // --------------------------------
        // CASTING
        // -------------------------------        
        //System.out.println("5/9"); //pinta cadena de caracteres
        
        int n1=5;
        int n2=9;
        int rdo= 5/9;
        System.out.println(rdo);
        
        System.out.println(5/9);
        
        System.out.println((float)5/9);
        
        System.out.println(5.0/9.0);
        
        System.out.println(5.0f/9.0f);
        
        
        
    }
    
}
