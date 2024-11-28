# EJERCICIO: Plagio del Quijote

![image](https://user-images.githubusercontent.com/91023374/227521280-3fba8c8a-3ec9-4876-b645-bb2fda337fef.png)


- Este programa se encarga de copiar unos párrafos del primer capítulo del Quijote. 

- Vamos a partir de los fuentes iniciales proporcionados (de una aplicación de consola) y convertirlos a una aplicación Web (como hemos aprendido en clase)

- El objetivo es trabajar con:
    - La interface Path https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/nio/file/Path.html
    - La clase Paths https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/nio/file/Paths.html
    - La clasea Files https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/nio/file/Files.html
    - Diferentes clases de los paquetes java.io y java.nio aprendiendo diferentes formas de crear y leer ficheros.

  
- En la carpeta de usuario del sistema se creará un directorio llamado QUIJOTE. Para ello en Java se utiliza
```
System.getProperty("user.home")
```

- Debes copiar dicho contenido 

         de: $user.home/QUIJOTE/original/quijote.txt

         a: $user.home/QUIJOTEcopia/quijote_copia.txt

- Si el fichero original no existe se creará con el contenido.
```
String texto = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. \n"
                + "Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lentejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. \n"
                + "El resto della concluían sayo de velarte, calzas de velludo para las fiestas con sus pantuflos de lo mismo, los días de entre semana se honraba con su vellori de lo más fino.\n";
```

- Al final del fichero copia se va a añadir la frase 'ESTA ES UNA COPIA PERMITIDA DEL QUIJOTE'.

___

**Como resultado final debes obtener en el directorio copia un fichero llamado quijote_copia.txt con el siguiente contenido:**

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/eb801a2e-02d9-44b4-8ea9-1172645eefe2)


___
## Proyecto Web

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/a57a7d18-013f-4877-bf3d-7a3d892a27e9)

___

### Página JSP de inicio
![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/e44729a1-373b-4264-8d3b-926cc258e007)

```
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>PLAGIO QUIJOTE</title>
    </head>
    <body>
        <h1>VAMOS A PLAGIAR EL QUIJOTE</h1>
        <br/>
        <a href="PlagioQuijoteServlet">Plagiar Quijote</a>
    </body>
</html>
```
___

### Página HTML resultado

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/51ff678c-b95b-4a8f-a43c-415455f80fc6)

```
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1> QUIJOTE CON COPYRIGHT </h1>");
            out.println("<section style='border:1px solid black'> "+QuijoteUtils.getContenidoHTMLCopiaQuijote(pathCompletoCopia)+" </section>");
            out.println("</body></html>");
        }
```


