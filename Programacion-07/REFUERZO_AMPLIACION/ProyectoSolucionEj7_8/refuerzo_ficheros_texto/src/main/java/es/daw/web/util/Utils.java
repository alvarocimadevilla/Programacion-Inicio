package es.daw.web.util;

import java.util.Map;

public class Utils {
    
    public static Integer incrementaCuentaPalabra(Map<String, Integer> mapa, String palabra){
        
        if (mapa.containsKey(palabra)){
            Integer contador = mapa.get(palabra);
            contador++;
            mapa.put(palabra, contador);
            return contador;
        }
        else{
            mapa.put(palabra, 1);
            return 1;
        }

        //return mapa.compute(palabra, (key, value) -> (value == null) ? 1 : value + 1);
    }
}
