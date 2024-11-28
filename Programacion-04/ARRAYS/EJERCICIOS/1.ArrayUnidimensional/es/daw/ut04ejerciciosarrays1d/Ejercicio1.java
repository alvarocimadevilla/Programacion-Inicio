/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/ARRAYS/EJERCICIOS/ArrayUnidimensional#ejercicio-1
 */
package es.daw.ut04ejerciciosarrays1d;

import java.util.Random;

/**
 * Ejemplo github
 * @author melola
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaración del array de tamaño 10 de enteros
        int[] valores = new int[20];
        
        // Cargo con un bucle 10 números aleatorios (tamaño del array)
        // Si el tamaño es 20, el resto va a ceros
        for (int i = 0; i < 10; i++) {
            // Obtener un aleatorio entre 1 y 100
            // Forma 1: Math.random()
            //int aleatorio1 = (int)Math.random()*100 + 1;
            
            // Forma 2: clase Random()
//            Random aleatorio2 = new Random();
//            valores[i]=aleatorio2.nextInt(100)+1;
              valores[i]= new Random().nextInt(100)+1;
            
//            int numEntre0y5 = aleatorio2.nextInt(6);
//            int numEntre1y5 = aleatorio2.nextInt(5)+1;

            System.out.println("Valores:"+valores[i]);
        }
        
        int suma = 0; // acumulador o sumatorio
        
        // Forma 1: for tradicional
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        
        // Forma 2: for reducido
//        for (int valor : valores) {
//            suma+=valor;
//        }

        System.out.printf("La suma de los valores aleatorios es %d\n",suma);
        System.out.println("La suma de los valores aleatorios es "+suma);
        
        pintarDatosConPrintf();
        
        concatenarConStringBuilder();
        
    }
    
    /**
     * Método para unas pruebecillas con printf
     */
    private static void pintarDatosConPrintf(){
        String nombre="Pepe";
        String apellido="Elola";
        int edad = 48;
        float altura = 1.67f;
        
        System.out.println("El alumno "+nombre+" "+apellido+", con "
                + "edad "+edad+" y altura "+altura+" cm, no estudia nada!!!");
        
        System.out.printf("\tEl alumno %s %s, con edad %d y altura %.2f cm, no estudia nada!!!\n",nombre, apellido,edad,altura);
        
    }
    
    private static void concatenarConStringBuilder(){
        String fin ="\nY CHIMPÚN!!!!!";
        StringBuilder sb = new StringBuilder("UN SALUDO: ");
        sb.append("Hola ");
        sb.append("amiguito");
        sb.append(", qué tal estás?");
        sb.append(fin);
        System.out.println(sb.toString());
        
        
    }
    
}
