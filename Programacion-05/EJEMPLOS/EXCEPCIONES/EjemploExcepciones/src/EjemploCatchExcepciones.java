import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EjemploCatchExcepciones {
    public static void main(String[] args) throws Exception {
        System.out.println("****** PROBANDO EXCEPCIONES *******");
        arithmeticException();
        nullPointerException();
        stringIndexOfBoundException();
        fileException();
        numberFormat();
        arrayIndexOfBoundsException();
        System.out.println("******* chimpún *****");
    }

    public static void arithmeticException() {
        try {
            int a = 30, b = 0;
            int c = a / b; // cannot divide by zero
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }
    }

    public static void nullPointerException() {
        try {
            String a = null; // null value
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("NullPointerException..");
        }
    }

    public static void stringIndexOfBoundException() {
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }

    public static void fileException() {
        try {
            // Following file does not exist
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }

    public static void numberFormat() {
        try {
            // "akki" is not a number
            int num = Integer.parseInt("akki");

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }

    public static void arrayIndexOfBoundsException() {
        try {
            int a[] = new int[5];
            a[6] = 9; // acceso inválido
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }
    }
}
