import java.util.ArrayList;
import java.util.Scanner;

/**
 * Interactive Advanced Library Management System (v2.0).
 * Uses dynamic ArrayLists, Custom Objects (OOP), and Scanner for User Input.
 */

class Book {
    public String name;
    public String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // Overriding toString to print object details nicely
    @Override
    public String toString() {
        return "'" + name + "' by " + author;
    }
}

class MyLibrary {
    public ArrayList<Book> availableBooks; 
    public ArrayList<Book> issuedBooks; // Naya list: Track karne ke liye ke kon si book issue hui hai

    public MyLibrary() {
        this.availableBooks = new ArrayList<>();
        this.issuedBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.availableBooks.add(book);
        System.out.println("✅ Added to library: " + book);
    }

    // Book ko naam se issue karne ki logic
    public void issueBook(String bookName, String issued_to) {
        for (int i = 0; i < availableBooks.size(); i++) {
            Book b = availableBooks.get(i);
            // IgnoreCase taake user chote/bade letters mein naam likhe toh bhi match ho jaye
            if (b.name.equalsIgnoreCase(bookName)) {
                availableBooks.remove(i);
                issuedBooks.add(b); // Issued list mein daal diya
                System.out.println("📖 Book " + b + " successfully issued to " + issued_to);
                return;
            }
        }
        System.out.println("❌ Sorry, the book '" + bookName + "' is not available in the library.");
    }

    // Book ko wapas return karne ki logic
    public void returnBook(String bookName) {
        for (int i = 0; i < issuedBooks.size(); i++) {
            Book b = issuedBooks.get(i);
            if (b.name.equalsIgnoreCase(bookName)) {
                issuedBooks.remove(i);
                availableBooks.add(b); // Wapas available list mein daal diya
                System.out.println("🔙 Successfully returned: " + b);
                return;
            }
        }
        System.out.println("❌ Error: This book was not issued from our library!");
    }
    
    public void showAvailableBooks() {
        System.out.println("\n📚 Available Books in Library:");
        if (availableBooks.isEmpty()) {
            System.out.println(" - [Library is currently empty]");
            return;
        }
        for (Book b : availableBooks) {
            System.out.println(" - " + b);
        }
        System.out.println();
    }
}

public class AdvancedLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLibrary centralLibrary = new MyLibrary();
        
        // Initializing library with some default books
        centralLibrary.addBook(new Book("Algorithms", "CLRS"));
        centralLibrary.addBook(new Book("Clean Code", "Robert C. Martin"));
        centralLibrary.addBook(new Book("Head First Java", "Kathy Sierra"));

        while (true) {
            System.out.println("\n=====================================");
            System.out.println("=== Advanced Library System v2.0 ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Add a New Book");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.println("=====================================");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Scanner ka buffer clear karne ke liye

            switch (choice) {
                case 1:
                    centralLibrary.showAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter the name of the book: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the author's name: ");
                    String author = sc.nextLine();
                    centralLibrary.addBook(new Book(name, author));
                    break;
                case 3:
                    System.out.print("Enter the name of the book you want to issue: ");
                    String bookToIssue = sc.nextLine();
                    System.out.print("Enter the name of the student: ");
                    String studentName = sc.nextLine();
                    centralLibrary.issueBook(bookToIssue, studentName);
                    break;
                case 4:
                    System.out.print("Enter the name of the book you want to return: ");
                    String bookToReturn = sc.nextLine();
                    centralLibrary.returnBook(bookToReturn);
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using the Advanced Library System! 📚");
                    System.exit(0);
                default:
                    System.out.println("❌ Invalid choice! Please select between 1 and 5.");
            }
        }
    }
        }
                
