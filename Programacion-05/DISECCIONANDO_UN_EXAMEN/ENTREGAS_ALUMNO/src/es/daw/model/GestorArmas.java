package es.daw.model;

import java.util.ArrayList;

public class GestorArmas {
private ArrayList <Arma> armas;

public GestorArmas() {
    armas= new ArrayList<>();
}
    public void addArma(Arma arma){
        armas.add(arma);
    }

    public void removeArma(){
        armas.remove(armas.size()-1);
    }
    @Override
    public String toString() {
        return "GestorArmas [armas=" + armas + "]";
    }
}
