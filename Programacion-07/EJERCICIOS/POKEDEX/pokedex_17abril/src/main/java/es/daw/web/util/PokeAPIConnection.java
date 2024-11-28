package es.daw.web.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PokeAPIConnection {

    /**
     * Método para conectar a una URL y guardar el Json devuelto en el filesystem
     * @param nombre Nombre del pokemon
     * @param pathJson ruta al json
     * @param urlString dirección web
     * @throws IOException 
     */
    public static void connect(String nombre, String pathJsonString, String urlString) throws IOException{

        urlString += nombre; //url completa

        System.out.println("[PokeAPIConnection] urlString: "+urlString);

        URL url = new URL(urlString);

        // Por temas de seguridad en la conexión...
        System.setProperty("https.protocols", "TLSv1.2");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept","application/json");


        Path pathJson = Paths.get(pathJsonString);

        // BufferedReader reader = null;
        // try{
        //     reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));;
        //     BufferedWriter writer = Files.newBufferedWriter(pathJson, Charset.forName("UTF-8"), StandardOpenOption.CREATE);
        // }finally{
        //     if (reader != null)
        //         reader.close();
        // }

        try(
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            BufferedWriter writer = Files.newBufferedWriter(pathJson, Charset.forName("UTF-8"), StandardOpenOption.CREATE);
        ){
            String linea;
            while ( (linea = reader.readLine() ) != null){
                writer.write(linea);
                writer.newLine();
            }
        }







    }
}
