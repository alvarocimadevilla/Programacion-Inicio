
# Ejercicios sobre arrays unidimensionales

## Ejercicio 1

Crear un array de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100.

Mostrar la suma de todos los números aleatorios que se guardan en el array.

## Ejercicio 2

Escribir una aplicación que solicite al usuario cuántos números desea introducir. A continuación, introducir por teclado esa cantidad de números enteros, y por último, mostrar en el orden inverso al introducido.

## Ejercicio 3

Diseñar la función **int maximo(int t[])** que devuelva el máximo valor contenido en el array t

## Ejercicio 4

Tenemos una colección de palabras: "uno", "dos" y "tres". 

Por consola pediremos al usuario que intente adivinar alguna de las tres.  Por lo tanto introducirá una palabra. 

Si es una de las tres de nuestra colección, el programa le mostrará el mensaje: 

**"HAS ACERTADO!!!"**

## Ejercicio 5

Escribir la función **int[] rellenaPares(int longitud, int fin)** que crea y devuelve un array ordenado de la longitud especificada. Para ordenar usaremos el método sort de la clase Arrays (Arrays.sort)

El array se rellena con números pares aleatorios comprendidos en el rango desde 2 hasta **fin** (inclusive)

**Después, implementa el mismo ejercicio pero en vez de utilizar Arrays.sort con un método creado por ti siguiendo el algoritmo de intercambio.**

**CURIOSIDAD:** el método sort de la clase Arrays utiliza un algoritmo de ordenación llamado "Dual-Pivot Quicksort" (o "QuickSort de doble pivote") desde Java 7 en adelante. Antes de Java 7, se utilizaba un algoritmo de ordenación llamado "MergeSort". El Dual-Pivot Quicksort es una variante del algoritmo Quicksort que utiliza dos pivotes en lugar de uno para dividir el array en subarrays durante el proceso de ordenación. Esto puede mejorar el rendimiento en comparación con el Quicksort tradicional de un solo pivote, ya que reduce el número de comparaciones y movimientos de elementos en el array. El Dual-Pivot Quicksort es un algoritmo de ordenación eficiente en la mayoría de los casos y tiene un rendimiento promedio de O(n log n) en comparación y O(n^2) en el peor caso.

El algoritmo de ordenación utilizado por Arrays.sort en Java es altamente optimizado y está diseñado para manejar una amplia variedad de tipos de datos y escenarios de ordenación. Java también proporciona métodos sobrecargados para ordenar matrices de diferentes tipos de datos, lo que hace que la ordenación sea conveniente y eficiente en el lenguaje.

En general, Arrays.sort es una forma confiable y eficiente de ordenar arreglos en Java.

### Algoritmos de ordenación

**Intercambio:** consiste en comparar el primer valor con el resto de las posiciones posteriores, cambiando el valor de las posiciones en caso de que el segundo sea menor que el primero comparado, después la segunda posición con el resto de posiciones posteriores.

![image](https://user-images.githubusercontent.com/91023374/199508163-581e8cb8-6f02-4c8f-9ade-5f9c174eabef.png)


https://www.freecodecamp.org/espanol/news/algoritmos-de-ordenacion-explicados-con-ejemplos-en-javascript-python-java-y-c/

**Ordenar arrays con el algoritmo de la burbuja en java**

https://youtu.be/7qvFbFzmqBk?si=ZUw4fD5Ls0ROc_jP

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/03211d9a-31ed-4d68-8132-33066e732f37)


**Algoritmo de ordenación QuickSort en Java**

https://www.youtube.com/watch?v=Xx84_1aWV60&t=7s

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/9b9dac88-a2e4-4aa4-9cb7-8a35d5a55b63)




