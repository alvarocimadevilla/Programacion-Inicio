package es.daw.examen1ev.ejercicio1;

/*
 * Módulo de Programación
 * Examen primera evaluación 2022-23
 * Ejercicio 1
 */
import es.daw.examen1ev.ejercicio1.util.Utilidades;

public class ParkingsAlcala {
    
    // Matriz donde guardar toda la información de plazas de aparcamiento por tipo de vehículo de
    // los cuatro aparcamientos públicos de Alcalá
    public static int[][] parkings;
    
    public static final String[] NOMBRE_PARKINGS = {"El Mercado","San Lucas","Obispado","La Paloma"};
    public static final String[] NOMBRE_VEHICULOS = {"coche","moto","furgoneta","camión"};
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("**BIENVENIDO AL SISTEMA DE INFORMACIÓN DE PLAZAS DE APARCAMIENTO DE ALCALÁ DE HENARES **");
        
        // 1. SE CARGAN LOS DATOS DIRECTAMENTE AL INICIAR EL PROGRAMA (no tocar!!!!)
        parkings = Utilidades.cargarDatos();
        System.out.println("Datos cargados correctamente.");
        
        // 2. SE MUESTRA EL MENÚ Y SE GESTIONAN LAS DIFERENTES OPCIONES DEL MISMO
        Utilidades.gestionarMenu();
        
    }
    
}
