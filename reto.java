public class reto {

    static int contadorEspecial(String palabra1, String palabra2){

        int contador = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(palabra1 + palabra2);
            } else if(i % 3 == 0){
                System.out.println(palabra1);
            } else if(i % 5 == 0){
                System.out.println(palabra2);
            }else{
                System.out.println(i);
                contador++;
            }   
        }

        return contador;
    }

    public static void main(String[] args) { 
        System.out.println("se ha imprimido " +  contadorEspecial("caca","fina") + " numeros enteros");
    }

}
