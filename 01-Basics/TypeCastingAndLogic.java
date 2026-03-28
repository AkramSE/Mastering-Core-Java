/**
 * Demonstrates Data Type resulting, Explicit Type Casting, 
 * and a simple logic puzzle (Encrypting/Decrypting a Grade).
 */
public class TypeCastingAndLogic {
    public static void main(String[] args) {
        
        // 1. Resulting Data Type Evaluation
        int intEvaluation = 7 / 4 * 9 / 2; 
        float floatEvaluation = 7 / 4.0f * 9 / 2.0f; 
        
        System.out.println("Integer Evaluation (7/4 * 9/2): " + intEvaluation);
        System.out.println("Float Evaluation (7/4.0f * 9/2.0f): " + floatEvaluation);

        System.out.println("\nGrade Encryptor/Decryptor:");
        // 2. Encrypting a grade by casting
        char grade = 'B'; 
        grade = (char)(grade + 8); 
        System.out.println("Encrypted Grade: " + grade); 
        
        // Decrypting the grade
        grade = (char)(grade - 8); 
        System.out.println("Decrypted Grade: " + grade); 
    }
}
