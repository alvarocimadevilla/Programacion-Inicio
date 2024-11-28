# Ejercicio POO con herencia (sin clases abstractas ni interfaces)

Codifica la siguiente jerarquía de clases java representada por este diagrama UML

![image](https://user-images.githubusercontent.com/91023374/148693304-5bf43e62-673f-4122-9793-b93c25e9a2ba.png)


## Clase Empleado

La clase base es la clase Empleado. Esta clase contiene:

- Un atributo privado nombre de tipo String que heredan el resto de clases. 
- Un constructor por defecto.
- Un constructor con parámetros que inicializa el nombre con el String que recibe.
- Método set y get para el atributo nombre.
- Un método toString() que devuelve el String: "Empleado " + nombre.

## Resto de clases
El resto de clases solo deben sobrescribir el método toString() en cada una de ellas y declarar el constructor adecuado de forma que cuando la ejecución de las siguientes instrucciones:

![image](https://user-images.githubusercontent.com/91023374/148693408-af97fa49-3837-471a-a5a5-9735795e592e.png)


Den el siguiente resultado:

![image](https://user-images.githubusercontent.com/91023374/148693415-fd3ffd53-dbf9-4cff-bac2-c6cae031a026.png)

# Añadiendo polimorfismo

El siguiente código está relacionado con la teoría del aula virtual 

```
        Empleado[] empleados = new Empleado[10];
        empleados[0] = E1;
        empleados[1] = D1;
        empleados[2] = OP1;
        empleados[3] = OF1;
        empleados[4] = T1;
        empleados[5] = T2;

        // Primera forma 
        System.out.println(Arrays.toString(empleados));

        // Segunda forma
        System.out.println("********** LISTADO DE EMPLEADOS **********");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            
        }

        // Ahora con arraylist
        ArrayList<Empleado> empleados2 = new ArrayList<>();
        empleados2.add(E1);
        // ....

        System.out.println("********** LISTADO DE EMPLEADOS ARRAYLIST**********");
        ArrayList<Empleado> empleados3 = new ArrayList<>(Arrays.asList(empleados));
        for (Empleado empleado : empleados3) {
            System.out.println(empleado);
        }
'''
