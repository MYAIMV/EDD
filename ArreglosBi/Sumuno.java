package ArreglosBi;

public class Sumuno {
    public static void main(String[] args) throws Exception {

        int[][] arrTest = {
                {1, 3, 7, 8},
                {0, 6, 3, 1},
                {1, 2, 3, 4},
                {0, 5, 3, 0},
                {2, 5, 9, 0}
        };
        int sumatoria = 0;

        for (int i = 0; i < arrTest.length; i++) {
            for (int j = 0; j < arrTest[i].length; j++) {
                sumatoria += arrTest[i][j];
            }
        }

        System.out.println("la sumatoria de todos es " + sumatoria);

        sumatoria = 0;

        for (int [] fila : arrTest){
            for (int elemento: fila){
                sumatoria+=elemento;
            }
        }
        System.out.println("con  for each es " + sumatoria);
    }

}
