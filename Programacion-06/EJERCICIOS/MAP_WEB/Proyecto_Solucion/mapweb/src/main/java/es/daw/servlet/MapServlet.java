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
package es.daw.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import es.daw.util.Utils;


@WebServlet(name = "mapServlet", value = "/map-servlet")
public class MapServlet extends HttpServlet {
    private String message;

    @Override
    public void init() {
        message = "Proyecto Web para trabajar con MAP!!!!!!";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // -------------------------
        // Obtener valores de un parámetro
        //String nombre = request.getParameter("nombre");

        // Obtener toda la información en un MAP
        Map<String,String[]> parametros = request.getParameterMap();

        Utils.printRequestParameters(parametros);

        //------------------------------
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        //out.println("<h1>" + message + "</h1>");
        out.println("<h1>Se han leído los datos del request!!!</h1>");
        //out.println("<p> El nombre recibido es: "+nombre+"</p>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
    }
}