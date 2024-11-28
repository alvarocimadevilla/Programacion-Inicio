/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT06_UT07_POO/Herencia/1_Empleado
 */
package es.daw.poo2.empleados;

import java.util.ArrayList;
import java.util.Arrays;

import es.daw.poo2.empleados.model.Directivo;
import es.daw.poo2.empleados.model.Operario;
import es.daw.poo2.empleados.model.Tecnico;
import es.daw.poo2.empleados.model.Empleado;
import es.daw.poo2.empleados.model.Oficial;

/**
 *
 * @author melol
 */
public class Ej1_Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo","especialidad");
        
        Tecnico T2 = new Tecnico();
        
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
        System.out.println(T2);
        
        // getClass(): obtener la clase en tiempo de ejecución real del objeto
        System.out.println("* GetClass:");
        System.out.println("E1: "+E1.getClass());
        System.out.println("D1: "+D1.getClass());
        System.out.println("OP1: "+OP1.getClass());
        System.out.println("OF1: "+OF1.getClass());
        System.out.println("T1: "+T1.getClass());

        // POLIMORFISMO
        Empleado[] empleados = new Empleado[10];
        empleados[0] = E1;
        empleados[1] = D1;
        empleados[2] = OP1;
        empleados[3] = OF1;
        empleados[4] = T1;
        empleados[5] = T2;

        // Primera forma 
        System.out.println(Arrays.toString(empleados));

        // Segunda forma
        System.out.println("********** LISTADO DE EMPLEADOS **********");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            
        }

        // Ahora con arraylist
        ArrayList<Empleado> empleados2 = new ArrayList<>();
        empleados2.add(E1);
        // ....

        System.out.println("********** LISTADO DE EMPLEADOS ARRAYLIST**********");
        ArrayList<Empleado> empleados3 = new ArrayList<>(Arrays.asList(empleados));
        for (Empleado empleado : empleados3) {
            System.out.println(empleado);
        }


    }
    
}
