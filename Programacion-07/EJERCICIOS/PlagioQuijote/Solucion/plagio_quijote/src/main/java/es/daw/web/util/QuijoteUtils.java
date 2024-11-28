package es.daw.web.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class QuijoteUtils {

    private final static String COPYRIGHT = "'ESTA ES UNA COPIA PERMITIDA DEL QUIJOTE'";
  
    /**
     * 
     * @param pathOriginal
     * @param pathCopia
     * @throws IOException 
     */
    public static void copiarQuijote(Path pathOriginal, Path pathCopia) throws IOException {
        
        // Si el fichero original no existe se crea uno
        if (Files.notExists(pathOriginal)){
            System.out.println("[ERROR] El fichero original del Quijote no exite en: "+pathOriginal);

            crearQuijoteOriginal(pathOriginal);
        }
        else{
            // Si el fichero copia existe se borra

            // Compruebo si existe el directio ..../copia
            if(Files.notExists(pathCopia.getParent())){
                // Si el directorio "copia" no exite lo creo
                Files.createDirectory(pathCopia.getParent());
                Files.createFile(pathCopia);
            }else{
                // Si existe el fichero ..../copia/quijote_copia.txt lo borro
                Files.delete(pathCopia); // se ha creado el fichero donde copiar vacío
            }
            

            // Realizar la copia del contenido con Buffered
            //BufferedWriter bw = new BufferedWriter(new FileWriter("copia"+File.separator+"quijote_plagio.txt"));

            try(BufferedWriter bw = Files.newBufferedWriter(pathCopia, Charset.forName("UTF-8"), StandardOpenOption.CREATE);
                BufferedReader br = Files.newBufferedReader(pathOriginal)
            ){
                // CON DO ... WHILE
                // String linea = br.readLine();
                // do{
                //     bw.write(linea);
                //     bw.newLine();
                //     linea = br.readLine();
                // }while(linea != null);

                // CON WHILE
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    bw.write(linea);
                    bw.newLine();
                }
    

            }
        }
    }

    
    /**
     * Si el fichero original no existe se crea uno
     * @param pathOriginal
     * @throws IOException 
     */
    public static void crearQuijoteOriginal(Path pathOriginal) throws IOException {

        List<String> quijote = Arrays.asList(new String[]{"En un lugar de la Mancha,",
            "de cuyo nombre no quiero acordarme,", "no ha mucho tiempo que vivía un hidalgo",
            "de los de lanza en astillero,", "adarga antigua, rocín flaco y galgo corredor."});

        String texto = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. \n"
                + "Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lentejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. \n"
                + "El resto della concluían sayo de velarte, calzas de velludo para las fiestas con sus pantuflos de lo mismo, los días de entre semana se honraba con su vellori de lo más fino.\n";

        // Si no existe el diretorio padre tengo que crearlo
        if (Files.notExists(pathOriginal.getParent())){
            //Crea todos los directorios y subdirectorios a la vez sin necesidad de ir de uno en uno
            Files.createDirectories(pathOriginal.getParent());
        }

        // try(BufferedWriter bw = Files.newBufferedWriter(pathOriginal,Charset.forName("UTF-8"))){
        //     bw.write(texto); // escribe una cadena de caracteres
        //     bw.newLine(); // escribe un carácter de nueva línea
        // }

        try(BufferedWriter bw = Files.newBufferedWriter(pathOriginal,Charset.forName("UTF-8"))){
            for(String linea: quijote){
                bw.write(linea);
                bw.newLine();
            }
        }


    }

    /**
     * Método para añadir al final del fichero de texto la frase copyrigth
     *
     * @param copyright
     * @param destino
     * @throws IOException
     */
    public static void addCopyRight(Path destino) throws IOException {

        Files.write(destino,COPYRIGHT.getBytes(),StandardOpenOption.APPEND);

        // --------------------------------------------
        // A CONTINUACIÓN HAY CÓDIGO DE DIFERENTES FORMAS DE REALIZAR LO MISMO:
        // AÑADIR UNA CADENA DE CARACTERES AL FINAL DEL FICHERO
        // --------------------------------------------

        // FORMA O: sin clase Files!!!!!!!!!
        /*
        // Se crea una BufferedWriter a partir de un FileWriter porque vamos a trabajar con un archivo existente
        // Se pueden crear Bufferes de otro flujos partiendo de InputStreamReader...
        // Con Buffered almacenamos temporalmente en memoria
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("copia"+File.separator+"quijote_copia.txt",true))){
            bw.append(copyright);
            bw.newLine(); //salto de línea
        }
        
         */
    	
        // FORMA 1: Creando BufferedWriter con java.nio.Files
        /*try(BufferedWriter bw = Files.newBufferedWriter(destino, 
                Charset.forName("UTF-8"),StandardOpenOption.APPEND)){
            bw.write(copyright);
        }*/
    	
        // FORMA 2: Con FileWriter
        // Usando directamente FileWriter escribimos directamente en el archivo (abriendo y cerrando) sin almacenamiento 
        // temporal en memoria.
        // `true` agregará los nuevos datos
        /*try(FileWriter fw = new FileWriter("copia"+File.separator+"quijote_copia.txt", true))
        {
            fw.write(copyright);
        } */


    }

    /**
     * Método que pinta por consola el contenido del fichero pasado como
     * argumento
     *
     * @param destino
     * @throws IOException
     */
    public static void printCopiaQuijote(Path destino) throws IOException {
        System.out.println("*********** CONTENIDO DEL PLAGIO DEL QUIJOTE ***********");

        List<String> lineas = Files.readAllLines(destino);
        //lineas.forEach(System.out::println);

        for (String linea : lineas) {
            System.out.println(linea);
        }
        
        // OTRA FORMA: Con Files.newBufferedReader
        /*try ( BufferedReader br = Files.newBufferedReader(destino)) {
            String linea = null;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }*/


        System.out.println("********************************************************");

    }

    /**
     * Devuelve una cadena de texto con todos los párrafos en formato html 
     * @param destino
     * @return
     * @throws IOException
     */
    public static String getContenidoHTMLCopiaQuijote(Path destino) throws IOException{

        StringBuilder sb = new StringBuilder();

        List<String> lineas = Files.readAllLines(destino);

        for (String linea : lineas) {
            sb.append("<p>"+linea+"</p>");
        }

        return sb.toString();

    }

}
