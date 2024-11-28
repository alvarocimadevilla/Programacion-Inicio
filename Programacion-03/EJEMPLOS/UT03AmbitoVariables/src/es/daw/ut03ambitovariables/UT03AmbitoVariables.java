/*
 * Programa para explicar ámbitos globales, locales a funciones 
 * y local a un bloque
 * 
 */
package es.daw.ut03ambitovariables;

/**
 *
 * @author melola
 */
public class UT03AmbitoVariables {
    
    // ÁMBITO GLOBAL A LA CLASE
    static int variableGlobal = 2023;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables de ámbito local a la función main
        // por tanto puedo usar en toda la función y todos su bloques
        int a, b;
        a = 1;
        b = 2;
        
        if ( a < b){
            
            // Variable de ámbito local al bloque
            int c = 666;
            
            System.out.println("A es menor que b");
            a = b+1;
            
            if (a > b){
                System.out.println("A es mayor que b");
                System.out.println("El valor de c es: "+c);
            }
            
            System.out.println("El valor de c es: "+c);
        }
        
        // Quiero mostrar el valor de c fuera del ámbito local
        //System.out.println("El valor de c es: "+c); // Da eror porque no encuentra c
        
        variableGlobal++;
        System.out.println(variableGlobal);
        
        // Para que se ejecute una función necesito llamarla!!!
        miFuncion();
        
    }
    
    
    public static void miFuncion(){
        //System.out.println(a); // Da error por a está declarada en el ámbito del Main
        
        int a = 45;
        
        variableGlobal++;
        System.out.println(variableGlobal);
        
    }
    
}// final clase
