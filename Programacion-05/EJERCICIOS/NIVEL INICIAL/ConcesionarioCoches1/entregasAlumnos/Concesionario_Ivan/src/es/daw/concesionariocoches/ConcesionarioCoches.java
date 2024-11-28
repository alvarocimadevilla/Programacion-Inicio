package es.daw.concesionariocoches;

import es.daw.concesionariocoches.Model.Coche;
import static es.daw.concesionariocoches.Util.Utils.*;
import java.util.Scanner;

public class ConcesionarioCoches {

    static final int MAX_COCHES = 10;
    public static Scanner lectorCadena = new Scanner(System.in);
    public static Scanner lectorEnteros = new Scanner(System.in);

    static Coche[] concesionario = new Coche[MAX_COCHES];

    public static void main(String[] args) {

        Coche coche1 = new Coche("6545YEW", 5, "Toyota", 500000, 56000);
        concesionario[0] = coche1;
        Coche coche2 = new Coche("7889TWQ", 5, "Tesla", 250000, 80000);
        concesionario[1] = coche2;
        Coche coche3 = new Coche("1223KYS", 3, "Ferrari", 750000, 100000);
        concesionario[2] = coche3;
        Coche cocheAux = new Coche();
        /*
        for (Coche coche : concesionario) {
            if(coche != null)
            System.out.println(coche.toString());                
        }
        */
        
        informeDescuentos(concesionario);
        System.out.println("************ ESPACIOS LIBRES *************");
        System.out.println("Quedan libres en el concesionario "+parkingLibre(concesionario)+" huecos");
        System.out.println("******************************************");
       // cambiarPrecio(concesionario, "6545YEW");        
        descuentoPorMatricula(concesionario, "Tesla", 50 );
        informeDescuentos(concesionario);        
        informeByPrecio(concesionario, 80000);

    }

    

}
