import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Complete Demonstration of File Handling in Java (CRUD Operations).
 * Create, Read, Update/Write, and Delete files using java.io classes.
 */
public class FileOperationsDemo {
    public static void main(String[] args) {
        
        String fileName = "cwh_file.txt";
        File myFile = new File(fileName);

        // 1. CREATING A FILE
        try {
            if (myFile.createNewFile()) {
                System.out.println("✅ File created successfully: " + myFile.getName());
            } else {
                System.out.println("⚠️ File already exists.");
            }
        } catch (IOException e) {
            System.out.println("❌ Unable to create this file.");
            e.printStackTrace();
        }

        // 2. WRITING TO A FILE
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Hello Akram! Welcome to File Handling in Java.\n");
            fileWriter.write("Keep learning, Keep coding!\n");
            fileWriter.close(); // IMPORTANT: Always close the writer!
            System.out.println("✅ Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. READING FROM A FILE
        System.out.println("\n--- Reading File Content ---");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found!");
            e.printStackTrace();
        }

        // 4. DELETING A FILE
        // (Uncomment the lines below to test deletion)
        /*
        System.out.println("\n--- Deleting File ---");
        if (myFile.delete()) {
            System.out.println("✅ Deleted the file: " + myFile.getName());
        } else {
            System.out.println("❌ Failed to delete the file.");
        }
        */
    }
}
