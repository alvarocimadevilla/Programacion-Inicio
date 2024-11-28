# FUNCIONES Y PROCEDIMIENTOS

![image](https://github.com/profeMelola/Programacion-03-2023-24/assets/91023374/8adcb9e8-8551-4d2f-a89b-cb9812610a48)


![Disenho_modular|50](https://github.com/profeMelola/Programacion-03-2023-24/assets/91023374/a2565880-4f1c-4bde-b9d4-eda6fe3d20eb)

## Funciones

Las funciones son bloques de código que realizan una tarea concreta y devuelven un valor.

## Procedimientos

Los procedimientos son bloques de código que realizan una tarea concreta pero no devuelven ningún valor.

## Funciones y procedimientos en Java

Por ahora nosotros trabajamos con métodos públicos estáticos que pueden recibir parámatros y pueden devolver un valor. Dependiendo de ello podemos calificarlos como funciones o procedimientos.

## Parámetros

Los parámetros son variables que se pasan a una función o procedimiento. 

Con ellos podemos modificar el comportamiento de la función o procedimiento y devolver un resultado diferente. 

Desde el lugar donde llamamos a la función se les asigna los valores a estos parámetros

### Paso por valor, copia y paso por referencia

#### Paso por valor
Se crea una copia del valor del parámetro y se pasa a la función. 

Si se modifica el valor del parámetro dentro de la función, no se modifica el valor original. 

Es el modelo que hemos estado utilizando hasta ahora y significa que las variables del algoritmo principal que le pasamos al subalgoritmo, no pueden ser modificadas en su valor por dicho subalgoritmo.

#### Paso por referencia

Se pasa la dirección de memoria, por lo tanto si modificamos el parámetro dentro de la función, se modifica el valor original. Proximamente...

![parametros](https://github.com/profeMelola/Programacion-03-2023-24/assets/91023374/a1ff824e-2f2c-4782-b56e-9260a731d527)

## Paquete o módulo

Un paquete o módulo es un conjunto de funciones y procedimientos que realizan una tarea concreta. 

Por ejemplo, un paquete de funciones matemáticas, un paquete de funciones de entrada y salida, un paquete de funciones de gestión de arrays, etc. 

Usamos estos paquetes para agrupar funciones y procedimientos que realizan una tarea concreta y que podemos reutilizar en otros programas o en otras partes del mismo. 

Es una forma de ordenar nuestro código por funcionalidades.

Ver ejemplo de la calculadora con la clase Operaciones https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJERCICIOS/calculadora

