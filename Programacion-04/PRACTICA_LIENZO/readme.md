# LIENZO DAW
![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/76ef2718-ca48-4b02-8e9f-4ab179eb3fbf)

Partirás de un proyecto java de Netbeans con clases, paquetes y código inicial que deberás completar teniendo en cuenta los siguientes requisitos:

Al iniciar el programa debe aparecer un mensaje de bienvenida en el que deberás poner tu nombre. Pulsando la tecla intro entrarás en la aplicación:

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/5210a9b2-294d-4eb8-8306-7634710a95a2)


Aparecerá el lienzo y un menú de 7 opciones para que el usuario pueda especificar la opción elegida.

- El lienzo es de 26 filas (a…z) y 25 columnas. Usa la función que se te proporciona para pintarlo.
  - El marco del lienzo está rodeado por el carácter @
  - Las coordenadas se indican con la correspondiente fila (letra del abecedario) y columna. Por ejemplo b10
    
     ![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/acb8192f-f504-43dc-8fa8-43dc19e7677b)

  - En el caso de elegir una opción incorrecta (número) del menú, el programa debe insistir y en el caso de no escribir un número el programa debe controlar dicha excepción.
    
    ![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/56ff880d-d144-439d-8f47-e7b58d983f60)

## Opciones del  menú

### 1. OPCIÓN 1 DEL MENÚ: permite seleccionar el tipo de línea y tras esto la coordenada en la que dibujaremos la línea

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/3c2abfd6-ebc7-452e-bc8e-a67f8b554fa0)


### 2. OPCIÓN 2 DEL MENÚ: permite seleccionar el tamaño del lado del cuadrado y la coordenada donde comenzará la esquina izquierda del mismo.
Si el cuadrado completo se sale del panel no se dibujará y se indicará al usuario.
![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/c2f22e8e-fc7b-4896-b455-80c8098c6f55)

### 3. OPCIÓN 3 DEL MENÚ: permite seleccionar el punto en el que se quiere pintar el color:

La pintura se expande siempre que un carácter recién pintado tenga caracteres iguales a él en las direcciones este, oeste, norte o sur.

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/f321882d-d78b-4cf3-8819-6bfcf19721e2)

### 4. OPCIÓN 4 DEL MENÚ: devuelve el lienzo en el estado anterior a la última operación. 
Esta opción se debe poder usar con las últimas 4 operaciones. Es decir, es como hacer un “Deshacer” o “undo” y tiene memoria de las últimas 4 operaciones (historial de 5 contando el lienzo actual).

### 5. OPCIÓN 5 DEL MENÚ: muestra un historial de las 10 últimas operaciones realizadas en el programa.
mostrando siempre la última en la primera posición.

### 6. OPCIÓN 6 DEL MENÚ: limpia por completo todo lo dibujado. Te genera un lienzo nuevo.

### 7. OPCIÓN 7 DEL MENÚ: termina el programa

Cada vez que queramos redibujar el lienzo debe limpiarse su contenido completo y dibujarse de nuevo, causando sensación de que el lienzo está en una posición fija, en lugar de generar contenido secuencialmente en la terminal (este comportamiento solo podremos verlo en la terminal, no en la ventana de salida de NetBeans, pero podremos usarlo para depurar y probar nuestro programa).
