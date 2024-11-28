package es.daw.examen1ev.ejercicio2;

/*
 * Módulo de Programación
 * Examen primera evaluación 2022-23
 * Ejercicio 2
 */
import es.daw.examen1ev.ejercicio2.model.Tarea;
import java.time.LocalDate;

public class ListaTODO {
    
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("*********************************");
        System.out.println("****** APP DE LISTAS TO-DO ******");
        System.out.println("Simulacro de lista con 5 tareas");
        System.out.println("*********************************");
        
        // ---------
        // PASO 1
        // ---------
        // DECLARAR LA LISTA DE TAREAS (TAMAÑO 5)
        Tarea[] tareas = new Tarea[5];
        
        // DAR DE ALTA LAS 5 TAREAS SEGÚN ESPECIFICACIONES
        /*
        Tarea 1:
        Descripción: Mi primera tarea
        Fecha límite: 2022-12-01
        Prioridad: 3

        Tarea 2:
        Descripción: Tengo que estudiar mucho Programación para aprobar
        Fecha límite: 2022-12-02
        Prioridad: 2

        Tarea 3:
        Descripción: Tengo que estudiar mucho LM
        Fecha límite: 2022-12-03

        Tarea 4:
        Descripción: En Navidad voy a repasar todos los ejercicios del GitHub
        Fecha límite: 2022-12-04
        Prioridad: 1

        Tarea 5:
        Descripción: Mi última tarea        
        */
        
        tareas[0] = new Tarea("Mi primera tarea", LocalDate.parse("2022-12-01"), 3);
        
        tareas[1] = new Tarea("Tengo que estudiar mucho Programación para aprobar",LocalDate.parse("2022-12-02"),2);
        
        tareas[2] = new Tarea("Tengo que estudiar mucho LM",LocalDate.parse("2022-12-03"));
        
        tareas[3] = new Tarea("En Navidad voy a repasar todos los ejercicios del GitHub",LocalDate.parse("2022-12-04"),1);
        
        tareas[4] = new Tarea("Mi última tarea");
        
        // ---------
        // PASO 2
        // ---------
        // CODIFICAR LA ÚLTIMA TAREA Y HACER LAS PRUEBAS PERTINENTES DE CODIFICACIÓN/DESCODIFICACIÓN
        System.out.println("***************************************************************");
        System.out.println("* Descripción original de la última tarea <"+ tareas[4].getDescripcion()+">");
        tareas[4].codificar();
        System.out.println("* CODIFICADA la última tarea...");
        System.out.println("* Descripción de la última tarea codificada <"+ tareas[4].getDescripcion()+">");

        // Intentar codificar de nuevo la tarea
        System.out.println("* Intentando codificar de nuevo la última tarea...");
        if (!tareas[4].codificar())
            System.out.println("* [ERROR] No se puede codificar la descripción de la tarea porque ya está codificada");
        
        // Descodificar la tarea
        System.out.println("* DESCODIFICADA la última tarea...");
        tareas[4].descodificar();
        System.out.println("* Descripción de la última tarea descodificada <"+ tareas[4].getDescripcion()+">");

        // Intentando descodificar de nuevo la tarea
        System.out.println("* Intentando descodificar de nuevo la última tarea...");
        if (!tareas[4].descodificar())
            System.out.println("* [ERROR] No se puede descodificar la descripción de la tarea porque no está codificada");
        
        // ---------
        // PASO 3
        // ---------
        // MOSTAR TODAS LA TAREAS RECORRIENDO LA LISTA
        listarTodasTareas(tareas);
        //System.out.println(Arrays.toString(tareas));
        
        // ---------
        // PASO 4
        // ---------
        // FINALIZAR LA TAREAS 2 Y 3
        System.out.println("***************************************************************");
        tareas[1].setFinalizada(true);
        tareas[2].setFinalizada(true);
        System.out.println("* FINALIZADAS LA SEGUNDA Y TERCERA TAREA");
        
        // MOSTRAR SOLO LAS TAREAS FINALIZADAS
        listasTareasFinalizadas(tareas);
        
    }
    
    public static void listarTodasTareas(Tarea[] tareas){
        System.out.println("***************************************************************");
        System.out.println("********** INFORMACIÓN DE TODAS LAS TAREAS ******** ***********");
        for(Tarea t:tareas)
            System.out.println(t.toString());
        System.out.println("***************************************************************");
        
    }
    
    public static void listasTareasFinalizadas(Tarea[] tareas){
        System.out.println("***************************************************************");
        System.out.println("********** INFORMACIÓN DE SOLO LAS TAREAS FINALIZAS ***********");
        int contador = 0;
        for(Tarea t:tareas){
            if (t.isFinalizada()){
                System.out.println(t.toString());
                contador++;
            }
        }
        System.out.println("Número de tareas finalizadas: "+contador);
        System.out.println("***************************************************************");
        
    }
    
    
}
