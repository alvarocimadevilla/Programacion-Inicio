package list;

import java.util.Comparator;

import modelo.Persona;

public class ComparatorByFechaNac implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        //(p1,p2)->p2.getFechaNacimiento().compareTo(p1.getFechaNacimiento())
        return p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
    }
    
}
