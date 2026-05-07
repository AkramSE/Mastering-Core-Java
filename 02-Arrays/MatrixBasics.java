import java.util.Arrays;

/**
 * Project: 2D Arrays / Matrices Concepts
 * Description: Demonstrates basic matrix traversal and Linear Search.
 */
public class MatrixBasics {

    /**
     * Performs a linear search on a 2D matrix to find a specific key.
     * Time Complexity: O(N * M) where N is rows and M is columns.
     * Space Complexity: O(1) as no extra space is used.
     */
    public static boolean search(int[][] matrix, int key) {
        // Edge case: Empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Linear search: checking each cell (row, col)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(" Key " + key + " found at cell: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        
        System.out.println("Key " + key + " not found in the matrix.");
        return false;
    }

    public static void main(String[] args) { 
    
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        
        System.out.println("--- Matrix Structure ---");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\n--- Search Operations ---");
        search(matrix, 50);
        search(matrix, 100);
    }
}
