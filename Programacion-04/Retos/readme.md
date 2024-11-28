# RETOS
![image](https://github.com/profeMelola/Programacion-03-2023-24/assets/91023374/31792ba2-4e63-49d6-b91b-0e00f7dd09a6)


Implementa diferentes programas en Java en base a las siguientes retos:

## RETO 1: sin usar array

Escribe un método, que dado un objeto de la clase String cuente diferentes tipos de caracteres. 

En particular, el método deberá imprimir el número de letras, dígitos y espacios en blanco de la cadena.

**Pista:** investiga en la clase Character qué métodos podrían ayudarte

## RETO 2: reto 1 usando array

Resuelve ahora el Reto1 pero usando el método toCharArray() de la clase String se puede obtener un array de caracteres a partir de un String.

## RETO 3: algoritmo de ordenación la burbuja

Debes implementar un programa que tenga un método que reciba un array y lo devuelva ordenado por el algoritmo de la burbuja.

El algoritmo de la burbuja es el siguiente:

![final-bubble-sort](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/ada3eb06-8144-48f4-beb4-52e82048f076)

Partes del siguiente array:

```
int[] enteros = {8, 3, 1, 19, 14};
```


![Captura de pantalla de 2023-11-16 21-00-44](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/2e8d5c33-3c54-46a8-9acd-da6d32cb0539)

![Captura de pantalla de 2023-11-16 21-01-14](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/359bdb69-f4b7-47d6-a81b-2344c9f56731)

![Captura de pantalla de 2023-11-16 21-01-42](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/4b164a1a-3705-46f9-b6b5-51cf8d085662)

![Captura de pantalla de 2023-11-16 21-02-07](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/dd66c305-b587-4142-9a0e-63a3a668aa4e)

## RETO 4: heterograma 

Una palabra o frase es **heterograma** si no parece repetida ninguna de las letras que la componen (vocales y consonantes).


Dada una cadena concreta (no tenemos en cuenta acentos, damos por hecho que no llegan vocales acentuadas):
```
String cadena = "centrifugado,hiperblanduzcos,Java,yuxtaponer,cocodrilo, y fin";
```

Tu programa debe mostrar por consola si cada una de las palabras o frases de la cadena son heterogramas o  no:

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/a91846af-09d7-4ca8-8db6-027bc5a19fc1)


Para ello debes programar una función que reciba una cadena y devuelva un booleano indicando si he heterograma o no.

## RETO 5: anagrama

Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra. 

Ejemplos de anagramas son la palabra amor, ramo o mora.

Implementa un método llamado **esAnagrama**. Dicho método recibe dos palabras y devuelve si son anagramas la una de la otra.

Ejemplo de salida por consola:

```
La palabra <Amor> y la palabra <ROMA> son anagramas
La palabra <Amor> y la palabra <rima> no anagramas
```



