/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.ut03ejemplorandom;

/**
 *
 * @author melola
 */
public class UT03EjemploRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ejemplos de random
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
        
        System.out.println("\n* 5 números aleatorios entre 0 y 5");
        // Número aleatorio entre 0 y 5
        for (int i = 0; i < 5; i++) {
            System.out.println((int)(Math.random()*6));
            //System.out.println((int)Math.floor(Math.random()*6));
            
        }
        
        System.out.println("\n* 5 números aleatorios entre 1 y 5");
        // Número aleatorio entre 1 y 5
        for (int i = 0; i < 5; i++) {
            System.out.println((int)(1+ Math.random()*5));
            //System.out.println((int)Math.floor(Math.random()*6));
            
        }
        
        
        
            
        
        
        
        
        
    }
    
}
