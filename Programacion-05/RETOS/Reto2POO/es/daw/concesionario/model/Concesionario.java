package es.daw.concesionario.model;

import java.util.ArrayList;

public class Concesionario {

    // ATRIBUTOS
    private String name;
    private ArrayList<Coche> coches = new ArrayList<>();

    // CONSTRUCTORES
    public Concesionario(String name) {
        this.name = name;
    }

    // GETTERS & SETTERS
    public ArrayList<Coche> getCoches() {
        return coches;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // MÉTODOS DE COMPORTAMIENTO. FUNCIONALIDADES
    public void addCoche(Coche coche){
        coches.add(coche);

    }

    public void removeCoche(Coche coche){
        coches.remove(coche);
    }

    public int getCantidadCoches(){
        return coches.size();
    }



}
