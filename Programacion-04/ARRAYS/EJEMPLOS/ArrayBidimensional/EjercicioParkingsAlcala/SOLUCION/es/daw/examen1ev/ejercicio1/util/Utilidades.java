package es.daw.examen1ev.ejercicio1.util;
import static es.daw.examen1ev.ejercicio1.ParkingsAlcala.NOMBRE_PARKINGS;
import static es.daw.examen1ev.ejercicio1.ParkingsAlcala.NOMBRE_VEHICULOS;
import static es.daw.examen1ev.ejercicio1.ParkingsAlcala.parkings;
import java.util.Arrays;
import java.util.Scanner;

public class Utilidades {
    
    public static final Scanner SC = new Scanner(System.in);
    public static final int NUM_PARKINGS = 4;
    public static final int NUM_TIPO_VEHICULOS = 4;

    /**
     * Método que devuelve una matriz cargada con los datos de los aparcamientos
     * públicos de Alcalá y el número de plazas por cada tipo de vehículo
     * @return 
     */
    public static int[][] cargarDatos(){
        int[][] parkings = new int[NUM_PARKINGS][NUM_TIPO_VEHICULOS];
        
        parkings[0] = new int[]{25,20,0,5};
        parkings[1] = new int[]{32,15,10,0};
        parkings[2] = new int[]{47,25,15,10};
        parkings[3] = new int[]{35,18,12,0};
        
        return parkings;
    }
    
    /**
     * Método que muestra por consola el menú del programa
     */
    public static void mostrarMenu(){
        System.out.println("");
        System.out.println("\t----------------------------------------------");
        System.out.println("\t---- [AYUNTAMIENTO DE ALCALÁ DE HENARES]  ----");
        System.out.println("\t---  INFORMACIÓN DE PLAZAS DE APARCAMIENTO ---");
        System.out.println("\t----------------------------------------------");
        System.out.println("\t----------------- [INFORMES] -----------------");
        System.out.println("\t1. Informe general");
        System.out.println("\t2. Número de plazas totales en Alcalá");
        System.out.println("\t3. Número de plazas para un determinado tipo de vehículo en Alcalá");
        System.out.println("\t4. Número de plazas totales de un parking concreto");
        System.out.println("\t5. Número de plazas de un determinado tipo de vehículo de un parking concreto");
        System.out.println("\t----------------------------------------------");
        System.out.println("\t6. [INTERCAMBIAR] Intercambiar plazas de aparcamiento de un mismo parking");
        System.out.println("\t7. [ORDENAR] Mostrar número de plazas ordenadas descendentemente");
        System.out.println("");
        System.out.println("\t8. SALIR");
        System.out.println("\t----------------------------------------------");
        System.out.println("\tElige una opción:");
        
    }
    
    /**
     * Método que muestra el menú y devuelve la opción elegida
     * @return 
     */
    public static int cargarMenu(){
        
        int opcion = 8; //por defecto opción de salir
        
        mostrarMenu();
        
        if (SC.hasNextInt())
            opcion = SC.nextInt();
        
        SC.nextLine(); 
        return opcion;

    }
    
    /**
     * Método que gestiona la opción elegida en el menú y llama al método correspondiente
     */
    public static void gestionarMenu(){
        int opt = 5;
        int rdo = 0;
        int tipoVehiculo = 0;
        int numParking = 0;
        
        do{
            opt = cargarMenu();
            
            switch(opt){
                case 1:
                    // OPCIÓN 1 DEL MENÚ: MOSTRAR INFORME GENERAL
                    mostrarInformeGeneral();
                    break;
                case 2:
                    // OPCIÓN 2 DEL MENÚ: MOSTRAR EL NÚMERO DE PLAZAS TOTALES
                    rdo = obtenerNumPlazasTotal();
                    System.out.println("\tEl número de plazas totales en Alcalá es: "+rdo);
                    break;
                case 3:
                    // OPCIÓN 3 DEL MENÚ: MOSTRAR EL NÚMERO DE PLAZAS DE UN DETERMINADO VEHÍCULO
                    System.out.println("\tIndica el tipo de vehículo ( 1: coche, 2: moto, 3: furgoneta, 4: camión)");
                    tipoVehiculo = SC.nextInt();
                    rdo = obtenerNumPlazasPorTipoVehiculo(tipoVehiculo);
                    System.out.println("\tEl número de plazas en Alcalá de <"+getTipoVehiculo(tipoVehiculo)+"> es: "+rdo);
                    break;
                case 4:
                    // OPCIÓN 4 DEL MENÚ: MOSTRAR EL NÚMERO DE PLAZAS TOTALES DE UN PARKING CONCRETO
                    System.out.println("Indica el número de parking (1: El Mercado, 2: San Lucas, 3: Obispado, 4: La paloma):");
                    numParking = SC.nextInt();
                    rdo = obtenerNumPlazasPorParking(numParking);
                    System.out.println("El número de plazas del parking <"+getNombreParking(numParking)+"> es: "+rdo);
                    break;
                case 5:
                    // OPCIÓN 5 DEL MENÚ: MOSTRAR EL NÚMERO DE PLAZAS DE UN DETERMINADO VEHÍCULO DE UN PARKING CONCRETO
                    System.out.println("Indica el tipo de vehículo ( 1: coche, 2: moto, 3: furgoneta, 4: camión):");
                    tipoVehiculo = SC.nextInt();
                    System.out.println("Indica el número de parking (1: El Mercado, 2: San Lucas, 3: Obispado, 4: La paloma):");
                    numParking = SC.nextInt();
                    rdo = obtenerNumPlazasPorParkingPorTipoVehiculo(numParking, tipoVehiculo);
                    System.out.println("El número de plazas de <"+getTipoVehiculo(tipoVehiculo)+"> del parking <"+getNombreParking(numParking)+"> es: "+rdo);
                    break;
                case 6:
                    // OPCIÓN 6 DEL MENÚ: MODIFICAR EL NÚMERO DE PLAZAS DE UN PARKING CONCRETO DE UN TIPO CONCRETO
                    System.out.println("Indica el número de parking donde intercambiar plazas (1: El Mercado, 2: San Lucas, 3: Obispado, 4: La paloma):");
                    numParking = SC.nextInt();
                    
                    System.out.println("\tIndica el primer tipo de vehículo  ( 1: coche, 2: moto, 3: furgoneta, 4: camión)");
                    tipoVehiculo = SC.nextInt();
                    
                    System.out.println("\tIndica el segundo tipo de vehículo para intercambiar las plazas ( 1: coche, 2: moto, 3: furgoneta, 4: camión)");
                    int tipoVehiculo2 = SC.nextInt();
                    
                    intercambiarPlazas(numParking, tipoVehiculo, tipoVehiculo2);
                    
                    System.out.println("\tSe han intercambiado correctamente las plazas de <"+getTipoVehiculo(tipoVehiculo)+"> a <"+getTipoVehiculo(tipoVehiculo2)+"> en el parking <"+getNombreParking(numParking)+">");
                    break;
                case 7:
                    System.out.println("Número de plazas por parking ordenadas descendentemente:");
                    mostrarNumPlazasPorParkingOrdenadasDesc();
                    break;
                case 8:
                    System.out.println("Se cierra el programa!!!!\n");
                    break;
                default:
                    System.out.println("Elige una opción correcta del menú");
            }
        }while(opt != 8);
    }
    
