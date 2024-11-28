# La clase String. Las cadenas de caracteres

Las cadenas de caracteres se almacenan en java utilizando la clase String . Java permite que utilicemos este tipo de dato como si tratara de un tipo primitivo pero realmente es una clase que, a parte de almacenar el valor de una cadena de caracteres, tiene numersosos métodos para operar con dicho valor y con otros relacionados.

Hay que tener en cuenta que, puesto que las cadenas de texto en Java son inmutables, todos los métodos que realizan operaciones sobre un objeto String siempre devuelven el resultado, nunca lo ejecutan sobre el propio objeto. En el caso de los métodos static ocurre lo mismo.

## A tener en cuenta
- El tipo String es una clase así que las cadenas de texto realmente son objetos Java
- Al tratarse de un objeto, podemos realizar algunas operaciones sobre la misma variable/objeto, como veremos más adelante
- Java nos permite utilizarlo como si fuera un tipo primitivo (aunque no lo sea) puesto que es un dato muy utilizado y asi nos será más cómodo
- Como realmente es un objeto, su valor por defecto será null
- Cualquier valor puede ser representado como una cadena de texto, por lo que normalmente será el tipo de dato utilizado siempre que se quiera recoger algún input del usuario

## Cuándo utilizar una cadena de texto
Por supuesto, usaremos una cadena cuando queramos almacenar texto.

A veces, incluso cuando el valor que se quiere almacenar está compuesto exclusivamente de dígitos, éste debe almacenarse como cadena de texto, puesto que no son valores numéricos realmente ya que no soportan ninguna operación matemática ni se espera que se haga ninguna con ellos.

Estos son algunos ejemplos:

- DNI
- Número de la Seguridad Social
- Cuenta Bancaria
- Teléfono
  
Y si fuera necesario realizar alguna operación con sus dígitos (calcular dígitos de control, por ejemplo) siempre se puede recurrir al parseo del valor para realizar esos cálculos.

Y, en definitiva, hay que tener en cuenta que todo input de usuario (tanto de consola como a través de formularios) viene siempre en forma de texto y somos nosotros quienes tenemos luego que parsearlo al tipo correcto (tras las comprobaciones)

### Casos de uso con cadenas
- Un usuario introduce su nombre y apellidos en una caja de texto
   - Convertir a mayúscula/minúscula y eliminar los espacios a inicio y final
- Un usuario introduce su número de cuenta
   - Convertir la cadena en un array de caracteres para realizar el cálculo del digito de control
- Un usuario introduce su número de DNI (con letra)
   - Convertimos el valor a un número para hacer los cálculos y luego lo almacenamos todo junto (con letra) concatenando.
- Un usuario introduce un precio en un formulario
   - Tras las comprobaciones (caja de texto vacía o valor sólo compuesto por dígitos) tendremos que parsearlo al tipo de dato que corresponda (float en este caso)

## Extracción de un caracter particular
Podemos extraer un caracter indicando simplemente su posición, y lo obtendremos como una variable de tipo char. Obtendremos un error en caso de que no exista el caracter en la cadena.

```
String cadena = "Cadena de texto";
char primerCaracter = cadena.charAt(0);
System.out.println(primerCaracter);     // C
```

## Obtener la longitud de una cadena
Para obtener la longitud de una cadena utilizaremos el método length. Hay que tener en cuenta que devolverá el número de caracteres incluyendo los espacios. También podremos saber si una cadena está vacía con el método isEmpty(). Recuerda que nunca será lo mismo que la cadena esté vacía a que no haya sido instanciada.

```
String cadenaVacia = "";
String cadenaNula;
String cadenaNulaTambien = null;
 
System.out.println(cadenaVacia.isEmpty());  // true
System.out.println(cadenaNula.isEmpty());   // Error (Excepción NullPointerException)
System.out.println(cadenaNulaTambien.isEmpty()); // Error (Excepción NullPointerException)
String cadena = "esto es una cadena";
System.out.println(cadena.length());    // 18
 
// Podemos comprobar si la cadena está vacía (length() == 0)
System.out.println(cadena.isEmpty());   // false
```

