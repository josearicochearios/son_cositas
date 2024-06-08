public class metodo_normal {

    /// Metodo estatico
    /// Metodo sin parametros ni retorno
    static void imprimirConsola(){
        System.out.println("lacrero");
    };

    /// Metodo no estatico
    void noEstatico() {
        System.out.println("prasta");
    };

    public static void main(String[] args) {
        imprimirConsola(); /// no se necesita instancias la clase

        metodo_normal mn = new metodo_normal();
        mn.noEstatico(); /// se necesita instanciar la clase para usar el metodo

    }
}