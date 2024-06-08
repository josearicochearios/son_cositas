public class variable_global_local {

    /// puede ser usando en toda la clase
    static String a = "fuaaa";

    static void noseCual(){

        /// solo puede ser usado dentro de este metodo
        String b = "feaaa";
        System.out.println(b);
    }

    public static void main(String[] args) {
        noseCual();
        /// System.out.println(b); <--- esto es error, b solo se declaro dentro de un metodo, a por el contrario
        /// puede ser usado en todos los metodos dentro de esta clase
        System.out.println(a);
    }
}