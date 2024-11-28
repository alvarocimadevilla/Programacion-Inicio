<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <style>
            form{
                width: 60%;
                margin: 0px auto;
            }
            h1{
                text-align: center;
            }
            fieldset:last-child{
                text-align: center;
            }
        </style>
    </head>

    <body>

        <h1>Agenda de teléfonos WEB</h1>

        <form action="AgendaServlet">
            <fieldset>
                <p>1. Cargar datos del CSV:<input type="radio" name="opcion" value="cargarCSV" checked/></p>
                <p>2. Buscar contacto por teléfono: <input type="radio" name="opcion" value="buscarContacto" /> 
                <p>
                    Elige el teléfono:
                    <select name="telefono">
                        <option>954000001</option>
                        <option>954000002</option>
                        <option>954000003</option>
                        <option>954000004</option>
                        <option>666666666</option>
                    </select>
                </p>
                <p>3. Ver agenda completa ordenada de forma natural: <input type="radio" name="opcion" value="verAgenda" />
            </fieldset>
            <fieldset>
                <input type="submit" value="Ejecutar" />
            </fieldset>
        </form>

    </body>

    </html>