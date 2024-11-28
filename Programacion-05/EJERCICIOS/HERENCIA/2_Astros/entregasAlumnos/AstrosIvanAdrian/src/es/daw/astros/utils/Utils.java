/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.astros.utils;

import es.daw.astros.model.Planeta;
import es.daw.astros.model.Satelite;
import java.util.*;

public class Utils {

    public static Scanner lectorCadena = new Scanner(System.in);
    public static Scanner lectorEntero = new Scanner(System.in);
    
    public static Planeta tierra = new Planeta("Tierra", 5.97E24, 12742.0, 1.0, 365.25, 14.05, 9.78, 146600000.0);
    public static Planeta venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0, 463.85, 8.87, 108200000.0);
    public static Planeta marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97, -46.0, 3.711, 227940000.0);

    // Instanciamos satélites
    public static Satelite luna = new Satelite("Luna", 7.349E22, 3474.0, 27.5, 27.5, -153.0, 1.62, tierra);
    public static Satelite fobos = new Satelite("Fobos", 1.072E16, 11000.0, 0.0, 0.319, -40.15, 0.0084, marte);
    public static Satelite deimos = new Satelite("Deimos", 2.244E15, 12400.0, 0.0, 1.262, -40.15, 0.0039, marte);

    public static void mostrarMenu() {
        System.out.println("=== LISTA DE ASTROS ===");
        System.out.println("Astro 1 : " + tierra.getNombre());
        System.out.println("Astro 2 : " + venus.getNombre());
        System.out.println("Astro 3 : " + marte.getNombre());
        System.out.println("Astro 4 : " + luna.getNombre());
        System.out.println("Astro 5 : " + fobos.getNombre());
        System.out.println("Astro 6 : " + deimos.getNombre());
        System.out.println("Elige un numero de astro (-1 para salir):\n");
    }

    public static void mostrarSatelite(Planeta planeta){
        if (planeta.getSatelites().isEmpty()) {
            System.out.println("\tNo tiene satelites");
        }else{
            System.out.println("\tLista de satelites:");
            for (int i = 0; i < planeta.getSatelites().size(); i++) {
                System.out.println("\t- Satelite "+(i+1)+": "+planeta.getSatelites().get(i).getNombre());
            }
        }
    }
    
    public static void mostrarInfoPlaneta(Planeta planeta){
        System.out.println("**** Planeta " + planeta.getNombre() + " ****");
        System.out.println(planeta.toString());
        mostrarSatelite(planeta);
    }
    public static void mostrarInfoSatelites(Satelite satelite){
        System.out.println("**** Satelite " + satelite.getNombre() + " ****");
        System.out.println(satelite.toString());
    }
    
    
}
