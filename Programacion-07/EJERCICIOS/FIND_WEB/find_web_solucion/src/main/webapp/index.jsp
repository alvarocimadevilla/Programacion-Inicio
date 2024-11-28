<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Find web</title>
    </head>
    <body>
        <h1>BUSCADOR DE ARCHIVOS</h1>
        <br/>
        <form action="FindServlet" method="get">
            <fieldset>
                <p>
                    Mostrar estructura de carpetas de FIND_WEB: <input type="radio" name="tipo" value="mostrar"/>
                </p>
            </fieldset>
            <fieldset>
                <label id="find">Selecciona el archivo a buscar;</label>
                <select id="find" name="archivo">
                    <option>WALLY.txt</option>
                    <option>NEMO.txt</option>
                    <option>CHENCHO.txt</option>
                    <option>NO_EXISTE.txt</option>
                </select>
                <p>
                    Buscar archivo: <input type="radio" name="tipo" value="buscar"/>
                </p>
                
            </fieldset>
            <fieldset>
                <input type="submit" value="Ejecutar"/>
            </fieldset>
        </form>
    </body>
</html>