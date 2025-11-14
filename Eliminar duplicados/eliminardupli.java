public class eliminardupli {
    public static void main(String[] args) {

        int[] arregloOriginal = {4, 2, 9, 2, 4, 7, 1};
        System.out.println("Arreglo Original ");
        imprimirArreglo(arregloOriginal);
        bubbleSort(arregloOriginal);
        System.out.println("\n Arreglo Después de Ordenar (Bubble Sort) ");
        imprimirArreglo(arregloOriginal);
        int[] arregloSinDuplicados = obtenerArregloSinDuplicados(arregloOriginal);
        System.out.println("\n Arreglo Final Sin Duplicados ");
        imprimirArreglo(arregloSinDuplicados);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int[] obtenerArregloSinDuplicados(int[] arrOrdenado) {
        if (arrOrdenado.length == 0) {
            return new int[0];
        }
        
        int elementosUnicos = 1; 
        for (int i = 1; i < arrOrdenado.length; i++) {
            if (arrOrdenado[i] != arrOrdenado[i - 1]) {
                elementosUnicos++;
            }
        }

        int[] nuevoArreglo = new int[elementosUnicos];
        int indiceNuevo = 0;

        nuevoArreglo[indiceNuevo] = arrOrdenado[0];
        indiceNuevo++;

        for (int i = 1; i < arrOrdenado.length; i++) {
            if (arrOrdenado[i] != arrOrdenado[i - 1]) {
                nuevoArreglo[indiceNuevo] = arrOrdenado[i];
                indiceNuevo++;
            }
        }

        return nuevoArreglo;
    }

    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}