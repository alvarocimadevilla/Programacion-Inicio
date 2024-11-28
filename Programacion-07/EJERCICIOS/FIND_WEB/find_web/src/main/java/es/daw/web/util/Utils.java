package es.daw.web.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Utils {

    private static String estructura = "";

    public static Path buscarArchivo(Path directorio, String nombreArchivo) throws IOException {

        Path archivoEncontrado = null;

        // Pendiente!

        return archivoEncontrado;


    }

    public static String mostrarCarpeta(Path ruta) throws IOException {

        File fichero = ruta.toFile();

        // pendiente

        return estructura;
    }
}
