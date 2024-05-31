public class condicional_ifelseifelse {
    public static void main(String[] args) {
        int edad = 80;
        if (edad >= 60) {
            System.out.println("Eres un anciano");
        } else if(edad >= 18 && edad <= 60) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
