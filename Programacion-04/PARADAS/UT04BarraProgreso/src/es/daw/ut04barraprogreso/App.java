/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.ut04barraprogreso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melol
 */
public class App {

    public static void main(String[] argv) {
    //public static void main(String[] argv) throws Exception {
        System.out.print("[");
        String data = "";
        for (int x = 0; x < 100; x++) {
            System.out.print("\r["+data+x+"%]");
            data += "=";
            try {
                //data += "┏(-_-)┛";
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("");
    }


}
