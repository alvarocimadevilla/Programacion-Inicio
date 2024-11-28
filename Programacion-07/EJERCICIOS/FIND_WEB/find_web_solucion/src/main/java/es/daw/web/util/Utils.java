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
    private static final Path PATH_LOG = Paths.get(System.getProperty("user.home"),"FIND_WEB","FIND_WEB.log");

    public static Path buscarArchivo(Path directorio, String nombreArchivo) throws IOException {

        Path archivoEncontrado = null;

        // OPCIÓN 1: con listFiles de File
        File directorioF = directorio.toFile();

        if (directorioF.isDirectory()) {
            File[] lista = directorioF.listFiles();
            for (File file : lista) {
                if (file.isDirectory()) {
                    Path resultadoRecursion = buscarArchivo(file.toPath(),nombreArchivo);

                    // Si se ha encontrado será distinto de null y parará la recursión
                    // Devolvemos el Path resultadoRecursion y así no continuará en otros subdirectorios
                    if ( resultadoRecursion != null)
                        return resultadoRecursion;
                }
                else if (file.isFile()){
                    System.out.println("file.getName():"+file.getName());
                    System.out.println("nombreArchivo:"+nombreArchivo);
                    if (file.getName().equals(nombreArchivo))
                        return file.toPath();
                }
            }
        }


        // OPCIÓN 2
        // Obtener un flujo de directorio (DirectoryStream) en lugar de listFiles() de File
        // try (DirectoryStream<Path> stream = Files.newDirectoryStream(directorio)) {
        //     for (Path ruta : stream) {
        //         if (Files.isDirectory(ruta)) {
        //             Path resultadoRecursion = buscarArchivo(ruta, nombreArchivo);

        //             // Si se ha encontrado será distinto de null y parará la recursión
        //             // Devolvemos el Path resultadoRecursion y así no continuará en otros subdirectorios
        //             if (resultadoRecursion != null) {
        //                 return resultadoRecursion;
        //             }
        //         } else if (ruta.getFileName().toString().equals(nombreArchivo)) {
        //             return ruta;
        //         }
        //     }
        // }

        // OPCIÓN 3 (Files.walk)
        // Simplemente a nivel informativo. No entra en el examen.
        // archivoEncontrado = Files.walk(directorio)
        // .filter(Files::isRegularFile)
        // .filter(path -> path.getFileName().toString().equals(nombreArchivo))
        // .findFirst()
        // .orElse(null);        


        return null;




    }

    public static String mostrarCarpeta(Path ruta) throws IOException {

        StringBuilder estructura = new StringBuilder();
        estructura.append("<details style='padding:2px 32px;'>");

        // Convierto el path a objeto File para recorrer sus ficheros y de forma recursiva ir mostrando los ficheros y directorios
        File fichero = ruta.toFile();
        estructura.append("<summary><b>").append(fichero.getName()).append("</b></summary>");

        // Es necesario que la ruta sea obligatoriamente un directorio
        if (fichero.isDirectory()) {
            File[] lista = fichero.listFiles();
            for (int i = 0; i < lista.length; i++) {
                Files.write(PATH_LOG, (lista[i].getName() + "\n").getBytes(), StandardOpenOption.APPEND);
                if (lista[i].isDirectory()) {
                    estructura.append(mostrarCarpeta(lista[i].toPath()));
                } else if (lista[i].isFile()){
                    estructura.append("<div style='padding:2px 32px;'>").append(lista[i].getName()).append("</div>");
                }
            }
        }
        
        estructura.append("</details>");

        return estructura.toString();

    }

}
