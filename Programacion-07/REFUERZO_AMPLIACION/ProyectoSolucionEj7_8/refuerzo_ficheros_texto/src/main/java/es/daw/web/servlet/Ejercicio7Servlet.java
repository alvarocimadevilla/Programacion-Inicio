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
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import es.daw.web.util.Utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

@WebServlet(name = "Ejercicio7Servlet", value = "/Ejercicio7Servlet")
public class Ejercicio7Servlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Path pathDirectory = Paths.get(System.getProperty("user.home"), "ALEATORIOS");
        Path pathFile = pathDirectory.resolve("numeros.txt");
        if (Files.notExists(pathDirectory)){
            Files.createDirectories(pathDirectory);
            Files.createFile(pathFile);
        }


        Path pathFileActualizados = pathDirectory.resolve("numerosActualizados.txt");
        if (Files.notExists(pathFileActualizados))
            Files.createFile(pathFileActualizados);

        // PENDIENTE PASARLO A UN MÉTODO DE UTILIDADES
        // PENDIENTE REALIZAR LAS MEJORAS OPORTUNAS EN EL CÓDIGO... SE ESTÁN CERRANDO LOS FLUJOS??? CÓMO OBTENDRÍA UN BUFFER DE LA CLASE FILES
        // Generar y escribir números aleatorios en el archivo
        try {
            FileWriter writer = new FileWriter(pathFile.toString());
            BufferedWriter buffer = new BufferedWriter(writer);
            Random random = new Random();

            for (int j = 0; j < 5; j++) {
                buffer.write(String.valueOf(random.nextInt(9) + 1));
                buffer.write("\n");
            }

            buffer.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // PENDIENTE PASARLO A UN MÉTODO DE UTILIDADES
        // PENDIENTE REALIZAR LAS MEJORAS OPORTUNAS EN EL CÓDIGO... SE ESTÁN CERRANDO LOS FLUJOS???
        // Leer y actualizar el archivo con la suma acumulada
        try {
            FileReader reader = new FileReader(pathFile.toString());
            BufferedReader buffer = new BufferedReader(reader);
            FileWriter writer = new FileWriter(pathFileActualizados.toString());
            BufferedWriter writerBuffer = new BufferedWriter(writer);

            String linea;
            int sumaAcumulada = 0;
            while ((linea = buffer.readLine()) != null) {
                int num = Integer.parseInt(linea.trim());
                sumaAcumulada += num;
                writerBuffer.write(num+" (suma: "+sumaAcumulada+")");
                writerBuffer.newLine();
            }

            buffer.close();
            writerBuffer.close();
            reader.close();
            writer.close();

            // Renombrar el archivo actualizado al nombre original
            Files.move(pathFileActualizados,pathFile,StandardCopyOption.REPLACE_EXISTING);           
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ----------- SALIDA -------------
        response.setContentType("text/html");

        List<String> lineas = Files.readAllLines(pathFile);
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Resultado del ejercicio 7</h1>");
        for (String linea : lineas) {
            out.println("<p>"+linea+"</p>");
        }
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
    }
}