public class App {
    public static void main(String[] args) throws Exception {
        pregunta1();
        pregunta2();
        pregunta3();
        pregunta4();
        pregunta5();
        pregunta6();
        pregunta7();
        pregunta8();
        pregunta9();
        pregunta10();

        System.out.println("************ EJERCICIO PRÁCTICO 1 ***********");
        //ejercicio1(4);
        dibujarCuadrado(6);
    }

    public static void pregunta1() {
        int a = 1;
        a = a++;
        System.out.println("Pregunta 1:" + a);
    }

    public static void pregunta2() {
        String cad = "AA";
        char letra = 'a';
        int num1 = 1;
        cad += letra;
        cad += num1;
        cad += 1 + 2;
        System.out.println("Pregunta 2:" + cad);
    }

    public static void pregunta3() {
        String cad = "AB";
        for (int i = 0; i < 2; i++)
            cad += cad + 1 + 2;
        System.out.println("Pregunta 3: Cad es: " + cad + " y tiene " + cad.length() + "caracteres");
    }

    public static void pregunta4() {
        System.out.println("Pregunta 4:");
        char letra = 50;
        letra *= 2;
        for (int i = 0; i < 5; i++) {
            letra++;
            System.out.print(letra);
        }
        System.out.println(" :letra final = " + letra + 1);

    }

    public static void pregunta5() {
        System.out.println("Pregunta 5:");
        String cad = "Hola";
        for (int i = 0; i < 4; i++)
            cad += "\r" + i;
        System.out.println(cad);
    }

    public static void pregunta6() {
        int a = 1, b = 2;
        if (++a == b)
            a++;
        for (int i = 0; i < a; i += 2) {
            a += i;
            i++;
        }
        System.out.println("Pregunta 6:" + a);
    }

    public static void pregunta7() {
        int x = 1, y = 5, z = 10;
        if (!false)
            x += y;
        x--;
        if (x == y)
            y += x;
        if (!(x != y && y == z))
            z += x;
        z -= y;
        if (x == y)
            ;
        x += x;
        System.out.println("Pregunta 7:");
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);
    }

    public static void pregunta8() {
        int a = 0;
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 50; j++)
                a += 2;
        }
        System.out.println("Pregunta 8:" + a);
    }

    public static void pregunta9() {
        System.out.println("Pregunta 9:");
        cadena("Hola", 0);
    }

    static void cadena(String cad, int n) {
        if (n == 3)
            System.out.println(cad);
        else
            cadena(cad + n, n + 1);
    }

    public static void pregunta10() {
        int a = 1, b = 1;
        a = (a != b) ? a + b : a - b;
        System.out.println("Pregunta 10:" + a);
    }


    private static void ejercicio1(int n) {

        if (n > 9 || n < 1) {
            System.out.println("ERROR: el número debe estar entre 1 y 9");
            return;
        }

        int lado = n * 2 - 1;
        int numActual;
        for (int i = 0; i < lado; i++) {
            numActual = n;
            for (int j = 0; j < lado; j++) {
                System.out.print(numActual + " ");
                if (j < n - 1)
                    numActual--;
                else
                    numActual++;
            }
            System.out.println();
        }
    }
    public static void dibujarCuadrado(int n) {
        do {
        
            if (n >= 10 || n < 1) {
                System.out.println("NUMERO NO VALIDO");
                System.out.println("Solo se aceptan numeros entre el 1 y el 9");
            }
        } while (n >= 10|| n < 1);

        for (int i = 0; i < (n*2)-1; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }    


}
