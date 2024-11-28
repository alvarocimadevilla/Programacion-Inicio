/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.poo2.model;

/**
 *
 * @author alumnot
 */
public abstract class Documento implements Validable{
    
    private String titulo;
 
    public Documento(String titulo) {
        this.titulo = titulo;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
