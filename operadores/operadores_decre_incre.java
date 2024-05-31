public class operadores_decre_incre {
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 5;

        /// pre ejecucion, se incrementa o decrementa el valor antes de imprimir
        System.out.println("incre: " + (++a));
        System.out.println("decre: " + (--b));

        /// post ejecucion, se incremnta o decrementa el despues de imprimir
        System.out.println("incre: " + (a++));
        System.out.println("decre: " + (b--));

    }

}
