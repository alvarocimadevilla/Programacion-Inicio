/*
 * Copyright 2020 Diego Silva <diego.silva at apuntesdejava.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
import java.io.FileReader;


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
                    if (!palabra.isEmpty()){
                        cuentaPalabrasMap.put(palabra,Utils.incrementaCuentaPalabra(cuentaPalabrasMap,palabra));
                        //cuentaPalabrasMap.put(palabra, cuentaPalabrasMap.getOrDefault(palabra, 0) + 1);
                    }
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Map.Entry<String, Integer>> listaPalabras = new ArrayList<>(cuentaPalabrasMap.entrySet());

        listaPalabras.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Mostrar las 100 palabras más repetidas
        int contador = 0;
        for (Map.Entry<String, Integer> entrada : listaPalabras) {
            if (contador < 100) {
                System.out.println(entrada.getKey() + ": " + entrada.getValue());
                message += "<p>"+entrada.getKey() + ": " + entrada.getValue()+"</p>";
                contador++;
            } else {
                break;
            }
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