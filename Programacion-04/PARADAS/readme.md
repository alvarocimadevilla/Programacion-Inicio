# SLEEP

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/36c9604a-1d86-4c1c-8572-c9fd4093bf9b)


Vamos a ver dos instrucciones que nos permiten hacer esperar a nuestro programa. 

Estas instrucciones se emplean para generar retardos, o en programas más complejos que requieren la sincronización de diferentes procesos. 

En este ejemplo lo usaremos para producir retardos en la ejecución de nuestro código. 

Esta funcionalidad no está muy vinculada con la unidad de trabajo, pero nos permite familiarizarnos con la gestión del tiempo en nuestros programas.

Los dos métodos que emplearemos será mediante las clases **Thread y TimeUnits**. 

Para usarlas vamos a tener que gestionar sus potenciales excepciones, este es un concepto más avanzado del curso.

De momento si necesitas emplearlo copia la estructura y no es necesario que entiendas con precisión qué hacen las instrucciones try y catch.

```
       // Ejemplo espera con Thread.sleep(x)
       System.out.println("-----Ejemplo de espera con Thread-----");
       System.out.println("Escóndete, te dos 2 segundos!");
       try {
           Thread.sleep(2000);
       } catch (InterruptedException e){
           // Aquí se maneja una excepción
           // esto lo vemos más adelante en el curos
       }
       System.out.println("Que voy!");
      
       // Ejemplo espera con TimeUnit
       System.out.println("-----Ejemplo de espera con TimeUnit-----");
       System.out.println("Escóndete, te dos 2 segundos!");
       try {
           TimeUnit.SECONDS.sleep(2);
           // Ojo! TimeUnit requiere importar la librería.
       } catch (InterruptedException e){
           // Aquí se maneja una excepción
           // esto lo vemos más adelante en el curos
       }
       System.out.println("Que voy!");
```

## EJERCICIOS

### Ejercicio1: cuenta atrás
Escribe un programa que simule la cuenta atrás del lanzamiento de un cohete. Las indicaciones por pantalla deben ser segundos reales.

### Ejercicio2: barra de progreso
Escribe un programa que simule una barra de carga del 0 al 100% dibujada progresivamente con saltos temporales.

**Pista:** \r


