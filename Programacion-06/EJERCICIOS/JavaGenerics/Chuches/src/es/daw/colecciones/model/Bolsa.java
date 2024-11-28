package es.daw.colecciones.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T>{

    private ArrayList<T> lista = new ArrayList<>();
    private int tope;


    public Bolsa(int tope) {
        //super();
        this.tope = tope;
    }

    public void add(T objeto) throws Exception{
        // Alcanzado el limite no se podrán añadir mas. 
        // Crea una excepción que controle dicho caso.
        if (lista.size() >= tope){
            throw new Exception("No caben más!!!");
        }

        lista.add(objeto);
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }
    

    
}
