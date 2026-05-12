import java.util.Scanner;

/**
 * A professional implementation of Matrix Addition.
 * Suitable for GitHub portfolios and academic projects.
 */
public class MatrixManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix dimensions input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] sumResult = new int[rows][cols];

        // Input for Matrix A
        System.out.println("\nEnter elements for Matrix A:");
        fillMatrix(sc, matrixA);

        // Input for Matrix B
        System.out.println("\nEnter elements for Matrix B:");
        fillMatrix(sc, matrixB);

        // Adding matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumResult[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Display results
        System.out.println("\n--- Resulting Sum Matrix ---");
        displayMatrix(sumResult);

        sc.close();
    }

    private static void fillMatrix(Scanner sc, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
              }
