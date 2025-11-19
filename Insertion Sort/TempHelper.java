public class TempHelper {

    // Insertion Sort manual
    public static void insertionSort(double[] arr) {

        for (int i = 1; i < arr.length; i++) {
            double actual = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > actual) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = actual;
        }
    }

    // Obtener las 3 más altas
    public static double[] topTresAltos(double[] arr) {

        int cantidad = arr.length < 3 ? arr.length : 3;
        double[] resultado = new double[cantidad];

        int index = arr.length - 1;

        for (int i = 0; i < cantidad; i++) {
            resultado[i] = arr[index - i];
        }

        return resultado;
    }

    // Obtener las 3 más bajas
    public static double[] topTresBajos(double[] arr) {

        int cantidad = arr.length < 3 ? arr.length : 3;
        double[] resultado = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            resultado[i] = arr[i];
        }

        return resultado;
    }

    // Método para imprimir arreglos
    public static void imprimir(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
