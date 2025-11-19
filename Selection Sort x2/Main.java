import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Solicitar arreglo original
        System.out.print("¿Cuantos numeros tendra el arreglo? ");
        int n = sc.nextInt();

        int[] original = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            original[i] = sc.nextInt();
        }

        // Contar pares e impares para crear arreglos del tamaño correcto
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < original.length; i++) {
            if (original[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        // 2. Arreglos de pares e impares
        int[] pares = new int[contadorPares];
        int[] impares = new int[contadorImpares];

        int indexP = 0;
        int indexI = 0;

        for (int i = 0; i < original.length; i++) {
            if (original[i] % 2 == 0) {
                pares[indexP] = original[i];
                indexP++;
            } else {
                impares[indexI] = original[i];
                indexI++;
            }
        }

        // 3. Ordenar con Selection Sort
        SortHelper.selectionSort(pares);
        SortHelper.selectionSort(impares);

        // 4. Imprimir resultados
        System.out.println("\nArreglo original:");
        SortHelper.imprimir(original);

        System.out.println("\nArreglo de pares ordenado:");
        SortHelper.imprimir(pares);

        System.out.println("\nArreglo de impares ordenado:");
        SortHelper.imprimir(impares);

        sc.close();
    }
}
