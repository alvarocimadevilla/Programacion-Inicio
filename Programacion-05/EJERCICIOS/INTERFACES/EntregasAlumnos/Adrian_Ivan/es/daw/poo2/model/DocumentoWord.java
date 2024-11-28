/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.poo2.model;

/**
 *
 * @author alumnot
 */
public class DocumentoWord extends Documento{

    private String version;
 
    public String getVersion() {
        return version;
    }
 
    public void setVersion(String version) {
        this.version = version;
    }
 
    public DocumentoWord(String titulo,String version) {
        super(titulo);
        this.version=version;
    }

    @Override
    public void validar() {
        System.out.println("El Word con titulo '" + getTitulo() + "' ha sido validado");
    }
    
    
}
