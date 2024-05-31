import java.util.Scanner;

public class operadores_aritmeticos {

    static Scanner leer = new Scanner(System.in);

    static int suma (int a, int b) {
        return a + b;
    }

    static int resta (int a, int b) {
        return a - b;
    }

    static int multiplicacion (int a, int b) {
        return a * b;
    }

    static float division (float a, float b) {
        if (a == 0 && b == 0) {
            System.out.println("error math");
            return 0;
        }else {
            return a/b;
        }
    }

    static int resto (int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        int a = leer.nextInt();
        int b = leer.nextInt();

        float a_div = Float.valueOf(a);
        float b_div = Float.valueOf(b);

        System.out.println("suma: " + suma(a, b));
        System.out.println("resta: " + resta(a, b));
        System.out.println("multiplicacion: " + multiplicacion(a, b));
        System.out.println("division: " + division(a_div, b_div));
        System.out.println("resto: " + resto(a, b));
    }

}