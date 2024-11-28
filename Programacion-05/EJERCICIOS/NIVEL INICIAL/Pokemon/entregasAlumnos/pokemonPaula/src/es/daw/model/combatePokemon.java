package es.daw.model;

import java.util.Random;

public class combatePokemon {

    public static void realizarCombate(Pokemon atacante, Pokemon defensor) {
        System.out.println("¡Comienza el combate!");
        System.out.println(atacante.getNombre()+" ataca primero.");

        Random dmgAleatorio = new Random();
        while (atacante.getPs() > 0 && defensor.getPs() > 0) {
            int dmgAtacante = dmgAleatorio.nextInt(25) + 1;

            defensor.setPs(defensor.getPs() - dmgAtacante);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(atacante.getNombre()+" ha hecho "+dmgAtacante+" puntos de daño a "+defensor.getNombre());

            if (defensor.getPs() <= 0) {
                System.out.println(defensor.getNombre()+" se ha debilitado.");
                break;
            }

            int dmgDefensor = dmgAleatorio.nextInt(25) + 1;
           
            atacante.setPs(atacante.getPs() - dmgDefensor);

            System.out.println(defensor.getNombre()+" contraataca y hace "+dmgDefensor+" puntos de daño a "+atacante.getNombre());

            if (atacante.getPs() <= 0) {
                System.out.println(atacante.getNombre()+" se ha debilitado.");
                break;
            }
        }

        if (atacante.getPs() <= 0) {
            System.out.println("¡"+defensor.getNombre() + " ha ganado el combate!");
        } else {
            System.out.println("¡"+atacante.getNombre() + " ha ganado el combate!");
        }
    }
}
