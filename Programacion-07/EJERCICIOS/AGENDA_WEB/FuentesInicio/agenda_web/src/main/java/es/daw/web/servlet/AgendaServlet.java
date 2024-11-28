package es.daw.web.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import es.daw.web.model.Contacto;

@WebServlet(name = "AgendaServlet", value = "/AgendaServlet")
public class AgendaServlet extends HttpServlet {

    private static Map<String, Contacto> agenda = null;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Leer el radiobutton que se ha seleccionado
        // Las diferentes opciones que puede elegir el usuario son: cargarCSV, buscarContacto, verAgenda
        String opcion = request.getParameter("opcion");

        // Lee el input teléfono para la opción de buscarContacto
        String telefono = request.getParameter("telefono");

        // Variables donde cargar los diferentes mensajes a devolver
        String message = "";
        String messageError = "";

        // Inicializamos la agenda solo una vez
		if (agenda == null)
			agenda = new HashMap<>();


        // Creará un objeto Path al archivo contactos.csv que se encuentra en webapp (junto a index.jsp)
        Path pathCSV = Paths.get(getServletContext().getRealPath("/contactos.csv"));
        System.out.println("pathCSV:"+pathCSV);


        // A COMPLETAR!!!!!!!!!!!!
        
        

        // -----------------------------------------------------------------------------------------
        // ---------------------- PÁGINA DEVUELTA AL NAVEGADOR (no es necesario tocar nada)---------
        // -----------------------------------------------------------------------------------------
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Resultado</h1>");
        if (!messageError.equals("")){
            out.println("<p>" + messageError + "</p>");
        }
        else{
            out.println(message);
        }
        out.println("<p><a href='index.jsp'>Volver</a></p>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
    }
}