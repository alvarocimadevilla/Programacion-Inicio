package es.daw.web.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class Utils {

    // private static String estructura = ""; // Si uso la variable global, se va concatenando por cada vez que ejecuto el servlet

    public static Path buscarArchivo(Path directorio, String nombreArchivo) throws IOException {

        Path archivoEncontrado = null;

        // Pendiente!

        return archivoEncontrado;


    }

    public static String mostrarCarpeta(Path ruta) throws IOException {

        StringBuilder estructura = new StringBuilder();

        // Convierto el path a objeto File para recorrer sus ficheros y de forma recursiva ir mostrando los ficheros y directorios
        File fichero = ruta.toFile();

        // Es necesario que la ruta sea obligatoriamente un directorio
        if (fichero.isDirectory()) {
            File[] lista = fichero.listFiles();
            for (int i = 0; i < lista.length; i++) {
                estructura.append("<p>").append(lista[i].getName()).append("</p>");
                if (lista[i].isDirectory()) {
                    estructura.append(mostrarCarpeta(lista[i].toPath()));
                }
            }
        }
        
        return estructura.toString();

    }
}
