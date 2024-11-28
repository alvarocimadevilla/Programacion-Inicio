package es.daw.utils;

import java.util.Random;

public class Utilidades {
    public static int obtenerRandom(int min, int max){
        Random r = new Random();
        return r.nextInt(max-min)+min;
    }
}
