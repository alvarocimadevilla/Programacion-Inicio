package es.daw.practica2.lienzo.util;

import static es.daw.practica2.lienzo.SolPracticaLienzo.COLOR_BASE;
import static es.daw.practica2.lienzo.SolPracticaLienzo.NUM_COLS;
import static es.daw.practica2.lienzo.SolPracticaLienzo.colores;
import static es.daw.practica2.lienzo.SolPracticaLienzo.coloresCode;
import static es.daw.practica2.lienzo.SolPracticaLienzo.letras;
import static es.daw.practica2.lienzo.util.Utils.limpiarPantalla;
import static es.daw.practica2.lienzo.util.Utils.elegirColor;
import static es.daw.practica2.lienzo.util.Utils.escribirLog;
import static es.daw.practica2.lienzo.util.Utils.leerCoordenada;
import static es.daw.practica2.lienzo.util.Utils.leerEnter;
import static es.daw.practica2.lienzo.util.Utils.menuOpciones;
import static es.daw.practica2.lienzo.util.Utils.tecladoNumero;
import java.util.Arrays;


/**
 *
 * @author melol
 */
public class Lienzo {
    
    // Inicializamos el arrays del lienzo
    static String[][] lienzo = new String[letras.length][NUM_COLS];
    
    // Array unidimensional con los historiales de los lienzos
    static final int TAMANO_HISTORIAL = 5;
    static String[][][] historial = new String[TAMANO_HISTORIAL][letras.length][NUM_COLS];
    static int numLienzosGuardados = 0;
    
    
    /**
     * Función para dibujar los marcos laterales del lienzo, el contenido del lienzo y el marco inferior
     */
    public static void dibujarLienzo(){
        
        // marco superior números
        System.out.print("         "); // 9 espacios
        for(int i = 0; i < lienzo[0].length; i++){
            if (i < 9)
                System.out.print((i+1)+"   "); // 3 espacios
            else
                System.out.print((i+1)+"  "); // 2 espacios
        }
        
        // marco superior con @
        System.out.print("\n     @"); // 5 espacios
        for(int i = 1; i < lienzo[0].length+1; i++){
            System.out.print("   @"); // 3 espacios
        }
        System.out.println("   @"); //3 espacios y última arroba del marco superior

        // lienzo
        for(int i = 0; i < lienzo.length; i++){
            System.out.print("  " + letras[i] + "  @"); // 2 espacios + letra + 2 espacios + @
            for(int j = 0; j < lienzo[i].length; j++){
                System.out.print("   "+lienzo[i][j]); // 3 espacios de separación
            }
            System.out.println("   @"); // 3 espacios
        }
        System.out.print("     @"); // 5 espacios
        
        
        // marco inferior
        for(int j = 0; j < lienzo[0].length; j++){
            System.out.print("   @"); // 3 espacios
        }
        System.out.println("   @\n"); // 3 espacios
        
        
    }
    
    /**
     * Función para limpiar el lienzo dejandolo con '.'
     */
    public static void limpiarLienzo(){
        for(int i = 0; i<lienzo.length; i++){
            for(int j = 0; j<lienzo[i].length; j++){
                    lienzo[i][j]= ".";
            }
        }
    }
    
    /**
     * Función para dibujar el lienzo
     */
    public static void dibujarCuadro(){
        limpiarPantalla();
        dibujarLienzo();
    }
    
