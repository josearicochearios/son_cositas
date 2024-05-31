package instrucciones_salto;

public class instruccion_continie {
    
    public static void main(String[] args) {

        for (int a = 0; a < 50; a++) {

            if (a % 5 == 0) {
                System.out.println("kk");
                continue;
            }

            System.out.println(a);
        }

    }

}
