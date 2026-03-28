import java.io.FileWriter;
import java.io.IOException;

/**
 * Practical Application of File Handling.
 * Generates a multiplication table dynamically and saves it into a .txt file.
 */
public class TableFileGenerator {
    public static void main(String[] args) {
        int number = 19;
        String table = ""; // Using String (StringBuilder is better for production)

        // Generating the table content
        for (int j = 1; j <= 10; j++) {
            table += number + " X " + j + " = " + (number * j) + "\n";
        }

        // Writing the table to a file
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable_19.txt");
            fileWriter.write(table);
            fileWriter.close();
            System.out.println("✅ Multiplication table of " + number + " has been written to the file successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error while writing to the file.");
            e.printStackTrace();
        }
    }
}
