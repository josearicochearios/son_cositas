import java.time.LocalDate;

public class metodo_parametros {

    /// Un solo Parametro
    static void imprimirNombre(String nombre){
        System.out.println("Hola " + nombre);
    }

    /// Dos Parametros
    static void nombreEdad(String nombre, int nacimiento){
        System.out.println(nombre + " tu edad es de: " + (LocalDate.now().getYear() - nacimiento));
    }
    
    public static void main(String[] args) {
        imprimirNombre("Sebastian");
        nombreEdad("Leandro", 2003);
    }
}
