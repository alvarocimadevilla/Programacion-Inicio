/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.poo2;

import es.daw.poo2.model.*;

/**
 *
 * @author alumnot
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DocumentoPDF doc1= new DocumentoPDF("introduccion a java",true);
        DocumentoWord doc2 = new DocumentoWord("typescript conceptos fundamentales","word2010");
        Video video = new Video("video.webm");
        Audio audio = new Audio("musica.mp3");
        
        ServicioValidacion sc= new ServicioValidacion();
        sc.addDocumento(doc1);
        sc.addDocumento(video);
        sc.addDocumento(audio);
        sc.addDocumento(doc2);
 
        sc.validar();
    }
    
}
