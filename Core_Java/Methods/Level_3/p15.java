package Level_3;

import java.util.Random;
import java.util.Scanner;

public class p15 {
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // values 0–9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    // Method to find transpose
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] trans = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    // Method to calculate determinant of 2x2
    public static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Method to calculate determinant of 3x3
    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Method to find inverse of 2x2
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) throw new ArithmeticException("Matrix not invertible!");

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }

    // Method to find inverse of 3x3
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) throw new ArithmeticException("Matrix not invertible!");

        double[][] inv = new double[3][3];

        // Cofactor matrix
        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double)det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double)det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double)det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double)det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double)det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double)det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double)det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double)det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double)det;

        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        int[][] matrix = createMatrix(n, n);

        // Display matrix
        System.out.println("\nMatrix:");
        printMatrix(matrix);

        // Transpose
        System.out.println("\nTranspose:");
        printMatrix(transpose(matrix));

        if (n == 2) {
            // Determinant 2x2
            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant = " + det);

            // Inverse 2x2
            try {
                System.out.println("\nInverse:");
                printMatrix(inverse2x2(matrix));
            } catch (ArithmeticException e) {
                System.out.println("Matrix not invertible!");
            }
        } else if (n == 3) {
            // Determinant 3x3
            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant = " + det);

            // Inverse 3x3
            try {
                System.out.println("\nInverse:");
                printMatrix(inverse3x3(matrix));
            } catch (ArithmeticException e) {
                System.out.println("Matrix not invertible!");
            }
        } else {
            System.out.println("Only 2x2 and 3x3 matrices supported!");
        }

        sc.close();
    }
}
