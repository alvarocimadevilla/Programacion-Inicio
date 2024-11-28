# Programa para la gestión de notas de los alumnos

## Objetivos

Practicar con matrices (arrays bidimensionales)

El programa tiene como objetivo ayudar al tutor para guardar las notas de los alumnos de 1º de DAW y poder obtener posteriormente diferentes informes.

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/4fc45a79-cd04-4644-905a-9960cdf4939a)


## Version 1: sin pedir datos al usuario

He dejado la solución de esta versión.

Podemos observar las diferentes formas de cargar datos en una matriz.

Además, podemos entender:
- cómo mostrar datos de las filas ( notas de cada alumno en los 6 módulos).
- cómo mostrar datos de las columnas (notas de todos los alumnos en un módulo concreto).

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/0a28290e-d9ed-4039-8d1b-bde018641e77)


## Versión 2: programa completo. Carga dinámica de datos

### Requisitos

1. El programa debe mostrar un menú principal:

```
1. Cargar datos de alumnos
2. Informes
3. Salir
```

2. Primero vamos a trabajar con una única clase principal de forma modular. Con diferentes métodos estáticos (funciones). Después vamos a refactorizar y crear un nuevo paquete con una clase de utilidades que contendrá los métodos estáticos.

3. Hay que tener en cuenta que podemos introducir notas con decimales.

4. Además vas a tener que gestionar submenús (submenú de la opción de informes).

A continuación se muestra cómo debería quedar la gestión de menús completa:

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/70e8d05d-dbca-44f6-9993-7366c46ef641)

#### OPCIÓN 1: cargar datos de alumnos

De los alumnos es necesario saber su nombre.

De todos los alumnos se cargan las 6 notas (una por cada módulo).

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/9e649266-ebdf-4490-9218-8b13734049c1)


#### OPCIÓN 2: infomes

Debe aparecer un submenú con las siguientes opciones:

```
1. Mostrar todas las notas
2. Mostrar las notas de un módulo concreto
3. Nota media de cada módulo
4. Nota media de cada alumno
5. Ver nota de un alumno en un módulo concreto
6. Volver al menú principal

```
Crea una **nueva clase llamada Informes en el paquete es.daw.ut04gestionnotasalumnos** donde vamos a implementar los diferentes métodos, uno por cada opción del submenú de informes.

### Versión 3: con matriz irregular

**¿Y si de cada alumno se introduce un número diferente de notas porque no todos los alumnos están matriculados en todos los módulos?**

Vamos a suponer ese caso:
- Haremos la defición de la matriz irregular
- Simplemente por cada alumno mostraremos:
  - la media de sus notas
  - el número de módulos aprobados y el número de módulos suspensos



### Versión 4: con arrays de 3 dimensiones

¿Qué aplicación práctica se te ocurre para utilizar un array de 3 dimensiones?

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/0e31c61d-8918-4e7b-93c7-5ad4e4378592)





