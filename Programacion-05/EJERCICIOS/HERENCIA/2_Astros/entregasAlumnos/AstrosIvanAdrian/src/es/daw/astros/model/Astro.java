/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.astros.model;

import java.util.Objects;

/**
 *
 * @author alumnot
 */
public class Astro {
    
    private String nombre;
    private double radio;
    private double rotacionEje;
    private double masaCuerpo;
    private double tempMedia;
    private double gravedad;
    
    public Astro(String nombre, double radio, double rotacionEje, double masaCuerpo, double tempMedia, double gravedad) {
        this.nombre = nombre;
        this.radio = radio;
        this.rotacionEje = rotacionEje;
        this.masaCuerpo = masaCuerpo;
        this.tempMedia = tempMedia;
        this.gravedad = gravedad;
    }

    @Override
    public String toString() {
        return "nombre = "+nombre+"\n"+
               "radio = "+radio+"\n" +
               "rotacionEje = "+rotacionEje+"\n" +
               "masaCuerpo = "+masaCuerpo+"\n" +
               "tempMedia = "+tempMedia+"\n" +
               "gravedad = " + gravedad;
    }
           
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRotacionEje() {
        return rotacionEje;
    }

    public void setRotacionEje(double rotacionEje) {
        this.rotacionEje = rotacionEje;
    }

    public double getMasaCuerpo() {
        return masaCuerpo;
    }

    public void setMasaCuerpo(double masaCuerpo) {
        this.masaCuerpo = masaCuerpo;
    }

    public double getTempMedia() {
        return tempMedia;
    }

    public void setTempMedia(double tempMedia) {
        this.tempMedia = tempMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
    
    
}

