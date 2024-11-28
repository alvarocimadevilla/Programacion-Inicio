# Ejercicios para reforzar conceptos de la unidad

## Ejercicio 1
Muestra todos los archivos de una carpeta junto con su tamaño. Métodos relevantes: isDirectory, listFiles, isFile, getName, length (en bytes).

## Ejercicio 2
Lista todos los archivos de un árbol de directorios tiene que entrar en tantas carpetas como tenga el árbol (similar a lo que hace el comando tree en linux).

## Ejercicio 3
Explora la clase File en el API de Java e identifica diferentes excepciones generadas por algunos de sus métodos.

## Ejercicio 4
Busca en la API de Java información sobre java.nio y familiarízate con algunas de las diferencias que tiene esta librería sobre java.io.

## Ejercicio 5
Investiga cómo puedes hacer que cada vez que se ejecute el fragmento de código que genera el archivo numeros.txt, en lugar de borrar el contenido anterior, se añaden 10 números nuevos sin borrar los anteriores.

## Ejercicio 6
Crea un programa que escriba 10 número aleatorios en datos1.txt, y luego otros 10 números aleatorios en datos2.txt, finalmente debe escribir en datosSumados.txt la suma de cada una de las líneas de datos1 y datos 2. No debes almacenar los números aleatorios en ninguna variable, debes leerlos de los ficheros para realizar la suma. Ejemplo de ejecución:

datos1.txt:

1

2

4


datos2.txt:

4

6

7


datosSumados.txt:

5

8

11

## Ejercicio 7
Crea un programa que escriba cinco números aleatorios del 1 al 9 en cada línea, luego lea todos los números del archivo y añada a cada línea el valor de los números sumados hasta dicha línea. No debes crear variables intermedias que guarden los números, debes escribir el archivo y después leer y escribir el archivo de nuevo. Ejemplo de ejecución, contenido del archivo:

3 (suma:3)

5 (suma:8)

2 (suma:10)

7 (suma:17)

1 (suma:18)

## Ejercicio 8
Enlace a El Quijote de Cervantes en Gutenberg library:

https://www.gutenberg.org/cache/epub/2000/pg2000.txt

Realiza una lista de las 100 palabras más repetidas en el libro. Para contar las palabras usa la colección o colecciones óptimas y optimiza la lectura del fichero.

Nota: Puedes suponer que las palabras junto a signos de puntuación o acentos son diferentes, por ejemplo, que y ¿que pueden ser palabras diferentes, como y cómo pueden ser diferentes.

## Ejercicio 9
Crea un archivo binario con la información de 50 Pokémon, de forma aleatoria. 

Ten en cuenta que la información que debes almacenar es: Número de Pokémon (ten en cuenta que en la actualidad hay 1025 Pokemon, desde 1-Bulbasaur hasta 1025-Pecharunt), el género, y las siguientes estadísticas (hp, ataque, defensa, ataque especial, defensa especial y velocidad).

Teniendo en cuenta que las estadísticas pueden tomar valores del 20 al 260, usa los tipos de datos que minimicen el tamaño del fichero.

Luego lee el contenido del fichero y vuelta los datos a un fichero en formato texto con la información de la siguiente forma para cada Pokémon:

```
***********************************************

* Número: 123                                 *

* Género: Hembra                              *

* Estadísticas:                               *

*   HP           (054) [----                ] *

*   Ataque       (189) [---------------     ] *

*   Defensa      (085) [-------             ] *

*   Ataque esp.  (154) [------------        ] *

*   Defensa esp. (214) [-----------------   ] *

*   Velocidad    (078) [------              ] *

***********************************************
```

Entre corchetes deben aparecer guiones proporcionalmente al valor de las estadística, si el valor fuese 260 tendría los 20 guiones, y si el valor es 20 tendría un guión.

## Ejercicio 10
Crea una programa que permita generar ficheros binarios con mensajes cifrados. 

Para cifrar los mensajes usaremos el siguiente algoritmo:

Generamos números (short) pseudoaleatorios mediante la clase Random y una semilla (sobrecarga del constructor de Random).

Cada char de nuestra cadena de texto sin cifrar se suma al número aleatorio y se guarda en el fichero con formato int.

Para decodificar se leen los datos como int y se restan los números aleatorios de la semilla, y se transforma en char.

Crea un programa que pueda codificar mensajes y otro que pueda leerlos, pero solo funcionará si ambos conocen la semilla.
