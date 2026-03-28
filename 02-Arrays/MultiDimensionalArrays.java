/**
 * Demonstration of 2-D Arrays (Matrices) 
 * and Matrix Addition logic.
 */
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        
        // 1. Basic 2-D Array Creation
        System.out.println("1. Basic 2-D Array (Flats):");
        int[][] flats = new int[2][3]; 
        flats[0][0] = 101; flats[0][1] = 102; flats[0][2] = 103; 
        flats[1][0] = 201; flats[1][1] = 202; flats[1][2] = 203; 
        
        for(int i = 0; i < flats.length; i++) {
            for(int j = 0; j < flats[i].length; j++) {
               System.out.print(flats[i][j] + " "); 
            } 
            System.out.println(); 
        }

        // 2. Matrix Addition (Practice 4)
        System.out.println("\n2. Matrix Addition (2x3 Matrices):");
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}}; 
        int[][] mat2 = {{2, 6, 13}, {3, 7, 1}}; 
        int[][] result = new int[2][3]; 
        
        // Adding elements
        for(int i = 0; i < mat1.length; i++) { 
           for(int j = 0; j < mat1[i].length; j++) { 
              result[i][j] = mat1[i][j] + mat2[i][j]; 
           }
        } 
        
        // Printing the resultant matrix 
        for(int i = 0; i < mat1.length; i++) { 
           for(int j = 0; j < mat1[i].length; j++) { 
              System.out.print(result[i][j] + " "); 
           } 
           System.out.println(); 
        }
    }
}
