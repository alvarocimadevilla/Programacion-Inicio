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

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import es.daw.web.model.Pokemon;
import es.daw.web.util.PokeAPIConnection;


@WebServlet(name = "GetPokemonServlet", value = "/GetPokemonServlet")
public class GetPokemonServlet extends HttpServlet {

    @Override
    public void init() {
    }

    // MEJORAS PENDIENTES!!!!
    // CONTROLAR EL BACK
    // QUITAR LA EXCEPCIÓN IOEXCEPTION DEL DOGET

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        System.out.println("************** INIT GETPOKEMONSERVLET ****************");
		// -----------------------------------
		// 1. LEER DATOS DEL REQUEST 
		// Leo el  nombre del pokemon del formulario
		// Parámetro de tipo input text
        String nombre = request.getParameter("nombrePokemon");
        nombre = nombre.trim();

        // Si no se envía nada, por defecto devuelve siempre Pikachu
        if (nombre.equals(""))
            nombre = "Pikachu";

        // Paso a minúsculas (requisito del API REST)
        nombre = nombre.toLowerCase();

        System.out.println("Nombre: "+nombre);

        // Parámetro de tipo input radioButton
        String tipo = request.getParameter("tipo");

        System.out.println("Tipo: "+tipo);

		// -----------------------------------		
		// 2. Creo la ruta donde se va a guardar el json del pokemon
        // Guardarlo en el proyecto web de Tomcat
        String pathJson = getServletContext().getRealPath("/")+nombre+".json";
        System.out.println("pathJson: "+pathJson);

        // 3. Creamos el JSON
        PokeAPIConnection.connect(nombre, pathJson, "https://pokeapi.co/api/v2/pokemon/");

        // 4. Convertimos el JSON del pokemon en un objeto (serializar)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Pokemon pokemon = null;
        
        // Vamos a usar try... con recursos para que se cierren las clases
        try(FileReader reader = new FileReader(pathJson)){
             pokemon = gson.fromJson(reader,Pokemon.class);

             System.out.println("[[[ POKEMON ]]]: "+pokemon);
        }


        // PENDIENTE CAMBIAR!!! por ahora siempre frontal
        String urlImg = pokemon.getSprites().getFront_default();

        // PENDIENTE!!!
        boolean error = false;
        // -----------------------------------		
		// 5. RESPUESTA (response)
		
		// El response devuelve texto
		//response.getWriter().append("FUNCIONANDO!!!! EL JSON SE HA CREADO EN "+pathJson);

        // -----------------------------------		
		
		// El response va a devolver una página html

        response.setContentType("text/html");

        try ( PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CON ARGUMENTO </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<main style='text-align:center'>");
            out.println("<h1>INFORMACIÓN DEL POKEMON</h1>");
            if (error) {
            	out.println("<h2>ERROR</h2>");
            	out.println("<p style='color:red'>Ha habido problemas a la hora de cargar el Pokemon!!!!</p>");
            }
            else {

                if (tipo.equals("info")) {
                    out.println("<h2>Información del pokemon "+nombre+"</h2>");
                    out.println("<table style='margin: 0 auto' border='1'>"
                            + "<tr><th>Imagen</th><th>Nombre</th><th>Id</th><th>Altura</th></tr>"
                            + "<tr><th><img src='"+urlImg+"'/></th><th>"+pokemon.getName()+"</th><th>"+pokemon.getId()+"</th><th>"+pokemon.getHeight()+"</th></tr>"
                            + "</table>");
                    
                }else {
                    out.println("<h2>Imagen "+tipo+" del pokemon "+nombre+"</h2>");
                    out.println("<img src='"+urlImg+"'/>");
                }
            }
        }


        //     out.println("</main>");
        //     out.println("</body>");
        //     out.println("</html>");
        // }		


        

        // ------------------- JSP ------------------------

        // request.setAttribute("imagen", "<img src='"+urlImg+"'/>");
        // request.setAttribute("nombre", pokemon.getName());
        // request.setAttribute("id", pokemon.getId());
        // request.setAttribute("altura", pokemon.getHeight());

        
        // // Forma de devolver y procesar una página jsp
        // getServletContext().getRequestDispatcher("/pokemon.jsp").forward(request, response);
        //----------------------------------------------

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request, response);
    }


    @Override
    public void destroy() {
    }
}