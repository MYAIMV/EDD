public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(5);
        lista.agregar(3);
        lista.agregar(5);
        lista.agregar(7);
        lista.agregar(3);
        lista.agregar(9);

        System.out.println("Lista original");
        lista.imprimir();

        lista.eliminarDuplicados();

        System.out.println("Lista sin duplicados");
        lista.imprimir();
    }
}