    /**
     * [opción 1 del menú]
     * Método que muestra el informe general con toda la información 
     * de todos los aparcamientos
     */
    public static void mostrarInformeGeneral(){
        for(int i=0; i<parkings.length;i++){
            System.out.println("---------------------------------------------------");
            System.out.println("Información del parking "+NOMBRE_PARKINGS[i]);
            for(int j=0; j<parkings[i].length; j++){
                System.out.println("Número de plazas de <"+NOMBRE_VEHICULOS[j]+">:"+parkings[i][j]);
            }
        }
    }
    
    
    /**
     * [opción 2 del menú]
     * Este método devuelve el número total de plazas de todos los tipos de 
     * vehículos de los cuatro aparcamientos públicos de Alcalá.
     * @return 
     */
    public static int obtenerNumPlazasTotal(){
        int total = 0;
        for (int[] parking : parkings) {
            for (int j = 0; j < parking.length; j++) {
                total += parking[j];
            }
        }
        return total;
    }
    
    /**
     * [opción 3 del menú]
     * Este método devuelve el número total de plazas en Alcalá de un tipo de vehículo concreto.
     * @param tipoVehiculo
     * @return 
     */
    public static int obtenerNumPlazasPorTipoVehiculo(int tipoVehiculo){
        int total = 0;
        for (int[] parking : parkings) {
            total += parking[tipoVehiculo-1];
        }
        return total;
        
   }
    
    /**
     * [opción 4 del menú]
     * Este método devuelve el número total de plazas de un parking concreto
     * @param numParking
     * @return 
     */
    public static int obtenerNumPlazasPorParking(int numParking){
        int total = 0;
        for(int col=0; col < parkings[numParking -1].length; col++)
            total += parkings[numParking -1][col];
        
        return total;
    }
    
    /**
     * [opción 5 del menú] 
     * Este método devuelve el número de plazas de 
     * un parking concreto y de un tipo de vehículo concreto.
     * @param numParking
     * @param tipoVehiculo
     * @return 
     */
    public static int obtenerNumPlazasPorParkingPorTipoVehiculo(int numParking, int tipoVehiculo){
        return parkings[numParking -1][tipoVehiculo -1];
    }
    
    /**
     * [opción 6 del menú]
     * Este método intercambia el número de plazas de un tipo de vehículo por otro 
     * dentro de un mismo parking
     * @param numParking
     * @param tipoVehiculo1
     * @param tipoVehiculo2 
     */
    public static void intercambiarPlazas(int numParking, int tipoVehiculo1, int tipoVehiculo2){
        int aux = parkings[numParking-1][tipoVehiculo1-1];
        parkings[numParking-1][tipoVehiculo1-1] = parkings[numParking-1][tipoVehiculo2-1];
        parkings[numParking-1][tipoVehiculo2-1] = aux;
    }

    /**
     * [opción 7 del menú]
     * Este método muestra por consola el número total de plazas por parking de forma
     * descendente
     */
    public static void mostrarNumPlazasPorParkingOrdenadasDesc(){
        int[] plazasPorParking = new int[NUM_PARKINGS];
        
        for(int i=0; i <parkings.length;i++){
            plazasPorParking[i] = obtenerNumPlazasPorParking(i+1);
        }
        
        Arrays.sort(plazasPorParking);
        
        for(int i= plazasPorParking.length - 1;i>= 0;i--){
            System.out.printf(" [%d] ",plazasPorParking[i]);
        }
        System.out.println("");
            
        
        
    }
    
    // --------------- OTROS MÉTODOS ----------------
    /**
     * Método que devuelve el nombre del parking en base a su posición 
     * como fila de la matriz parkings
     * @param numParking
     * @return 
     */
    private static String getNombreParking(int numParking){
        return NOMBRE_PARKINGS[numParking - 1];
    }
    
    /**
     * Método que devuelve el tipo de vehículo en base a su posición
     * como columna de la matriz parkings
     * @param tipoVehiculo
     * @return 
     */
    private static String getTipoVehiculo(int tipoVehiculo){
        return NOMBRE_VEHICULOS[tipoVehiculo - 1];
    }
}
