public class ListaEnlazada {
    Nodo cabeza;

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    public void eliminarDuplicados() {
        Nodo actual = cabeza;

        while (actual != null) {
            Nodo runner = actual;
            while (runner.siguiente != null) {
                if (runner.siguiente.valor == actual.valor) {
                    runner.siguiente = runner.siguiente.siguiente;
                } else {
                    runner = runner.siguiente;
                }
            }
            actual = actual.siguiente;
        }
    }

    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " → ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
