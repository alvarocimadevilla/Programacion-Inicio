/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT06_UT07_POO/Herencia/3_Astros
 */
package es.daw.poo2.astros;

import es.daw.poo2.astros.model.Planeta;
import es.daw.poo2.astros.dao.AstroDAO;
import es.daw.poo2.astros.model.Astro;
import es.daw.poo2.astros.model.Satelite;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author melol
 */
public class Ej3_Astros {


    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {

        // Creamos una lista
        ArrayList<Astro> astros = new ArrayList<>();

        // Cargo la lista de astros mediante el Dao
        AstroDAO dao = new AstroDAO();

        astros = dao.select();

        
        // Muestra toda la información de los astros de la lista (sin menú)
        //mostrarListaAstros(astros,false);
        
        // A través de un menú se elige el astro a mostra la información (con menú);
        mostrarListaAstros(astros,false);

        // LLAMAR AL MÉTODO ABSTRACTO!!!!
        System.out.println("Número de distancia en soles de la tierra al sol");
        // Necesito el objeto Tierra y tengo un arraylist de astros
        // Por tanto, tengo que encontrar el objeto tierra en esa lista de astros
        // Una vez que lo tenga podré llamar a su método obtenerNumeroDistanciaSoles
        Astro tierra = getAstroByName(astros, "Tierra");
        if (tierra != null)
            System.out.println(tierra.obtenerNumeroDistanciaSoles());

        
    }    

    /**
     * 
     * @param astros
     * @param nombre
     * @return
     */
    private static Astro getAstroByName(ArrayList<Astro> astros, String nombre){
        for (Astro a : astros) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }        
        return null;

    }
   
    // Imprime la lista de astros (solo sus nombres)
    private static void mostrarListaAstros(ArrayList<Astro> astros,boolean conMenu) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== LISTA DE ASTROS ===");
        
        // Muestra la información de cada astro (sin menú)
        if (!conMenu){
            int contador = 1;
            for (Astro a : astros) {
                if (a != null) {
                    System.out.println("----------------------------------------");
                    System.out.println("Astro "+contador+" : " + a.getNombre());
                    System.out.println("----------------------------------------");
                    contador++;
                    System.out.println(a.toString());
                }
            }
        }
        else{
            int opcion = -1;
            do{
                // Muestro el nombre de los astros que están en la lista
                for (int i = 0; i < astros.size(); i++) {
                    Astro a = astros.get(i);
                    if (a != null)
                        System.out.println("Astro "+(i+1)+" : " + a.getNombre()); 
                }
                
                System.out.println("Elige un número de astro (-1 para salir): ");
                if (sc.hasNextInt()){
                    opcion=sc.nextInt();
                    sc.nextLine();
                }
                else{
                    System.out.println("Debes introducir un número");
                    opcion = 0;
                }
                    
                if (opcion > 0 && opcion <= astros.size()){
                    Astro a = astros.get(opcion-1);
                    if (a != null)
                        System.out.println(a);
                }else if (opcion == -1){
                    System.out.println("Vas a salir del programa");
                }else{
                    System.out.println("Elige un número correcto de astro");
                    opcion = 0;
                }
                
                System.out.println("Enter para continuar");
                
                sc.nextLine();
                        
            }while(opcion != -1);
        }
    }
   
}