## Subcadenas
Una subcadena es el fragmento que extraemos de una cadena más larga. La clase String en Java proporciona diferentes formas de hacerlo a través de las diferentes sobrecargas del método substring() dependiendo de los parámetros que se le pasen. Tendremos que tener en cuenta que la primera posición de una cadena será la posición 0

```
String nombre = "CodeAndCoke";
 
// Devuelve la subcadena desde la posición 10 en adelante
String subcadena = nombre.substring(10);
System.out.println(subcadena);      // e
// Devuelve la subcadena entre dos posiciones dadas
subcadena = nombre.substring(5, 10);
System.out.println(subcadena);      // ndCok
```

## Comparación de cadenas
Las cadenas de texto, al tratarse de objetos, no pueden ser comparadas con el operador == ya que dicho operador sobre dos objetos evaluará si tienen la misma dirección de memoria, pero no si contienen el mismo valor. Podemos tener dos cadenas con el mismo texto pero pueden ser diferentes objetos, por lo que el operador devolvería un significado erróneo.

```
String nombre = "CodeAndCoke";
String nombreCorto = "CAC";
if (nombre.equals(nombreCorto)) {
    System.out.println("Las dos cadenas son iguales");
}
else {
    System.out.println("Las dos cadenas de texto son diferentes");
}
```

## Cambiar las letras de mayúscula a minúsculas
También podemos pasar una cadena de texto a minúsculas o mayúsculas. La clase String tiene métodos para realizar ambas operaciones, devolviendo siempre el resultado final.

```
String nombre = "CodeAndCoke";
String nombreMinusculas = nombre.toLowerCase();
System.out.println(nombreMinusculas);   // codeandcoke
 
String nombre = "CodeAndCoke";
String nombreMayusculas = nombre.toUpperCase();
System.out.println(nombreMayusculas);   // CODEANDCOKE
```

## Búsqueda en una cadena
También podemos buscar subcadenas dentro de una cadena. Podremos buscar desde un caracter hasta una cadena de longitud indeterminada.

```
String nombre = "code and coke";
int posicion = nombre.indexOf("and");
if (posicion == -1) {
    System.out.println("La palabra 'and' no se encuentra en el nombre");
}
else {
    System.out.println("Se ha encontrado la cadena 'and' en la posición " 
                        + posicion);
}
```

## Sustitución en una cadena
Podemos reemplazar fragmentos de la cadena de texto por otros que pasemos como parámetros al método replace(), que devolverá la cadena resultante.

```
String nombre = "CodeAndCoke";
String busqueda = "Coke";
String reemplazo = "Code";
nombre = nombre.replace(busqueda, reemplazo);
System.out.println(nombre);  // CodeAndCode
```

## Dar formato a una cadena
Si te has fijado, hasta ahora almacenamos en variables sólo el valor de algo, pero en ningún caso añadimos información de cómo queremos representar ese valor a la hora de mostrarlo en pantalla. Quizás sea un valor monetario, una fecha o cualquier otro valor que necesite una representación determinada. Para eso está el método format() de la clase String. Permite añadir formato a los valores de cualquier variable para mostrarlo al usuario, por ejemplo.

```
float precio = 45.5;
 
// Muestra el valor tal y como está almacenado
System.out.println(precio);             // 45.5
 
// Muestra el valor con dos decimales
System.out.println(String.format("%,2f", precio));      // 45.50
 
// Muestra el valor con dos decimales siguiendo una notación concreta
System.out.println(String.format(Locale.FRENCH, "%.2f", precio));   // 45,50
 
int valor = 45;
// Fuerza mostrar el valor utilizando 3 dígitos
System.out.println(String.format("%03d", valor);        // 045
```

## Convertir una cadena de caracteres en un array de caracteres
A veces es interesante obtener una cadena como un array de valores char para operar con ellos de otra manera. La clase String dispone del método toCharArray() para convertir una cadena en un array de caracteres.

```
String cadena = "CODE";
char[] caracteres = cadena.toCharArray();
System.out.println(Arrays.toString(caracteres));  // ['C', 'O', 'D', 'E']

```


<sub>Referencia: https://java.codeandcoke.com/apuntes:cadenas</sub>
