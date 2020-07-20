import java.util.concurrent.TimeUnit;

public class Main {
    // [n x m] x [m, k] = [n, k]
    public static int N = 4;
    public static int M = 3;
    public static int K = 5;

    public static void main(String[] args) throws InterruptedException {

        // first matrix
        int[][] matrix1 = UtilMatrix.generateMatrix(N, M);
        System.out.println("matrix 1: ");
        UtilMatrix.showMatrix(matrix1);

        // second matrix
        int[][] matrix2 = UtilMatrix.generateMatrix(M, K);
        System.out.println("matrix 2: ");
        UtilMatrix.showMatrix(matrix2);

        // result matrix using SingleThread
        int[][] result1 = UtilMatrix.multiplySingleThreaded(matrix1, matrix2);
        System.out.println("result matrix after multiplySingleThreaded(matrix1, matrix2): ");
        UtilMatrix.showMatrix(result1);

        // result matrix using Multiply Threads
        int[][] result2 = UtilMatrix.multiplyMultiThreaded(matrix1, matrix2);

        TimeUnit.MILLISECONDS.sleep(100);

        System.out.println("result matrix after multiplyMultiThreaded(matrix1, matrix2): ");
        UtilMatrix.showMatrix(result2);
    }
}
