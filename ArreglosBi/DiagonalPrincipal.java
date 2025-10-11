package ArreglosBi;

public class DiagonalPrincipal {
    public static void main(String[] args) throws Exception {
        int[][] arrTest = {
                {1, 3, 7, 8},
                {0, 6, 3, 1},
                {1, 2, 3, 4},
                {0, 5, 3, 0},
                {2, 5, 9, 0}
        };
        int sumatoriaExcluyendoDiagonal = 0;
        System.out.println("  Areglo Original");

        for (int i = 0; i < arrTest.length; i++) {
            for (int j = 0; j < arrTest[i].length; j++) {
                System.out.print(arrTest[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arrTest.length; i++) {
            for (int j = 0; j < arrTest[i].length; j++) {
                if (i != j) {
                    sumatoriaExcluyendoDiagonal += arrTest[i][j];
                }
            }
        }

        System.out.println(" diagonal principal 1, 6, 3, 0.");
        System.out.println("La sumatoria total, excluyendo la diagonal principal, es: " + sumatoriaExcluyendoDiagonal);
    }
}

