/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.astros.model;

/**
 *
 * @author alumnot
 */
public class Satelite extends Astro{
    
    private double distanciaPlaneta;
    private Planeta planeta;

    public Satelite(String nombre, double radio, double rotacionEje, double masaCuerpo, double tempMedia, double gravedad, double distanciaPlaneta, Planeta planeta) {
        super(nombre, radio, rotacionEje, masaCuerpo, tempMedia, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.planeta = planeta;
        planeta.addSatelite(this);
    }
    
    
    
}
