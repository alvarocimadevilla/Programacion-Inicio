package es.daw.web.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import es.daw.web.util.QuijoteUtils;


@WebServlet(name = "PlagioQuijoteServlet", value = "/PlagioQuijoteServlet")
public class PlagioQuijoteServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // ----------------------------
        // RUTAS A LOS FICHEROS

        Path pathBase = Paths.get(System.getProperty("user.home"),"QUIJOTE");
        //Path pathBase2 = Paths.get(System.getProperty("user.home")+"/QUIJOTE"); //CUTRE
        //Path pathBase3 = Paths.get(System.getProperty("user.home")+File.separator+"QUIJOTE");

        // Ruta al fichero de texto original
        Path pathRelativeOriginal = Paths.get("original", "quijote.txt");
        Path pathCompletoOriginal = pathBase.resolve(pathRelativeOriginal);
        System.out.println("pathCompletoOriginal: "+pathCompletoOriginal);

        // Ruta al fichero de texto donde hacer una copia
        Path pathRelativeCopia = Paths.get("copia", "quijote_copia.txt");
        Path pathCompletoCopia = pathBase.resolve(pathRelativeCopia);
        System.out.println("pathCompletoCopia: "+pathCompletoCopia);

        // ----------------------------
        try {
            QuijoteUtils.copiarQuijote(pathCompletoOriginal, pathCompletoCopia);
            System.out.println("[INFO] Quijote plagiado ...");
            
            QuijoteUtils.addCopyRight(pathCompletoCopia);
            System.out.println("[INFO] Quijote con copyright...");

            QuijoteUtils.printCopiaQuijote(pathCompletoCopia);

        } 
        catch (IOException ex) {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
        }        

        // ----------------------------
        // RESPUESTA!!!
        response.setContentType("text/html");

        try(PrintWriter out = response.getWriter()){
            out.println("<html><body>");
            out.println("<h1> QUIJOTE CON COPYRIGHT </h1>");
            out.println("<section style='border:1px solid black'>"+QuijoteUtils.getContenidoHTMLCopiaQuijote(pathCompletoCopia)+"</section>");
            out.println("</body></html>");
        }
    }

    @Override
    public void destroy() {
    }
}