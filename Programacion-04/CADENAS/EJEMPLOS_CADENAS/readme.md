## Ejemplos para prácticar con cadenas de texto

#### Ejemplo 1: muestra la longitud de un texto

```
        String txt ="JAVA";
        
        System.out.println("[FORMA 1: con función length] Longitud del texto: "+txt.length());
                
    }
```

#### Ejemplo 2: muestra por pantalla cada uno de los caracteres de una cadena de texto en líneas separadas.

Por ejemplo:
Si la cadena es "Java", el resultado sería:

J

a

v

a


```
        String txt = "Java";
        
        //With for traditional
        for (int i = 0; i < txt.length(); i++) {
                System.out.println(txt.charAt(i));
        }
```

#### Ejemplo 3: muestra un texto invertido

Por ejemplo, si el texto es "James Gosling creó Java", el resultado sería:
avaJ óerc gnilsoG semaJ

```
        String cadena = "James Gosling creó Java";
        
        // FORMA PRO
        //StringBuilder pepe = new StringBuilder(cadena);
        //System.out.println("[FORMA AUTOMÁTICA] "+pepe.reverse());
        
        
        // FORMA ARTESANAL
        String cadenaResultado = "";
        for (int i= cadena.length()-1; i>=0; i--  ){
            cadenaResultado += cadena.charAt(i);
        }
        
        System.out.println("AL REVÉS: "+cadenaResultado);
```

#### Ejemplo 4: elimina los espacios en blanco de un texto

Por ejemplo, si el texto es "James Gosling creó Java", el resultado sería:
JamesGolingcreóJava

```
        String txt = "Java mola mucho";
        
        String txtRdo = "";
        
        // Forma artesanal
        for(int i=0; i < txt.length(); i++){
            if ( txt.charAt(i) != ' ')
                txtRdo += txt.charAt(i);
        }
        
        System.out.println("[1- tradicional] CADENA SIN ESPACIOS: "+txtRdo);
        
        // Con funciones de String
        System.out.println("[2 - replace] CADENA SIN ESPACIOS: "+txt.replace(" ",""));
        
        System.out.println("[3 - replaceAll] CADENA SIN ESPACIOS: "+txt.replaceAll("\\s", ""));
```

#### Ejemplo 5: cuenta las vocales y consonantes de una cadena de texto

El resultado a mostrar sería por ejemplo:

El texto "esto es un ejemplo" tiene 7 vocales y 8 consonantes

```
    		String txt = "Java Java Java";
		int vowels = 0, consonants = 0;
		//With for traditional
		for (int i = 0; i < txt.length(); i++) {
			txt = txt.replace(" ","");
			if(txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i'
                    || txt.charAt(i) == 'o' || txt.charAt(i) == 'u') {
				vowels+=1;
			} else {
				consonants++;
			}
		}
		System.out.println(txt + " tiene " + vowels + " vocales y " + consonants + " consonantes");

		//With forEach traditional - Avanzado, ya veremos los bucles forEach cuando demos los arrays
		
   		vowels = 0;
		consonants = 0;
		for (char character : txt.toCharArray()) {
			txt = txt.replace(" ","");
			if(character == 'a' || character == 'e' || character == 'i'
                    || character == 'o' || character == 'u') {
				vowels+=1;
			} else {
				consonants++;
			}
		}
		System.out.println(txt + " tiene " + vowels + " vocales y " + consonants + " consonantes");
```

#### Ejemplo 6: divide una cadena en dos partes

Divide la siguiente cadena "Me gusta programar en java" en:

"Me gusta programar"

" en java"

```
        String txt ="HOLA AMIGOS";
        String parte1 = txt.substring(0, 4);
        System.out.println("PARTE 1: "+parte1);
        String parte2 = txt.substring(4);
        System.out.println("PARTE 2: <"+parte2+">");
        System.out.println("PARTE 2 v2: <"+txt.substring(4, txt.length())+">");
        //System.out.println("PARTE 2 v3: <"+txt.substring(3, 55)+">");
```

#### Ejemplo 7: transforma el texto del ejercicio 6 primero a mayúsculas y después a minúsculas (todo el texto)

```
  		String txt = "Me gusta programar en Java";
		System.out.println(txt + " en mayúsculas: " + txt.toUpperCase());
		txt = txt.toUpperCase(); //JAVEROS
		System.out.println(txt + " en minúsculas: " + txt.toLowerCase());
```

#### Ejemplo 8: compara diferentes textos.

Este programa debe pedir al usuario dos cadenas de texto y debe indicar si son iguales o diferentes.

```
        String cadena1 = "hola";
        String cadena2 = "adios";
        String cadena3 = "Hola";
        
        System.out.println("hola es igual a Hola? "+cadena1.equals(cadena3));
        System.out.println("hola es igual a Hola? "+cadena1.equalsIgnoreCase(cadena3));
        System.out.println("hola es igual a adios? "+cadena1.equalsIgnoreCase(cadena2));
```

#### Ejemplo 9: sobre la cadena de texto "Jeve mola", reemplaza las vocales e por la vocal a.

```
		String txt = "Jeve mola";
		String txtModified = "";
		//With for traditional
		txtModified = "";
		System.out.println("---------------------------------------------");
		for (int i = 0; i < txt.length(); i++) {
			if(txt.charAt(i) == 'e') {
				txtModified += 'a';
			}else {
				txtModified += txt.charAt(i);
			}
		}
		System.out.println("Texto original: \t" + txt);
		System.out.println("Texto reemplazado: \t" + txtModified);
		System.out.println("---------------------------------------------");
                
		//With forEach traditional: Avanzado, ya veremos los bucles forEach cuando demos los arrays
		txtModified = "";
		for (char character : txt.toCharArray()) {
			if(character == 'e') {
				character = 'a';
			}
			txtModified += character;
		}
		System.out.println("Texto original: \t" + txt);
		System.out.println("Texto reemplazado: \t" + txtModified);
                
		//With replace
		System.out.println("---------------------------------------------");
		System.out.println("Texto original: \t" + txt);
		System.out.println("Texto reemplazado: \t" + txt.replace('e', 'a'));
		System.out.println("---------------------------------------------");
```

#### Ejemplo 10: transforma los caracteres de una palabra escrita por el usuario a ASCII.

Si la cadena es ABCD, la salida a obtener debería ser así:

Código ASCII de A es 65

Código ASCII de B es 66

...

```
		String txt = "ABCD abcd";
                
		//With for traditional
		for (int i = 0; i < txt.length(); i++) {
			System.out.println("ASCII: " + (int) txt.charAt(i) + " es equivalente a: " + txt.charAt(i));
		}
                
		//With forEach: Avanzado, ya veremos los bucles forEach cuando demos los arrays
		System.out.println("---------------------------------------------");
		for (char charater : txt.toCharArray()) {
			System.out.println("ASCII: " + (int) charater + " es equivalente a: " + charater);
		}
		System.out.println("---------------------------------------------");
```






