package notasFP;

/*
 */


import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Refuerzo3_16_v3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Escribe la nota de tu examen: ");
        nota = sc.nextInt();
        
        switch (nota){
            case 0:
                System.out.println("En FP no se puede poner un 0");
                break;
            case 1:
            case 2:
                System.out.println("Muy deficiente");
                break;
            case 3:
            case 4:
                System.out.println("Deficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                if (nota < 0){
                    System.out.println("En FP no se pueden poner negativos");
                }
                else{
                    System.out.println("En FP no se puede poner nota mayor que 10");
                }
                break;
        }
        
        
    } // end main
        
}// end class
