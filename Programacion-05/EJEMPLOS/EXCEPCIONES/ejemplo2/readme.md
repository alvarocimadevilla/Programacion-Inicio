# Crear excepciones propias

## Práctica guiada
Vamos a partir del ejercicio de ProductosPerecederos e introducir una excepción propia. https://github.com/profeMelola/Programacion-05-2023-24/tree/main/EJERCICIOS/INTERFACES#ejercicio-2-nos-piden-hacer-que-gestionemos-una-serie-de-productos

Al calcular el importe, en base a una cantidad de productos, vamos a controlar que la cantidad sea mayor que cero.

En el caso de que no sea así, se propagrará una excepción propia llamada **CantidadIncorrectaException** con el mensaje "La cantidad de productos debe ser mayor que cero".

### Pasos:

1. Crear la excepción propia (extends Exception).
2. Localizar la clase con el método **calcular**
3. Controlar en dicho método la condición que va a provocar una excepción en el programa.
4. Crear el objeto excepción, lanzarlo y propagarlo.
5. En el código donde se llama al método calcular tendremos que capturar la excepción.
   
