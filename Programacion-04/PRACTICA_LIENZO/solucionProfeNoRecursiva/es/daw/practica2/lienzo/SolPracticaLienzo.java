package es.daw.practica2.lienzo;

import static es.daw.practica2.lienzo.util.Lienzo.dibujarCuadro;
import static es.daw.practica2.lienzo.util.Lienzo.limpiarLienzo;
import static es.daw.practica2.lienzo.util.Utils.*;
import java.util.Scanner;


public class SolPracticaLienzo {

    // Variables globales
    public static final char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static final String[] colores = {"Blanco", "Rojo", "Verde", "Amarillo", "Azul", "Morado"};
    public static final String[] coloresCode = {"\033[39;49m", "\033[31m", "\033[32m", "\033[33m", "\033[34m", "\033[35m"};
    
    public static String[] log = {"","","","","","","","","",""}; // 10 logs
    
    public static final String COLOR_BASE = "\033[39;49m";
    
    public static final int NUM_COLS = 25;
    
    public static void main(String[] args) {
        
        System.out.println(" _      ____    ___  ____   _____   ___       ___     ____  __    __ \n" +
"| |    |    |  /  _]|    \\ |     | /   \\     |   \\   /    ||  |__|  |\n" +
"| |     |  |  /  [_ |  _  ||__/  ||     |    |    \\ |  o  ||  |  |  |\n" +
"| |___  |  | |    _]|  |  ||   __||  O  |    |  D  ||     ||  |  |  |\n" +
"|     | |  | |   [_ |  |  ||  /  ||     |    |     ||  _  ||  `  '  |\n" +
"|     | |  | |     ||  |  ||     ||     |    |     ||  |  | \\      / \n" +
"|_____||____||_____||__|__||_____| \\___/     |_____||__|__|  \\_/\\_/  ");
        
        System.out.println("[LIENZO DAW - DIBUJAR POR CONSOLA] Realizado por DAW A.");
        System.out.println("Pulsa intro para mostrarte el lienzo");
        
        leerEnter();
        limpiarLienzo();
        dibujarCuadro();
        menuOpciones();
        
        
        
    }

}
