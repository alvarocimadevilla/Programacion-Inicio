/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.poo2.model;

/**
 *
 * @author alumnot
 */
public class DocumentoPDF extends Documento{
    
    private boolean protegido;
 
    public DocumentoPDF(String titulo, boolean protegido) {
        super(titulo);
        this.protegido = protegido;
    }
    
    public boolean isProtegido() {
        return protegido;
    }
 
    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }
    
    

    @Override
    public void validar() {
        System.out.println("El PDF con titulo '" + getTitulo() + "' ha sido validado");
    }
}
