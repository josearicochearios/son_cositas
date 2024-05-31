public class condicional_switch {

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

    public static void main(String[] args) {

        int opcion = 4;
        int a = 5;
        int b = 6;

        switch (opcion) {
            case 1:
                System.out.println(suma(a, b));
                break;
            case 2:
                System.out.println(resta(a, b));
                break;
            case 3:
                System.out.println(multiplicacion(a, b));
                break;
            case 4:
                System.out.println(division(a, b));
                break;
            
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

    }
}
