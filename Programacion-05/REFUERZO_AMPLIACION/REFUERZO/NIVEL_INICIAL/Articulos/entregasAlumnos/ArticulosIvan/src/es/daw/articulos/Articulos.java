
package es.daw.articulos;

import es.daw.articulos.Model.Articulo;

public class Articulos {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Articulo cereales = new Articulo("Cereales", 2.50f, 5);
        Articulo toallitas = new Articulo("Toallitas", 5, 20);
        Articulo zapatillas = new Articulo("Zapatillas", 80, 2);
        
        
        System.out.println(cereales.toString());
        System.out.println(toallitas.toString());
        System.out.println(zapatillas.toString());
        
    }
    
}
