/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.poo2.model;

/**
 *
 * @author alumnot
 */
public class Audio implements Validable{
    
    private String titulo;
    
    public Audio(String titulo){
        this.titulo = titulo;
    }
    
    @Override
    public void validar(){
        System.out.println("El fichero de audio con nombre '" + titulo + "' ha sido validado");
    }
}
