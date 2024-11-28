# Ejercicios sobre relaciones entre clases: agregación y composición

Apoyo de teoría en el aula virtual: https://aulavirtual3.educa.madrid.org/ies.alonsodeavellan.alcala/mod/page/view.php?id=119515

![image](https://github.com/profeMelola/Programacion-05-2023-24/assets/91023374/0bd094ef-1a93-4912-920e-f06a870f6e6f)

<small>Fuente: https://www.arquitecturajava.com/java-composicion-y-la-reutilizacion-del-codigo/</small>




# Ejercicio 1: Juego de azar

## Enunciado
Un juego de azar tiene  3  bolas. 

El funcionamiento de las bolas es el siguiente: al lanzar cada bola puede devolver un valor entre 0 y nueve (aleatorio) y además en cada tirada  cada bola tiene un valor de la puntuación o premio que puede ser desde 0 a 100 puntos (aleatorio). 

Se  lanzan las  tres bolas, anotando el resultado de la suma de las puntuaciones cada una, y además se comprobará :

**Si sale dos veces la misma bola  (por ejemplo tirada = 4 4 0 )  multiplica el valor de premio  x 2.**

```
Ejemplo:

                 bola 1: número 4, puntuación 15.

                 bola2: número 4, puntuación 26,

                 bola3: número 0, puntuación 100.

                 Puntuación  (15+26+100) *2.
```
 
**Si sale tres veces la misma bola (por ejemplo tirada = 4 4 4)  anota el valor del premio x3.**

```
Ejemplo:

                 bola 1: número 4, puntuación 15.

                 bola2: número 4, puntuación 26,

                 bola3: número 4, puntuación 100.

                 Puntuación  (15+26+100) *3.
```
 

En una ronda se hacen 3 tiradas (cada una de tres bolas).

Calcula la puntuación de la ronda.


### Completar el ejercicio de forma que nos muestre por pantalla el resultado de la ronda de 3 tiradas

**Ejemplo de salida de ejecución del programa:**

![Captura de pantalla de 2023-01-24 18-41-09](https://user-images.githubusercontent.com/91023374/214367931-523b5fba-cf46-4c1b-8eca-77b75905c7d7.png)


## Captura del proyecto en NetBeans

![Captura de pantalla 2023-01-20 124124](https://user-images.githubusercontent.com/91023374/213687599-21a42752-35d3-4f9e-b60b-d5f628b66e54.jpg)

 
## Diseño UML

![image](https://user-images.githubusercontent.com/91023374/148837242-cc4a674a-f091-42b4-a1bd-cc0bcb5622d9.png)


