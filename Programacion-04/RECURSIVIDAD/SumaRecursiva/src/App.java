public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Suma de los enteros positivos de 5:"+sumar(5));
        System.out.println("Suma de los enteros positivos:");
        System.out.print(sumar(5));
        System.out.println("");
    }

    private static int sumar(int n){
        // int suma = 0;
        // if (n==1)   
        //     suma=1;
        // else
        //     suma = n + Sumar(n-1);
        
        // return suma;

        if (n > 1){
            System.out.print(n +" + ");
            return n + sumar(n + 1);
        }
        else{
            System.out.print(n+" = ");
            return 1;
        }

    }
}
