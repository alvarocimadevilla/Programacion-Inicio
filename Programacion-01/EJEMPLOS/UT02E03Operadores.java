package ut02e03operadores;

/**
 * En este ejemplo vamos a aprender a usar los operadores.
 * Los operadores nos permiten actuar con los datos y las variables
 * para realizar operaciones y cálculos que necesitemos en nuestros
 * programas.
 * En este ejemplo estudiaremos los operadores aritméticos, los de 
 * asignación, los de comparación y los lógicos.
 */
public class UT02E03Operadores {

    public static void main(String[] args) {
        
        // Operadores aritméticos
        System.out.println("-----Operadores aritméticos-----");
        int a = 5, b = 2, resultado;
        resultado = a + b;
        System.out.println("Suma: " + resultado);
        resultado = a - b;
        System.out.println("Resta: " + resultado);
        resultado = a * b;
        System.out.println("Multiplicación: " + resultado);
        resultado = a / b;
        System.out.println("División: " + resultado);
        resultado = a % b;
        System.out.println("Módulo: " + resultado);
        resultado = a++;
        System.out.println("Incremento++: " + resultado);
        System.out.println("Valor de a: " + a);
        resultado = b--;
        System.out.println("Decremento--: " + resultado);
        System.out.println("Valor de b: " + b);
        a = 5;
        b = 2;
        resultado = ++a;
        System.out.println("++Incremento: " + resultado);
        System.out.println("Valor de a: " + a);
        resultado = --b;
        System.out.println("--Decremento: " + resultado);
        System.out.println("Valor de b: " + b);
        a++; // Esta expresión suele usarse sola sin asignación.
        
        
        // Operadores de asignación
        System.out.println("-----Operadores de asignación-----");
        int x;
        x = 1;
        x += 1; // x = x + 1
        x -= 1;
        x *= 1;
        x /= 1;
        x %= 1;
        
        // Operadores de comparación (devuelven true o false)
        System.out.println("-----Operadores de comparación-----");
        a = 2;
        b = 1;
        boolean r;
        System.out.println("a=" + a + " b=" + b);
        r = (a == b);
        System.out.println("(a == b): " + r); // igual
        r = (a != b);
        System.out.println("(a != b): " + r); // no igual
        r = (a > b);
        System.out.println("(a > b): " + r); // mayor
        r = (a < b);
        System.out.println("(a < b): " + r); // menor
        r = (a >= b);
        System.out.println("(a >= b): " + r); // mayor o igual
        r = (a <= b);
        System.out.println("(a <= b): " + r); // menor o igual
        
        // Operadores lógicos (AND, OR y NOT)
        System.out.println("-----Operadores lógicos-----");
        a = 3;
        b = 7;
        System.out.println("a=" + a + " b=" + b);
        r = (a < 5 && b > 5); // AND - es cierto si las dos partes lo son
        System.out.println("(a < 5 && b > 5): " + r);
        r = (a < 5 || b > 10); // OR - es cierto si una de las dos lo es
        System.out.println("(a < 5 && b > 5): " + r);
        r = !r; // Invierte el resultado lógico false->true true->false
        System.out.println("Inverso del anterior: " + r);
    }
    
}


