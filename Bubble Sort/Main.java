import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Solicitar al usuario el arreglo
        System.out.print("¿Cuantos numeros tendra el arreglo? ");
        int n = sc.nextInt();
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        // 2. Imprimir arreglo original
        System.out.println("\nArreglo original:");
        BubbleHelper.imprimir(arreglo);

        // 3. Ordenar usando Bubble Sort
        BubbleHelper.bubbleSort(arreglo);

        // 4. Obtener el mínimo, máximo y diferencia
        int minimo = arreglo[0];
        int maximo = arreglo[arreglo.length - 1];
        int diferencia = maximo - minimo;

        // 5. Imprimir resultados
        System.out.println("\nArreglo ordenado:");
        BubbleHelper.imprimir(arreglo);

        System.out.println("\nValor minimo: " + minimo);
        System.out.println("Valor maximo: " + maximo);
        System.out.println("Diferencia (maximo - minimo): " + diferencia);

        sc.close();
    }
}