/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.poo2.model;

import java.util.ArrayList;

public class ServicioValidacion {
 
    private ArrayList<Validable>lista= new ArrayList<>();
    
    public ServicioValidacion() {
        // TODO Auto-generated constructor stub
    }
 
    public void addDocumento(Validable d) {
 
        lista.add(d);
 
    }
 
    public void validar() {
 
        for (Validable d :lista) {
 
            d.validar();
        }
    }
 
}
