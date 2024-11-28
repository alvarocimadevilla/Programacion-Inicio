package es.daw.utils;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import es.daw.App;
import es.daw.model.Tarjetas;

public class Utils {
    static Scanner sc = new Scanner(System.in);
    static Scanner lector = new Scanner(System.in);
    static Random r = new Random();
    static int numeroTarjetas = 0;
    static int contadorTarjetas = 0; 
    
    static ArrayList<Tarjetas> gestionTarjetas = new ArrayList<>();
    static final int longitudTarjetas = 16;

    // colores
    static String green = "\033[32m";
    static String red = "\033[31m";
    static String yellow = "\033[33m";
    static String cyan = "\033[36m";
    static String purple = "\033[35m";
    static String white = "\u001B[37m";

    public static void obtenerNumeroTarjetas() {
        System.out.println("Cuantas tarjetas vas a añadir al sistema?");
        System.out.print("> ");
        numeroTarjetas = sc.nextInt();

    }

    public static void pintaMenu() {
        System.out.println("    1.Dar de alta tarjetas de crédito");
        System.out.println("    2.Mostrar información de todas las tarjetas");
        System.out.println("    3.Modificar tarjetas");
        System.out.println("    4.Pagar");
        System.out.println("    5.Desactivar tarjeta");
        System.out.println("    6.Hacer Bizum");
        System.out.println("    7.Salir");
        System.out.println("*****************************************************************************");
    }

    public static void asignarValoresTarjetas() {
        boolean estadoActivo;
        String numero;
        String fechaCaducidad;
        String titular;
        int limiteDinero;
        int saldo;
        int cvv;

        

        System.out.println("A continuación añade la informacion de las tarjetas");
        for (int i = 0; i < numeroTarjetas; i++) {

            System.out.println("*****************************************************************************");
            Tarjetas tarjeta = new Tarjetas();
            System.out.println("Tarjeta " + (i + 1));
            System.out.print("--Titular: ");
            titular = lector.nextLine();
            tarjeta.setTitular(titular);
            System.out.print("--Numero: ");
            numero = numeroAleatorioTarjeta();
            System.out.println(numero);
            tarjeta.setNumero(numero);
            System.out.print("--CVV: ");
            cvv = cvvAleatorio();
            System.out.print(cvv);
            tarjeta.setCvv(cvv);
            System.out.print("\n--Fecha de Caducidad: ");
            fechaCaducidad = fechaAleatoria();
            System.out.print(fechaCaducidad);
            tarjeta.setFechaCaducidad(fechaCaducidad);
            System.out.print("\n--Saldo: ");
            saldo = sc.nextInt();
            tarjeta.setSaldo(saldo);
            System.out.println("--Entidad: " + tarjeta.getEntidadEmisora());
            System.out.println("Quieres poner un limite de gastos diarios?(y/n)");
            limiteDinero = ponerLimiteDinero();
            tarjeta.setLimiteDinero(limiteDinero);
            System.out.println("--Tu tarjeta ha sido activada--");
            estadoActivo = true;
            tarjeta.setEstadoActivo(estadoActivo);
            System.out.println("*****************************************************************************");

            gestionTarjetas.add(tarjeta);
            
            contadorTarjetas++;

        }
    }

    public static String fechaAleatoria() {
        String fecha = "";
        int numAleatorio = 0;
        numAleatorio = r.nextInt(12) + 1;
        fecha += numAleatorio;
        fecha += "/25";
        return fecha;
    }

    public static int cvvAleatorio() {
        int numAleatorio = 0;
        numAleatorio = r.nextInt(900) + 100;
        return numAleatorio;
    }

    public static String numeroAleatorioTarjeta() {
        int numAleatorio = 0;
        String tarjeta = "";
        for (int i = 0; i < longitudTarjetas; i++) {
            numAleatorio = r.nextInt(9) + 1;
            tarjeta += numAleatorio;
        }

        return tarjeta;
    }

    public static int ponerLimiteDinero() {
        String opcion;
        boolean opcionCorrecta = false;

        while (!opcionCorrecta) {
            System.out.print("> ");
            opcion = lector.nextLine();

            if (opcion.equals("y")) {
                opcionCorrecta = true;
                System.out.println("De cuanto dinero va a ser el limite?");
                System.out.print("> ");
                return sc.nextInt();
            } else if (opcion.equals("n")) {
                System.out.println("Se te asignará un limite de 1000");
                opcionCorrecta = true;
                return 1000;
            } else {
                System.out.println("No has puesto una opcion correcta");
            }
        }
        return 0;
    }

    public static void menuInformacionTarjetas() {

        int opcion;
        String opcion2;

        System.out.println("*****************************************************************************");
        mostrarInformacionCensurada();
        System.out.println("*****************************************************************************");
        System.out.println("Quieres consultar la informacion sin censurar?(y/n)");
        System.out.print("> ");
        opcion2 = lector.nextLine();
        if (opcion2.equals("y")) {
            System.out.println("De que tarjeta quieres consultar la informacion?(sin censurar)");
            System.out.print("> ");
            opcion = sc.nextInt();
            mostrarInformacionTarjeta(opcion - 1);
            System.out.println("*****************************************************************************");
        } else {
            System.out.println("*****************************************************************************");
        }

    }

