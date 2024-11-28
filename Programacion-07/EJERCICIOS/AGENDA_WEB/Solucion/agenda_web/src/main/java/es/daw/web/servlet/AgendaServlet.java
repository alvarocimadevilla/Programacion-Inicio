package es.daw.web.servlet;

import jakarta.servlet.ServletContext;
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
import java.util.TreeMap;

import es.daw.web.model.Contacto;
import es.daw.web.util.UtilAgenda;

@WebServlet(name = "AgendaServlet", value = "/AgendaServlet")
public class AgendaServlet extends HttpServlet {

    private static Map<String, Contacto> agenda = null;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Leer el radiobutton que se ha seleccionado
        // Las diferentes opciones que puede elegir el usuario son: cargarCSV, buscarContacto, verAgenda
        String opcion = request.getParameter("opcion");

        String telefono = request.getParameter("telefono");

        String message = "";
        String messageError = "";

		if (agenda == null)
			agenda = new HashMap<>();


        // Creará un objeto Path al archivo contactos.csv que se encuentra en webapp (junto a index.jsp)
        Path pathCSV = Paths.get(getServletContext().getRealPath("/contactos.csv"));
        System.out.println("pathCSV:"+pathCSV);

        switch (opcion) {
            case "cargarCSV":
                try {
                    UtilAgenda.loadCSV(pathCSV,agenda);
                    message = UtilAgenda.agenda2HTML(agenda);
                } catch (IOException e) {
                    messageError = "Pedazo de error al cargar la agenda a partir del CSV!!!!";
                    System.out.println(messageError);
                    e.printStackTrace();
                }
                break;
            case "buscarContacto": {
                
                Contacto contacto;
                try {
                    contacto = UtilAgenda.buscaPersonaPorTelefono(agenda, telefono);
                    message = contacto.toString();
                } catch (Exception e) {
                    messageError = e.getMessage();
                }
                break;
            }
			case "verAgenda":{
                //TreeMap<String,Contacto> agendaOrdenada = UtilAgenda.obtenerAgendaOrdenadaNatural(agenda);
                TreeMap<String,Contacto> agendaOrdenada = new TreeMap<>(agenda);
                message = UtilAgenda.agenda2HTML(agendaOrdenada);
				break;
			}


        }

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