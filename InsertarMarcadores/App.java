import java.util.Arrays;

public class App {
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
        System.out.println("Original");
        imprimirArreglo(arrTest);

        for (int i = 0; i < arrTest.length; i++) {
            int[] filaOriginal = arrTest[i];
            int longitudOriginal = filaOriginal.length;
            int nuevoValorAAgregar;

            if (longitudOriginal % 2 != 0) {
                nuevoValorAAgregar = 0;
            } else {
                int primerElemento = filaOriginal[0];
                int ultimoElemento = filaOriginal[longitudOriginal - 1];
                nuevoValorAAgregar = primerElemento + ultimoElemento;
            }

            int nuevaLongitud = longitudOriginal + 1;
            int[] nuevaFila = new int[nuevaLongitud];

            for (int j = 0; j < longitudOriginal; j++) {
                nuevaFila[j] = filaOriginal[j];
            }

            nuevaFila[nuevaLongitud - 1] = nuevoValorAAgregar;

            nuevoArrTest[i] = nuevaFila;
        }

        System.out.println("\n Modificado ");
        imprimirArreglo(nuevoArrTest);
    }

    public static void imprimirArreglo(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}