    public static void mostrarInformacionCensurada() {
        int i = 1;
        for (Tarjetas tarjetas : gestionTarjetas) {
            System.out.print((i + "." + tarjetas.getTitular()));
            System.out.print(red + " Numero-->");
            System.out.print(white);
            mostrarNumcensurado(i);
            i++;

        }
    }

    public static void mostrarNumcensurado(int tarjetaABuscar) {

        for (int i = 0; i < longitudTarjetas; i++) {
            if (i < 4) {
                
                System.out.print(gestionTarjetas.get(tarjetaABuscar - 1).getNumero().charAt(i));
            } else {
                System.out.print(red + "#");
            }

        }
        System.out.println(white);

    }

    public static void mostrarInformacionTarjeta(int posicionTarjeta) {
        System.out.print(green + "Titular: " + white + gestionTarjetas.get(posicionTarjeta).getTitular());
        System.out.print(green + "      Numero: " + white + gestionTarjetas.get(posicionTarjeta).getNumero());
        System.out.println("");
        System.out.print(green + "CVV: " + white + gestionTarjetas.get(posicionTarjeta).getCvv());
        System.out.print(green + "                         Caducidad: " + white
                + gestionTarjetas.get(posicionTarjeta).getFechaCaducidad());
        System.out.println("");
        System.out.print(green + "Entidad: " + white + gestionTarjetas.get(posicionTarjeta).getEntidadEmisora());
        System.out.print(green + "                Estado: ");
        if (gestionTarjetas.get(posicionTarjeta).isEstadoActivo()) {
            System.out.print(white + "Activa");
        } else {
            System.out.print(white + "Desactivada");
        }
        System.out.println("");
        System.out.print(green + "Saldo: " + white + gestionTarjetas.get(posicionTarjeta).getSaldo());
        System.out.print(green + "                      Limite Gasto: " + white
                + gestionTarjetas.get(posicionTarjeta).getLimiteDinero());
        System.out.println("");
        System.out.println("*****************************************************************************");

    }

    
    public static void procesoPago(int posicionTarjeta) {
        int precio = 0;
        if (gestionTarjetas.get(posicionTarjeta).isEstadoActivo()) {
            System.out.println("A continuacion vas a realizar un pago");
            System.out.println("Cual es el precio del pago?");
            System.out.print("> ");
            precio = sc.nextInt();
            System.out.println(posicionTarjeta);
            gestionTarjetas.get(posicionTarjeta).pagar(gestionTarjetas.get(posicionTarjeta), precio);
        } else {
            System.out.println("La tarjeta esta desactivada y no puedes realizar pagos");
        }

    }

    public static void desactivarTarjetas(int posicionTarjeta) {
        String opcion = "";

        if (gestionTarjetas.get(posicionTarjeta).isEstadoActivo()) {
            System.out.println("Tu tarjeta va a ser desactivada, no podrás realizar pagos.");
            System.out.println("Desea continuar?(y/n)");
            System.out.print("> ");
            opcion = lector.nextLine();
            if (opcion.equals("y")) {
                System.out.println("Tu tarjeta ha sido desactivada");
                gestionTarjetas.get(posicionTarjeta).desactivarTarjeta(gestionTarjetas.get(posicionTarjeta));

            } else {
                System.out.println("La tarjeta no ha sido desactivada.");
            }
        } else if (!gestionTarjetas.get(posicionTarjeta).isEstadoActivo()) {
            System.out.println("La tarjeta ya esta desactivada");
        }

    }

    public static void menuModificarTarjeta(int posicionTarjeta) {
        int opcion = 0;
        System.out.println("Que quieres modificar?");
        System.out.println("    1.Cambiar titular");
        System.out.println("    2.Activar tarjeta");
        System.out.print("> ");
        opcion = sc.nextInt();
        if (opcion > 2 || opcion < 1) {
            System.out.println("No has puesto una opcion correcta");
            System.out.println("*****************************************************************************");
        } else {
            gestionTarjetas.get(posicionTarjeta).modificarTarjeta(gestionTarjetas.get(posicionTarjeta), opcion);
            System.out.println("*****************************************************************************");
        }
    }

    public static void menuHacerBizum(int posicionTarjeta1, int posicionTarjeta2) {
        int cantidad = 0;
        System.out.println("Cuanto dinero vas a enviar?");
        System.out.print("> ");
        cantidad = sc.nextInt();
        if (cantidad > gestionTarjetas.get(posicionTarjeta1).getSaldo()) {
            System.out.println("No tienes suficiente saldo");
        }
        else if (posicionTarjeta1==posicionTarjeta2) {
            System.out.println("No puedes hacer un bizum a la misma tarjeta");
        }
        else{
            gestionTarjetas.get(posicionTarjeta1).hacerBizum(gestionTarjetas.get(posicionTarjeta1), gestionTarjetas.get(posicionTarjeta2), cantidad);
        }
        System.out.println("*****************************************************************************");
    }

   

}
