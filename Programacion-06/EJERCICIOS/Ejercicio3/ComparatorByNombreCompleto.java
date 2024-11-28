package list;

import java.util.Comparator;

import modelo.Persona;

public class ComparatorByNombreCompleto implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        String nombreCompletoP1 = p1.getNombre()+p1.getApellidos();
        String nombrecompletoP2 = p2.getNombre()+p2.getApellidos();

        return nombreCompletoP1.compareTo(nombrecompletoP2);
        
    }
    
}
