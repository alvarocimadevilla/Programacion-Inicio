package es.daw.utils;

import java.util.Scanner;

import es.daw.model.Pokemon;

public class Utils {
    

    public static void mostrarIntro(){

        System.out.println("------------------------------------------------------------");
        System.out.println("Bienvenido al combate pokemon, antes de empezar a pelear,\nte presentaremos a los dos candidatos.");
        System.out.println("------------------------------------------------------------");

        System.out.println(" ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void presentarPokemon(Pokemon pok){
        System.out.println("Tenemos a "+pok.getNombre()+", con número de Pokedex "+pok.getNumeroPokedex()+". Es de "+pok.getGeneracion()+" generación.");
        System.out.println("Su habilidad se llama "+pok.getHabilidad()+" y es de tipo "+pok.getTipo()+".\nTiene "+pok.getPs()+" puntos de vida, "+pok.getAtaque()+" puntos de ataque y "+pok.getDefensa()+" puntos de defensa.");
        System.out.println(" ");
    }

    public static void elegirPokemon(Pokemon pokemon1, Pokemon pokemon2){
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige un pokemon, usando el número de la pokedex: ");
        int opcion = sc.nextInt();
        Pokemon pokemonElegido = (opcion == 325) ? pokemon1 : pokemon2;
        System.out.println("¡Has elegido a "+pokemonElegido.getNombre()+"!");
        System.out.println(" ");

    }
}
