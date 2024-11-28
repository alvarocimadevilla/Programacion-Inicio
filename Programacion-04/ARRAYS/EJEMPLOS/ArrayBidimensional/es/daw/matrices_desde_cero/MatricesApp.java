/*
 * ARRAY BIDIMENSIONAL (MATRICES
 * Ese ejemplo está contextualizado en una matriz bidimensional que representa el número de plazas por tipo de vehículo de parkings de Alcalá
 */
package es.daw.matrices_desde_cero;

import es.daw.matrices_desde_cero.util.ParkingUtils;
/*import static es.daw.matrices_desde_cero.util.ParkingUtils.cargarParking;
import static es.daw.matrices_desde_cero.util.ParkingUtils.cargarParkingAutomatico;
import static es.daw.matrices_desde_cero.util.ParkingUtils.pintaParking;
import static es.daw.matrices_desde_cero.util.ParkingUtils.sumaFila;
import static es.daw.matrices_desde_cero.util.ParkingUtils.valorCelda;*/
import static es.daw.matrices_desde_cero.util.ParkingUtils.*;
        
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class MatricesApp {

    // ÁMBITO GLOBAL A TODO EL PROYECTO
    public static Scanner TECLADO = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ---------------------------------------
        // 1. DECLARAR LOS ARRAY
        
        // SI TRABAJO CON UN SOLO PARKING (VECTOR)
        // Tamaño 3 porque hay solo 3 tipos de vehículos (vehículo, moto, furgoneta)
        int[] elVal = new int[3];
        
        // 2. METER DATOS: INICIALIZAR LOS ARRAYS
        // 2.1. CON ARRAY UNIDIMENSIONAL (VECTOR)
        elVal[0] = 20; // hay 20 plazas para motos
        elVal[1] = 50; // hay 50 plazas para coches
        elVal[2] = 10; // hay 10 plazas para furgonetas
        
        //Si no puedo trabajar con arrays entonces... no me queda otra que declarar variables sueltas para cada dato
        int numPlazasMotos = 20;
        int numPlazasCoches = 50;
        int numPlazasFurgonetas = 10;
        
        
        // Ahora quiero obtener el número de plazas totales. ¿Y sí añado otro tipo de vehículo? Tengo que crear otra variable nueva....
        int totalPlazasVal = obtenerNumPlazasTotalesSinArray(numPlazasCoches,numPlazasFurgonetas,numPlazasMotos);
        
        //Si trabajo con array. Da igual que añada otro tipo de vehículo, el método funcionará igual
        int totalPlazasValArray = obtenerNumPlazasTotalesConArray(elVal);
        
        
        
        // ---------------------------------------
        // 2. DECLARAR MATRIZ (trabajo con más de un parking)
        // Primera dimensión: filas ==> cada parking
        // Segunda dimensión: columnas ==> cada tipo de vehículo
        int[][] infoParking = new int[3][3];
        

        // 2.2. CON ARRAY BIDIMENSIONAl (MATRIZ)
        // fila 1: La paloma
        infoParking[0][0] = 10;
        // .... debo completar la matriz celda a cela usando la dimensión de fila y la dimensión de columna
        //infoParking[0][1] = ....
        
        // Según el dibujo de pizarra para poner número de plazas de tipo coche del parking el Obispado:
        infoParking[1][1] = 30;
        
        System.out.println("************ EJEMPLO 1 MATRIZ *****************");
        System.out.println("Es una matriz donde solo he rellenado dos celdas. El resto son valores por defecto");
        pintaParking(infoParking);
        
        // OTRO EJEMPLO
        // Declaro una matriz vacía que voy a rellenar a través de un método pidiendo datos al usuario
        int[][] parkingVacio = new int[3][3];
        
        // Dos formas de llamar al método cargarParking
        //es.daw.matrices_desde_cero.util.ParkingUtils.cargarParking(parkingVacio);
        //cargarParking(parkingVacio);
        
        System.out.println("************ EJEMPLO 2 MATRIZ *****************");
        pintaParking(parkingVacio);
        
        
        // OTRO EJEMPLO. MATRIZ IRREGULAR
        System.out.println("************ EJEMPLO 3 MATRIZ *****************");
        System.out.println("PINTANDO LA MATRIZ IRREGULAR:");
        int[][] parkingIrregular = {
            {10,20},
            {30,40,50,60},
            {5,10,15}
        };
        pintaParking(parkingIrregular);

        System.out.println("************ EJEMPLO 4 MATRIZ *****************");
        System.out.println("PINTANDO LA MATRIZ TOCHO REGULAR:");
        int[][] parkingTochoRegular = {
            {10,20,30,40,50},
            {66,20,30,40,50},
            {77,20,458,40,50},
            {88,20,30,40,50},
            {99,20,30,40,66},
        };
        
        pintaParking(parkingTochoRegular);
        
        // OTRO EJEMPLO. 
        //Método que rellena la matriz según el número de plazas dibujadas en la pizarra
        // Tal cual la pizarra!!!!
        int[][] parkingRelleno = cargarParkingAutomatico();
        
        
        // Ahora quiero saber cuantas plazas de coche tiene el parking obispado
        // El Obispado = fila 1 (segunda fila)
        // Tipo coche = col 1 (segunda columna)
        int numPlazas = valorCelda(parkingRelleno, 1, 1);
        System.out.println("******* El número de plazas de coche que tiene el parking obispado es: "+numPlazas);
        
        // Dime el número de plazas (de todos los tipos de vehículos)
        // de la segunda fila
        // Si le muestro un menú indicando
        // torpedo!!! elige un parking
        // 1. La Paloma
        // 2. El obispado
        // 3. Complutense
        // El usuario indica ===> el 2
        // El programa resta a la opción elegida -1
        // El Obispado se correponde al índice 1 de las filas
        
        // Dame el número total de plazas para aparcar del parking El obispado
        numPlazas = sumaFila(parkingRelleno,1);
        System.out.println("*********** Número de plazas del parking el obispado:"+numPlazas);
        
        // Dame el número de plazas de coches de todos los parking
        // Le muestro un menú al usuario.
        // Torpedo!!! elige un tipo de vehículo
        // 1. Moto
        // 2. Coche
        // 3. Furgoneta
        // El usuario indica ==> el 2 (coche)
        // El programa resta a la opción elegida -1
        
        // Devuelve el número total de plazas de coche de los parking (son 3)
        numPlazas = sumaColumna(parkingRelleno,1);
        System.out.println("**************Número de plazas de coche en Alcalá son:"+numPlazas);
                
    }
    
    /**
     * Trabajando solo con el parking el Val
     * @return 
     */
    private static int obtenerNumPlazasTotalesSinArray(int x, int y, int z){
        return x+y+z;
    }
    
    private static int obtenerNumPlazasTotalesConArray(int[] parking){
        int suma=0;
        for (int i = 0; i < parking.length; i++) {
            suma += parking[i];
        }
        return suma;
    }
    
}