    /**
     * 
     */
    public static void dibujarLineas(){
        System.out.println("¿Qué tipo de línea quiere dibujar?");
        System.out.println(" 1 - Línea horizontal");
        System.out.println(" 2 - Línea vertical");
        System.out.println(" 3 - Línea diagonal");
        System.out.println(" 4 - Salir");
        String sentenciaLog = "Dibujada línea ";
        int opcion = 0;
        int[] coordenada = {0,0};
        while (opcion < 1 || opcion > 4){
            System.out.print("Selección (introduzca número de opción): ");
            opcion = tecladoNumero();
        }
        if (opcion < 4){
            coordenada = leerCoordenada();
            switch (opcion){
                case 1:
                    System.out.println("Dibujar línea horizontal");
                    sentenciaLog += "horizontal en ";
                    dibujarLineaHorizontal(coordenada);
                    break;
                case 2:
                    System.out.println("Dibujar línea vertical");  
                    sentenciaLog += "vertical en ";
                    dibujarLineaVertical(coordenada);
                    break;
                case 3:
                    System.out.println("Dibujar línea diagonal");
                    sentenciaLog += "diagonal en ";
                    dibujarLineaDiagonal(coordenada);
                    break;
                default:
                    break;
            }
            sentenciaLog += Character.toString(coordenada[0]+97) + (coordenada[1]+1);
            escribirLog(sentenciaLog);
            
            dibujarCuadro();
        }
        menuOpciones();
    }
    
    /**
     * Dibujar línea horizontal
     * @param coordenada 
     */
    private static void dibujarLineaHorizontal(int[] coordenada) {
        guardarLienzo();
        for(int i = 0; i< lienzo[0].length; i++){
            lienzo[coordenada[0]][i] = "*";
        }
    }

    /**
     * Dibujar línea vertical
     * @param coordenada 
     */
    private static void dibujarLineaVertical( int[] coordenada) {
        guardarLienzo();
        for(int i = 0; i< lienzo.length; i++){
            lienzo[i][coordenada[1]] = "*";
        }
    }

    /**
     * Dibujar línea vertical
     * @param coordenada 
     */
    private static void dibujarLineaDiagonal(int[] coordenada) {
        guardarLienzo();
        int h = coordenada[1];
        int v = coordenada[0];
        // Dibujo creciente
        while(v >= 0 && v < lienzo.length && h >= 0 && h < lienzo[0].length){
            lienzo[v][h] = "*";
            v++;
            h++;
        }
        h = coordenada[1];
        v = coordenada[0];
        // Dibujo decreciente
        while(v >= 0 && v < lienzo.length && h >= 0 && h < lienzo[0].length){
            lienzo[v][h] = "*";
            v--;
            h--;
        }
    }
    
    
    /**
     * Dibujar cuadrado
     */
    public static void dibujarCuadrado(){
        int[] coordenada = {0,0};
        
        String sentenciaLog = "Dibujado ";
        System.out.print("Introduzca el tamaño del lado del cuadrado: ");
        int lado = tecladoNumero();
        sentenciaLog += "cuadrado de lado "+ lado +" en ";
        coordenada = leerCoordenada();   
        
        if (coordenada[0]+lado > letras.length || coordenada[1]+lado > NUM_COLS){
            System.out.println("El cuadrado no cabe en el lienzo");
//            System.out.println("Introduzca un número para continuar...");
//            tecladoNumero();

            sentenciaLog = "Dimensiones incorrectas. No se ha dibujado el cuadrado de lado "+lado+" en "+Character.toString(coordenada[0]+97) + (coordenada[1]+1);
            System.out.println("Pulsa enter para continuar...");
            leerEnter();

        }else{
            guardarLienzo();
            // Dibujando cuadrado
            //horizontal superior
            for(int i = 0; i < lado; i++){
                lienzo[coordenada[0]][coordenada[1]+i] ="*";
            }
            // horizontal inferior
            for(int i = 0; i < lado; i++){
                lienzo[coordenada[0]+lado-1][coordenada[1]+i] ="*";
            }
            // lateral izquierdo
            for(int i = 0; i < lado; i++){
                lienzo[coordenada[0]+i][coordenada[1]] ="*";
            }       
            // lateral derecho
            for(int i = 0; i < lado; i++){
                lienzo[coordenada[0]+i][coordenada[1]+lado-1] ="*";
            }
            sentenciaLog += Character.toString(coordenada[0]+97) + (coordenada[1]+1);
            
        }
        
        
        escribirLog(sentenciaLog);
        dibujarCuadro();
        menuOpciones();
    }
    
