/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.poo2.model;

/**
 *
 * @author alumnot
 */
public class Video implements Validable{
    
    private String nombre;

    public Video(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void validar(){
        System.out.println("El video con nombre '" + nombre + "' ha sido validado");
    }
    
}
