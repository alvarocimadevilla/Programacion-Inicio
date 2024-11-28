# Sensor de viento

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/a674475b-287d-45bf-b628-d0a8343f0a1e) ![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/1da16629-0aff-4e81-a1a0-139b6c27f556)



Un sensor de viento nos proporciona los siguientes datos tras una hora tomando medidas:
```
String dirViento = "NE#SO#NE#O#NE#SE#E#N#O#O#N#O#SE#NO#SO#SE#S#S#O#NO#SE#N#NO#NO#NE#SE#S#NO#O#SE#NO#SE#NE#E#NE#NE#SE#NO#SO#E#NE#S#NO#NE#SO#N#NE#SE#SO#NE#S#SE#NO#N#NE#NO#NO#SO#SE#N#NO#NE#N#E#O#E#O#N#NO#N#S#SO#SE#O#NE#N#NO#S#E#SE#NO#SE#E#S#NO#N#SE#SE#SO#NE#N#N#S#SE#S#O#N#SO#O#SE";

String fueViento = "11@45@64@42@19@23@44@71@79@86@43@23@79@97@58@7@12@42@7@70@14@49@10@46@97@60@50@92@60@78@8@64@54@85@14@4@77@7@22@6@58@61@5@3@23@27@41@36@55@91@4@21@49@41@36@55@11@52@38@69@83@20@66@100@88@57@54@30@61@15@78@49@63@89@47@7@2@40@82@78@6@54@100@85@34@16@97@99@69@11@93@65@26@95@78@75@42@55@30@92";

```

En la cadena de texto dirViento, tenemos la dirección a la que soplaba el viento para cada muestra tomada.

En la cadena fueViento, tenemos la fuerza del viento para cada muestra tomada.

Cada muestra tiene dos componentes, la dirección y la fuerza, con lo cual la muestra 1 es dirección Noreste, fuerza 11. La muestra 2 es dirección suroeste fuerza 45, etc.

Usando las dos cadenas de texto debes realizar un programa que obtenga:

- La muestra con un valor mínimo y la de valor máximo de fuerza y en qué dirección soplaba cada una.
- La fuerza media para cada dirección del viento, estas medias son solo para las direcciones Norte, Sur, Este y Oeste.
    - Cada muestra que tenga una dirección compuesta, como SO, se computa como media muestra para cada dirección asociada.
    - Por ejemplo, la Muestra S 10 es una muestra completa para sur con valor 10, SO 15 es media muestra con valor 15 para sur y media muestra con valor 15 para oeste.
 
![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/80072f5d-c42b-4d84-8bad-d7013eb1be8a)


# Aprende a sumar

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/de6f8b54-d9d5-4d9d-b2a3-5e2e5926c31c)


Vas a implementar un programa que enseñe a sumar enteros a niños de primaria.

Cuando aprendemos a sumar números nos explican el acarreo “llevarse una”.

Dicho programa debe preguntar por dos números enteros de la misma longitud (mismo número de dígitos). Damos por hecho que se introducen correctamente.

Se irá mostrando paso a paso el proceso de la suma. Por ejemplo:

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/ad6f0c01-8ffe-4f05-be37-a63503502556)

## Versión 2: aprende a sumar números de diferente número de dígitos

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/e83076ed-a1d1-42ef-a416-3ac25208c89a)


