public class reto {

    public static void main(String[] args) {
        for (int i = 10; i < 56; i++) {
            if (i % 2 != 0 || i == 16 || i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}