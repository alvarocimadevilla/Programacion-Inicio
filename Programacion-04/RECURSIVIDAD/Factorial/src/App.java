public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Factorial recursivo:" + factorial(3));
        System.out.println("Factorial iterativo:" + factorialIterativo(3));
    }

    public static int factorial(int n) {

        if (n == 0)
            n = 1;
        else
            n = n * factorial(n - 1);
            
        return n;

        
        /*if (n > 1 )
            return n*factorial(--n);
        return 1;*/
        
    }

    private static int factorialIterativo(int n) {
        int result = 1;

        if (n <= 1) // Se comprueba si el número es o no 0 o 1.
            System.out.println("1");

        for (int i = 2; i <= n; i++) // Iteraremos hasta llegar al número n, multiplicando y almacenando en la
                                     // variable result el resultado de multiplicar el resultado acumulado por el
                                     // siguiente.
            result = result * i;

        return result;
    }
}
