# AGENDA WEB

Vas a implementar una **Agenda de Teléfonos Web.**

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/28b02eeb-37d5-40dc-a6f2-875ec3217142)

## PASOS INICIALES:

1. Monta el proyecto en Visual Studio Code.
2. Genera con Maven el archivo WAR.
3. Haz “Add Deployment” en Tomcat.
4. Muéstralo en el navegador (Server Actions/Show in browser).
5. Obtendrás la siguiente página de inicio:

Completa el proyecto en base a las siguientes especificaciones. 

Revisa el código proporcionado en **AgendaServlet** y en el paquete util está la clase **UtilAgenda** donde implementar los métodos auxiliares que consideres.

## 1. Cargar datos del CSV

En el directorio webapp del proyecto hay un archivo llamado contactos.csv.

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/196eb2e5-0999-4bd6-87c6-607fd3f0d86d)

El contenido de dicho archivo es el siguiente:

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/7728e0a3-80ea-4814-90ea-124a4963bf58)

Observa que el archivo CSV contiene:
- Una primera línea que debes ignorar (es informativa)
- Por cada línea:
  - Un número de teléfono.
  - Información para dar de alta a los diferentes contactos.

La clase **Contacto** se proporciona en la carpeta model y no es necesario realizar ninguna modificación en ella.

Cuando el usuario seleccione la opción 1 y haga clic en Ejecutar, deberá mostrarse la siguiente información:

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/ec109c1a-1776-42c0-92b0-fb2526a34e6b)

Para ello, previamente debes:

- Guardar la información del CSV en la colección de datos Map que tienes está declarada de forma global en AgendaServlet: ```private static Map<String, Contacto> agenda = null; ```
  Por tanto, debes leer el fichero de texto CSV y cargar de forma apropiada el Map (la agenda). Ayuda: una cadena de texto se convierte a LocalDate con el método LocalDate.parse(cadena)
- Después, debes recorrer el Map para obtener un String con la información tal y como se muestra en la captura.
  - Ese String (variable message) tendrá por cada elemento del Map un <p>. Por ejemplo: ``` <p>954000002 - Contacto [nombre=Juan, apellidos=Martínez, fechaAlta=1991-02-03]</p><p>954000003 - Contacto [nombre=Ana, apellidos=Ramírez, fechaAlta=1992-03-04]</p><p>954000001 - Contacto [nombre=Pepe, apellidos=Perez, fechaAlta=1990-01-02]</p><p>954000004 - Contacto [nombre=María, apellidos=López, fechaAlta=1993-04-05]</p> ```
  - Además, la variable message será lo que el Servlet devolverá a través del PrintWriter. Observa el código proporcionado.

## 2. Buscar contacto por teléfono

Si el usuario elige esta opción, debe seleccionar de la lista el teléfono a buscar en la agenda para obtener la información de contacto.

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/ab886f5a-88c7-4493-9c6a-87fa1cf6437f)

Observa que están todos los teléfonos de los contactos cargados a través del CSV, menos el último que no existe en la agenda.

Por ejemplo, si selecciona el teléfono 954000003, se obtendrá la información del contacto asociado:

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/3522d1f9-f94c-4192-9444-f086004d7144)

En el caso de que se seleccione el teléfono que no existe en la agenda, 666666666, se mostrará el siguiente mensaje de error:

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/12ffd13a-03f0-49aa-8385-33818be99c92)

Ese mensaje se obtiene de un objeto **Exception** creado con dicho mensaje, por tanto debes realizar de forma correcta:
- la propagación de la excepción
- la captura de dicha excepción
- cargar el mensaje de error en la variable messageError proporcionada en el Servlet.

## 3. Ver contenido de la agenda ordenada

Si el usuario elige esta opción, se mostrarán todos los contactos de la agenda ordenados de forma natural:

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/90f01e24-4752-4178-9082-8f23a327253e)












