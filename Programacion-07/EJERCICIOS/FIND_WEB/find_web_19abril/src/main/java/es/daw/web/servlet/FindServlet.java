package es.daw.web.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import es.daw.web.util.Utils;


@WebServlet(name = "FindServlet", value = "/FindServlet")
public class FindServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String mensaje = "";
        String path_encontrado = "";
        String estructura = "";

        String nombreArchivoBuscado = request.getParameter("archivo");
        System.out.println("Nombre del fichero a buscar: "+nombreArchivoBuscado);

        String tipo = request.getParameter("tipo");

        // Monta el path al directorio home del usuario
        Path directorioInicial = Paths.get(System.getProperty("user.home"),"FIND_WEB");
        System.out.println("directorioInicial: "+directorioInicial);

        if(tipo.equals("buscar")){
            try {
                Path archivoEncontrado = Utils.buscarArchivo(directorioInicial, nombreArchivoBuscado);
                if (archivoEncontrado != null) {
                    mensaje = "El archivo '" + nombreArchivoBuscado + "' se encontró en: " + archivoEncontrado;
                } else {
                    mensaje = "El archivo '" + nombreArchivoBuscado + "' no se encontró en el directorio.";
                }
                
            } catch (IOException e) {
                System.err.println("Error al acceder al directorio: " + e.getMessage());
            }
        }
        else if (tipo.equals("mostrar")){
            // ------------------
            // Monto el path relativo al fichero de log
            Path log = Paths.get("FIND_WEB.log");
            // Monto el path completo (junto el directorio inicial y el nombre del fichero)
            // $user.home/FIND_WEB/FIND_WEB.log
            Path pathLogCompleto = directorioInicial.resolve(log);

            // Si existe el fichero lo borro
            if (Files.exists(pathLogCompleto))
                Files.delete(pathLogCompleto);
            // ----
            
            // Lo creo cada vez que se muestre el contenido por si ha habido cambios
            Files.createFile(pathLogCompleto);
    
            // En el String estructura obtengo el nombre de carpetas y ficheros como si de un comando tree se tratara
            estructura = Utils.mostrarCarpeta(directorioInicial);

            // Proceso ese String estructura para quitar las etiquetas html y escribirlo directamente en el fichero de log
            String estructura2File = estructura.replaceAll("<p>", "");
            estructura2File = estructura2File.replaceAll("</p>", "\n");
            Files.write(pathLogCompleto, estructura2File.getBytes());
        }
        

        //------------------------------------------
        response.setContentType("text/html");

        try(PrintWriter out = response.getWriter()){
            out.println("<html><body>");
            if (tipo.equals("buscar")){
                out.println("<h1> RESULTADO DEL LA BÚSQUEDA DEL ARCHIVO "+nombreArchivoBuscado+"</h1>");
            }else if (tipo.equals("mostrar")){
                out.println("<h1> ESTRUCTURA</h1>");
                out.println(estructura);
            }
            out.println("<p>"+mensaje+"</p>");
            out.println("</body></html>");
        }
    }

    @Override
    public void destroy() {
    }
}