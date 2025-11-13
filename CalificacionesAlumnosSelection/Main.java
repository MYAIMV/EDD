import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantas calificaciones deseas registrar?");
        int numAlumnos = scanner.nextInt();
        scanner.nextLine();
        String[] nombres = new String[numAlumnos];
        double[] calificaciones = new double[numAlumnos];
        System.out.println("\n Captura de Calificaciones");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Nombre del alumno #" + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Calificacion de " + nombres[i] + ": ");
            calificaciones[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }
        Seleccion.selectionSort(calificaciones, nombres);
        System.out.println("\n Resultados Ordenados ");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.printf("%.2f \t\t %s\n", calificaciones[i], nombres[i]);
        }
        scanner.close();
    }
}
