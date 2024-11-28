package es.daw.practicaguiadapoo;

import es.daw.practicaguiadapoo.model.Persona;


public class PracticaGuiadaPOO {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1 = new Persona("51519669Z", "Ivan", "Izquierdo Castillo", 18);
        Persona persona2 = new Persona("45542552Y", "Felix", "Izquierdo Castillo", 22);
        Persona persona3 = new Persona("63368998T", "Paula", "Castillo Rodrigo", 12);
        Persona persona4 = new Persona("78875115H", "Juan", "Castillo Vela", 79);
        
        persona1.imprime();
        persona2.imprime();
        
        if(persona1.esMayorEdad())
            System.out.println(persona1.getNombre()+" es mayor de edad");
        else
            System.out.println(persona1.getNombre()+" no es mayor de edad");
        
        if(persona3.esMayorEdad())
            System.out.println(persona3.getNombre()+" es mayor de edad");
        else
            System.out.println(persona3.getNombre()+" no es mayor de edad");
        
        if(persona4.esJubilado())
            System.out.println(persona4.getNombre()+" esta jubilado");
        else 
            System.out.println(persona4.getNombre()+" no esta jubilado");
            
        System.out.println("La diferencia de edad entre "+persona2.getNombre()+ " y "+persona4.getNombre()+" es "+persona4.diferenciaEdad(persona2));
        
        
    }
    
}
