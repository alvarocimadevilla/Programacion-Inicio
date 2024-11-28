package list;

import java.util.Comparator;

import modelo.Persona;

public class ComparatorByNombre implements Comparator <Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
    
}
