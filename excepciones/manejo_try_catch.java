package excepciones;

public class manejo_try_catch {
    
    //// manejando la excepxion unchecked
    public static void main(String[] args) {
        try {
            int a = 0 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
