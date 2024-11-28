
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.daw.web.util.Utils;

import java.io.BufferedReader;


@WebServlet(name = "Ejercicio8Servlet", value = "/Ejercicio8Servlet")
public class Ejercicio8Servlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String message = "";

        Path pathFile = Paths.get(getServletContext().getRealPath("/pg2000.txt"));

        Map<String, Integer> cuentaPalabrasMap = new HashMap<>();

        try(BufferedReader br = Files.newBufferedReader(pathFile)){
        //try(BufferedReader br = new BufferedReader(new FileReader(pathFile.toString()))){
            String line;
            while ((line = br.readLine()) != null){
                String[] palabras = line.split(" ");

                for (String palabra : palabras) {
                    palabra = palabra.toLowerCase();
                    Utils.incrementaCuentaPalabra(cuentaPalabrasMap,palabra);
                    //cuentaPalabrasMap.put(palabra, cuentaPalabrasMap.getOrDefault(palabra, 0) + 1);
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Map.Entry<String, Integer>> listaPalabras = new ArrayList<>(cuentaPalabrasMap.entrySet());

        // Comparator en orden descendente
        listaPalabras.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Mostrar las 100 palabras más repetidas
        for (int i = 0; i < 10; i++) {
            message += "<p>"+listaPalabras.get(i).getKey() + ": " + listaPalabras.get(i).getValue()+"</p>";
        }

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> 100 palabras más repetidas</h1>");
        out.println(message);
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
    }
}