import java.util.ArrayList;

import model.Cubo;
import model.MATERIAL;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, MineCraft!");

        Cubo madera = new Cubo(MATERIAL.MADERA,"n1");
        Cubo hierro = new Cubo(MATERIAL.HIERRO,"n2");
        Cubo hielo = new Cubo(MATERIAL.HIELO,"n3");

        ArrayList<Cubo> cubos = new ArrayList<>();
        cubos.add(madera);
        cubos.add(hierro);
        cubos.add(hielo);


        // -----------------
        Cubo madera1 = new Cubo(MATERIAL.MADERA);

        if (madera.equals(madera1))
            System.out.println("son iguales");
        else    
            System.out.println("Son diferentes");

        // --------------
        if (cubos.contains(madera1))
            System.out.println("Está el cubo madera!!!");
        else
            System.out.println("No está el cubo madera!!!!");

        // ------------- obtener puntos
        for (Cubo cubo : cubos) {
            
            System.out.println(cubo.getMaterial().getPuntos());
            
        }


    }
}
