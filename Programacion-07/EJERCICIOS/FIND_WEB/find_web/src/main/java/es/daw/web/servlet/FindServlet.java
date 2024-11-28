package es.daw.web.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
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
            estructura = Utils.mostrarCarpeta(directorioInicial);
        }
        

        //------------------------------------------
        response.setContentType("text/html");

        try(PrintWriter out = response.getWriter()){
            out.println("<html><body>");
            if (tipo.equals("buscar")){
                out.println("<h1> RESULTADO DEL LA BÚSQUEDA DEL ARCHIVO "+nombreArchivoBuscado+"</h1>");
            }else if (tipo.equals("mostrar")){
                out.println("<h1> ESTRUCTURA</h1>");
                out.println("<p>"+estructura+"</p>");
            }
            out.println("<p>"+mensaje+"</p>");
            out.println("</body></html>");
        }
    }

    @Override
    public void destroy() {
    }
}