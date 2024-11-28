package es.daw.util;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Utils {
    
    public static void printRequestParameters(Map<String,String[]> parametros){

        // PRIMERA FORMA: keySet()
        System.out.println("********* keySet() *************");
        System.out.println("\n* PRIMERA FORMA (for):");
        Set<String> keys = parametros.keySet();
        for (String key : keys) {
            String[] value = parametros.get(key);

            System.out.printf("%s %s %n", key, Arrays.toString(value));
        }

        System.out.println("\n* PRIMERA FORMA (forEach + lambda):");
        keys.forEach(key ->{
            System.out.printf("%s %s %n", key, Arrays.toString(parametros.get(key)));
        });

        // SEGUNDA FORMA: entrySet()
        System.out.println("********* entrySet() *************");
        System.out.println("\n* SEGUNDA FORMA (for):");
        for (Entry<String, String[]> entry : parametros.entrySet()) {
            System.out.println("KEY:" + entry.getKey());
            for (String i : entry.getValue()) {
                System.out.println("VALUE:" +i);
            }
        }
        System.out.println("\n* SEGUNDA FORMA (forEach + lambda):");
        parametros.entrySet().forEach(entry ->{
            System.out.println("KEY:" + entry.getKey());
            for (String i : entry.getValue()) {
                System.out.println("VALUE:" +i);
            }
            
        });



    }
}
