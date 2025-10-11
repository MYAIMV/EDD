package ArreglosBi;
import java.util.Arrays;
public class ModifiBi {
    public static void main(String[] args) throws Exception {
        int[][] arrTest = {
                {1},
                {6, 3, 1},
                {1, 2, 3, 4},
                {0, 5, 3, 0},
                {2, 5, 9},
                {2, 4, 8, 9, 10}
        };
        int[][] nuevoArrTest = new int[arrTest.length][];
        for (int i = 0; i < arrTest.length; i++) {
            int[] filaOriginal = arrTest[i];
            int nuevaLongitud = filaOriginal.length + 1;
            int valorUltimaPosicion = filaOriginal[filaOriginal.length - 1];
            int nuevoValorAAgregar = valorUltimaPosicion + 1;
            int[] nuevaFila = new int[nuevaLongitud];
            System.arraycopy(filaOriginal, 0, nuevaFila, 0, filaOriginal.length);
            nuevaFila[nuevaLongitud - 1] = nuevoValorAAgregar;
            nuevoArrTest[i] = nuevaFila;
        }
        System.out.println(" Original ");
        imprimirArreglo(arrTest);

        System.out.println("\n Modificado ");
        imprimirArreglo(nuevoArrTest);
    }
    public static void imprimirArreglo(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Fila " + i + ": " + Arrays.toString(arr[i]));
        }
}
    }