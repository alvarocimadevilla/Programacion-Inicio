package es.daw;

import java.util.Scanner;

import es.daw.model.Tarjetas;
import es.daw.utils.Utils;

public class App {
    static Scanner lector = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // cambiar a array list, index of
        int opcion = 0;
        int tarjeta = 0;
        int tarjeta2 = 0;
        String opcion2;
        boolean tarjetasDisponibles = false;
        System.out.println("*****************************************************************************");
        System.out.println("************BIENVENIDO AL MENU DEL SISTEMA DE GESTION DE TARJETAS************");
        while (opcion != 7) {
            Utils.pintaMenu();
            System.out.println("Que quieres hacer?");
            System.out.print("> ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:

                    Utils.obtenerNumeroTarjetas();
                    Utils.asignarValoresTarjetas();
                    tarjetasDisponibles = true;
                    break;
                case 2:
                    if (tarjetasDisponibles) {
                        Utils.menuInformacionTarjetas();
                    } else {
                        System.out.println("Todavia no hay tarjetas dadas de alta.");
                    }
                    break;

                case 3:
                    if (tarjetasDisponibles) {
                        Utils.mostrarInformacionCensurada();
                        System.out.println(
                                "*****************************************************************************");
                        System.out.println("Que tarjeta quieres modificar?");
                        System.out.print("> ");
                        tarjeta = sc.nextInt();
                        tarjeta--;
                        Utils.menuModificarTarjeta(tarjeta);
                    } else {
                        System.out.println("Todavia no hay tarjetas dadas de alta.");
                    }
                    break;

                case 4:
                    if (tarjetasDisponibles) {
                        Utils.mostrarInformacionCensurada();
                        System.out.println(
                                "*****************************************************************************");
                        System.out.println("Con que tarjeta vas a realizar el pago?");
                        System.out.print("> ");
                        tarjeta = sc.nextInt();
                        tarjeta--;
                        Utils.procesoPago(tarjeta);
                        System.out.println(
                                "*****************************************************************************");

                    } else {
                        System.out.println("Todavia no hay tarjetas dadas de alta.");
                    }
                    break;

                case 5:
                    if (tarjetasDisponibles) {
                        Utils.mostrarInformacionCensurada();
                        System.out.println(
                                "*****************************************************************************");
                        System.out.println("Que tarjeta vas a desactivar?");
                        System.out.print("> ");
                        tarjeta = sc.nextInt();
                        tarjeta--;
                        Utils.desactivarTarjetas(tarjeta);
                        System.out.println(
                                "*****************************************************************************");
                    } else {
                        System.out.println("Todavia no hay tarjetas dadas de alta.");
                    }
                    break;
                case 6:
                    Utils.mostrarInformacionCensurada();
                    
                    System.out.println(
                            "*****************************************************************************");
                    System.out.println("Que tarjeta va a hacer el bizum?");
                    System.out.print("> ");
                    tarjeta = sc.nextInt();
                    tarjeta--;
                    System.out.println("Que tarjeta va a recibir el bizum?");
                    System.out.print("> ");
                    tarjeta2 = sc.nextInt();
                    tarjeta2--;
                    Utils.menuHacerBizum(tarjeta, tarjeta2);

                    break;
                case 7:
                    System.out.println("Vas a salir del programa");
                    break;

                default:
                    System.out.println("Elige una opción correcta.");
                    break;
            }
        }

    }

}
