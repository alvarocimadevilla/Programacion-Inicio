/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.astros.model;


import java.util.ArrayList;

/**
 *
 * @author alumnot
 */
public class Planeta extends Astro{
    
    private double distanciaSol;
    private double orbitaSol;
    private ArrayList<Satelite> satelites = new ArrayList<>();

    public Planeta(String nombre, double radio, double rotacionEje, double masaCuerpo, double tempMedia, double gravedad, double distanciaSol, double orbitaSol) {
        super(nombre, radio, rotacionEje, masaCuerpo, tempMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
    }

    @Override
    public String toString() {
        return super.toString()+"\ndistancia al sol = "+distanciaSol+
                                "\norbita = "+orbitaSol; 
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }
    
    public void addSatelite(Satelite satelite){
        satelites.add(satelite);
    }
    
}