    /**
     * 
     */
    public static void cuboPintura(){
        guardarLienzo();
        System.out.println("Seleccione la coordenada en la que desea pintar.");
        int[] coordenada = leerCoordenada();
        
        
        int opcion = elegirColor();
        
        String sentenciaLog = "Cubo de pintura "+colores[opcion-1]+ " en " +Character.toString(coordenada[0]+97) + (coordenada[1]+1);
        System.out.println(sentenciaLog);
        
        String patron = lienzo[coordenada[0]][coordenada[1]];
        System.out.println("El patron es: "+ patron);
        lienzo[coordenada[0]][coordenada[1]] = "?";
        
        boolean finExpansion = false;
        while(!finExpansion){
            finExpansion = true;
            // expansión este-oeste
            for(int i = 0; i < lienzo.length; i++){
                // expansion este
                for(int j = 0; j < lienzo[i].length-1; j++){
                    if(lienzo[i][j].equals("?") && lienzo[i][j+1].equals(patron)){
                        lienzo[i][j+1] = "?";
                        finExpansion = false;
                    }
                }
                // expansion oeste
                for(int j = 1; j < lienzo[i].length; j++){
                    if(lienzo[i][j].equals("?") && lienzo[i][j-1].equals(patron)){
                        lienzo[i][j-1] = "?";
                        finExpansion = false;
                    }
                }
            }
            
            // expansión norte
            for(int i = 1; i < lienzo.length; i++){
                for(int j = 0; j < lienzo[i].length; j++){
                    if(lienzo[i][j].equals("?") && lienzo[i-1][j].equals(patron)){
                        lienzo[i-1][j] = "?";
                        finExpansion = false;
                    }
                }
            }
            
            // expansión sur
            for(int i = 0; i < lienzo.length-1; i++){
                for(int j = 0; j < lienzo[i].length; j++){
                    if(lienzo[i][j].equals("?") && lienzo[i+1][j].equals(patron)){
                        lienzo[i+1][j] = "?";
                        finExpansion = false;
                    }
                }
            }
        }
        
        // Reemplazar interrogaciones con el patron pintado
        String rawPatron = patron;
        
        String patronPintado = coloresCode[opcion-1]+rawPatron+COLOR_BASE;
        
        for(int i = 0; i < lienzo.length; i++){
            for(int j = 0; j < lienzo[i].length; j++){
                if(lienzo[i][j].equals("?")){
                    lienzo[i][j] = patronPintado;
                }
            }
        }
        
        escribirLog(sentenciaLog);
        dibujarCuadro(); 
        menuOpciones();
    }
 
    /**
     * 
     */
    public static void guardarLienzo(){
        if (numLienzosGuardados == TAMANO_HISTORIAL){
            // Dezplazamos el historico de operaciones
            for(int i = 1; i < historial.length; i++){
                System.out.println("COPIO el " +i+ " en " + (i-1));
                for(int j = 0; j < historial[i].length; j++){
                    historial[i-1][j] = Arrays.copyOf(historial[i][j], historial[i][j].length);
                }
            }

            numLienzosGuardados--;
        }
        
        for(int i=0; i< lienzo.length; i++){
            historial[numLienzosGuardados][i] = Arrays.copyOf(lienzo[i], lienzo[i].length);
        }
        
        numLienzosGuardados++;
        
    }
    /**
     * 
     */
    public static void deshacer(){  
        if (numLienzosGuardados > 0){
            for(int i=0; i< lienzo.length; i++){
                lienzo[i]= Arrays.copyOf(historial[numLienzosGuardados-1][i], historial[numLienzosGuardados-1][i].length);
            }
            numLienzosGuardados--;
        }
        else{
            System.out.println("No se pueden recuperar más lienzos");
            System.out.println("Pulsa enter para continuar...");
            leerEnter();
        }
        
    }
}
