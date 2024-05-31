package instrucciones_salto;

public class instruccion_break {

    public static void main(String[] args) {
        
        /// el bucle se termina si la condicion es verdadera

        int a = 1;
        boolean b = true;
        while (b) {
            System.out.println(a);
            a++;
            if (a == 500) {
                break;
            }
        }

    }
    
}
