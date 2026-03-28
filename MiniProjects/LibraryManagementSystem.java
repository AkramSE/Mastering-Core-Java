import java.util.Scanner; 
/**
 * An Interactive Library Management System Mini Project.
 * Features a Command Line Interface (CLI) menu for users.
 */

class Library {
    String[] books;

    Library() {
        this.books = new String[100]; // Library capacity is 100 books
    }

    // SMART ADDBOOK: Khali jagah dhoond kar wahan book rakhega
    void addBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                System.out.println("✅ '" + book + "' has been successfully added to the library!");
                return;
            }
        }
        System.out.println("❌ Sorry, the library is completely full!");
    }

    void showAvailableBooks() {
        System.out.println("\n📚 Available Books in the Library:");
        boolean isEmpty = true;
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println(" * " + book);
            isEmpty = false;
        }
        if (isEmpty) {
            System.out.println("   [No books currently available]");
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equalsIgnoreCase(book)) {
                System.out.println("\n📖 '" + this.books[i] + "' has been issued successfully!");
                this.books[i] = null; // Removing the book from available array
                return;
            }
        }
        System.out.println("\n❌ Sorry, '" + book + "' does not exist or is already issued.");
    }

    void returnBook(String book) {
        System.out.println("\n🔙 Returning '" + book + "'...");
        addBook(book); // Adding the book back to the first available slot
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library centralLibrary = new Library();
        
        while (true) {
            System.out.println("\n=====================================");
            System.out.println("=== Welcome to the Central Library ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Add a New Book");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.println("=====================================");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // To consume the newline character after integer input

            switch (choice) {
                case 1:
                    centralLibrary.showAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter the name of the book you want to add: ");
                    String bookToAdd = sc.nextLine();
                    centralLibrary.addBook(bookToAdd);
                    break;
                case 3:
                    System.out.print("Enter the name of the book you want to issue: ");
                    String bookToIssue = sc.nextLine();
                    centralLibrary.issueBook(bookToIssue);
                    break;
                case 4:
                    System.out.print("Enter the name of the book you want to return: ");
                    String bookToReturn = sc.nextLine();
                    centralLibrary.returnBook(bookToReturn);
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using the Central Library! 📚");
                    sc.close();
                    System.exit(0); // Closes the application
                default:
                    System.out.println("Invalid choice! Please select an option from 1 to 5.");
            }
        }
    }
}
