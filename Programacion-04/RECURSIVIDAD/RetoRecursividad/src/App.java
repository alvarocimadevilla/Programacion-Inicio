import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de la tabla que quieres mostrar: ");
        int num = scanner.nextInt();

        System.out.print("Introduce el número de multiplicadores: ");
        int multiplicadores = scanner.nextInt();

        System.out.println("***** Tabla de multiplicar de " + num + " hasta " + multiplicadores + " ****");
        pintaTabla(num, 1, multiplicadores);

        scanner.close();
    }

    /**
     * 
     * @param numeroTabla
     * @param multiplicadorActual
     * @param multiplicadores
     */
    public static void pintaTabla(int numeroTabla, int multiplicadorActual, int multiplicadores) {

        // Condición de parada
        if (multiplicadorActual <= multiplicadores) {
            System.out.println("\t"+numeroTabla + " x " + multiplicadorActual + " = " + (numeroTabla * multiplicadorActual));

            pintaTabla(numeroTabla, multiplicadorActual + 1, multiplicadores);
        }
    }    
}
