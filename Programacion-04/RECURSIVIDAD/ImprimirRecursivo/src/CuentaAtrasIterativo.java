public class CuentaAtrasIterativo {
    public static void main(String[] args) throws Exception {
        System.out.println("Cuenta atrás!!!! Vamos a imprimir el número 5 por consola has llegar al 1.");
        imprimir(5);
    }

    private static void imprimir(int x){
        for (int i = x; i >= 1; i--) {
            System.out.println(i);
            
        }
    }
}
