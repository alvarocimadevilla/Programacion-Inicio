# Ejercicio de introducción a POO (sin herencia) sobre artículos
![image](https://github.com/profeMelola/Programacion-05-2023-24/assets/91023374/eddc4030-1630-410b-834c-e26f5fadce6e)


## Paso 1: atributos y constructores
Crea un programa con una clase llamada Articulo con los siguientes atributos: 
- nombre
- precio (sinIVA)
- iva (siempre será 21)
- cuantosQuedan (representa cuantos quedan en el almacén).

Añade un constructor con 4 parámetros que asigne valores a nombre, precio, iva y cuantosQuedan. 

Dicho constructor deberá mostrar un mensaje de error si alguno de los valores nombre, precio, iva o cuantosQuedan no son válidos. 

**¿Qué coindiciones crees que podrían determinar si son válidos o no?** Razónalo e implementa el código.

**Prueba a crear varios artículos.** Introduce algunos con valores incorrectos para comprobar si avisa del error.

**Muestra por pantalla un mensaje del estilo:**
```
“Pijama - Precio:10€ - IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es decir, el precio con IVA).
```

## Paso 2: aplica el encapsulamiento básico a la clase Articulo

Declara todos sus atributos como private y crea todos los getters y setters necesarios (un get y un set por atributo).

Programa los setters para que comprueben los valores y los guarden en el objeto solo si son correctos. En caso contrario muestra un mensaje de error.

Queremos cambiar el precio de algún artículo.

Vuelve a imprimir el mensaje de cada artículo.

## Paso 3: vamos a añadir métodos de comportamiento

Añade a la clase Artículo métodos públicos con las siguientes funcionalidades:
- Método para imprimir la información del artículo por pantalla. (override de toString()). Si ya lo has utilizado previamente pues perfecto.
- Método getPVP que devuelva el precio de venta al público (PVP) con iva incluido.
- Método getPVPDescuento que devuelva el PVP con un descuento pasado como argumento.
- Método vender que actualiza los atributos del objeto tras vender una cantidad ‘x’ (si es posible). Devolverá true si ha sido posible (false en caso contrario).
- Método almacenar que actualiza los atributos del objeto tras almacenar una cantidad ‘x’ (si es posible). Devolverá true si ha sido posible (false en caso contrario).
