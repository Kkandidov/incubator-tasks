import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UtilMatrix {

    // range of max and min random number
    public static final int MIN = 0;
    public static final int MAX = 10;

    private static Random random = new Random();

    public static int[][] generateMatrix(int rowsCount, int columnsCount) {
        int[][] matrix = new int[rowsCount][columnsCount];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(MAX - MIN) + MIN;
            }
        }
        return matrix;
    }

    public static void showMatrix(int[][] matrix) {
        StringBuilder builder = new StringBuilder();
        for (int[] i : matrix) {
            builder.append("[");
            for (int j : i) {
                builder.append(j).append(", ");
            }
            builder.delete(builder.length() - 2, builder.length() - 1).append("]\n");
        }
        System.out.println(builder);
    }

    public static int[][] multiplySingleThreaded(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int l = 0; l < matrix2.length; l++) {
                    result[i][j] += matrix1[i][l] * matrix2[l][j];
                }
            }
        }
        return result;
    }

    public static int[][] multiplyMultiThreaded(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int k = matrix2[0].length;

        int[][] result = new int[n][k];

        // creating the pool
        ExecutorService executor = Executors.newFixedThreadPool(n * k);


        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                executor.execute(new Value(matrix1, matrix2, result, i, j));
            }
        }
        executor.shutdown();
        return result;
    }

    private static class Value implements Runnable {
        int[][] matrix1;
        int[][] matrix2;
        int[][] result;
        int i;
        int j;

        public Value(int[][] matrix1, int[][] matrix2, int[][] result, int i, int j) {
            this.matrix1 = matrix1;
            this.matrix2 = matrix2;
            this.result = result;
            this.i = i;
            this.j = j;
        }

        @Override
        public void run() {
            for (int l = 0; l < matrix2.length; l++) {
                result[i][j] += matrix1[i][l] * matrix2[l][j];
            }
        }
    }
}
