package es.daw;

import java.util.Scanner;

import es.daw.model.Pokemon;
import es.daw.model.combatePokemon;
import es.daw.utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {       
        Pokemon pokemon1 = new Pokemon("Spoink", "Sebo", "tercera", "Psíquico", 40, 2, 3, 325);
        Pokemon pokemon2 = new Pokemon("Froakie", "Torrente", "sexta", "Agua", 35, 4, 3, 656);

        Utils.mostrarIntro();
        Utils.presentarPokemon(pokemon1);
        Thread.sleep(3000);
        Utils.presentarPokemon(pokemon2);
        Thread.sleep(3000);
        Utils.elegirPokemon(pokemon1, pokemon2);

        combatePokemon.realizarCombate(pokemon1, pokemon2);
    }
}
