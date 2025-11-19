import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Declarar arreglo de temperaturas
        System.out.print("¿Cuantas temperaturas ingresaras? ");
        int n = sc.nextInt();

        double[] temperaturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        // Guardar copia para imprimir el original
        double[] original = new double[n];
        for (int i = 0; i < n; i++) {
            original[i] = temperaturas[i];
        }

        // 2. Imprimir arreglo original
        System.out.println("\nArreglo original:");
        TempHelper.imprimir(original);

        // 3. Ordenar con Insertion Sort
        TempHelper.insertionSort(temperaturas);

        // 4. Calcular datos
        double min = temperaturas[0];
        double max = temperaturas[temperaturas.length - 1];
        double rango = max - min;

        // Top 3 más altos
        double[] topAltos = TempHelper.topTresAltos(temperaturas);

        // Top 3 más bajos
        double[] topBajos = TempHelper.topTresBajos(temperaturas);

        // 5. Imprimir resultados
        System.out.println("\nArreglo ordenado:");
        TempHelper.imprimir(temperaturas);

        System.out.println("\nTemperatura minima: " + min);
        System.out.println("Temperatura maxima: " + max);
        System.out.println("Rango: " + rango);

        System.out.println("\nTop 3 temperaturas mas altas:");
        TempHelper.imprimir(topAltos);

        System.out.println("\nTop 3 temperaturas mas bajas:");
        TempHelper.imprimir(topBajos);

        sc.close();
    }
}
