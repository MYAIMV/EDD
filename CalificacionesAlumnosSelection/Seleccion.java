public class Seleccion {
    public static void selectionSort(double[] arrCalificaciones, String[] arrNombres) {
        int n = arrCalificaciones.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arrCalificaciones[j] < arrCalificaciones[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double tempCalificacion = arrCalificaciones[minIndex];
                arrCalificaciones[minIndex] = arrCalificaciones[i];
                arrCalificaciones[i] = tempCalificacion;
                String tempNombre = arrNombres[minIndex];
                arrNombres[minIndex] = arrNombres[i];
                arrNombres[i] = tempNombre;
            }
        }
    }
}