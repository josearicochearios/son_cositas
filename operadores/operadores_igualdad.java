public class operadores_igualdad {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String c = "lacra";
        String d = "lacra";

        /// verifica igualdad en referencia en memoria
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(c == d);
        System.out.println(c != d);

        /// verifica igualdad del contenido
        System.out.println(c.equals(d));
    }
}
