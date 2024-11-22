import java.util.Scanner;

/**
 * LibraryUI
 * 
 * This program provides a user interface for managing a library catalog.
 * It allows users to perform various actions such as adding, removing,
 * searching, sorting, and marking books as read. The catalog supports
 * different types of books: PrintBook, EBook, and AudioBook.
 */
public class LibraryUI {
    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog(); // Create an instance of the BookCatalog
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        boolean exit = false;

        // Prepopulate the catalog with five predefined books
        bookCatalog.booklog.add(new PrintBook("1984", "George Orwell", "123456789", 1949, 328));
        bookCatalog.booklog.add(new PrintBook("Catch-22", "Joseph Heller", "987654321", 1961, 453));
        bookCatalog.booklog.add(new EBook("Sapiens", "Yuval Noah Harari", "567890123", 2011, 157));
        bookCatalog.booklog.add(new AudioBook("Becoming", "Michelle Obama", "345678901", 2018, 1140));
        bookCatalog.booklog.add(new PrintBook("To Kill a Mockingbird", "Harper Lee", "192837465", 1960, 281));

        System.out.println("=== Welcome to the Library Management System ===");

        // Main menu loop
        while (!exit) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Print the Catalog");
            System.out.println("2. Add a Book");
            System.out.println("3. Remove a Book");
            System.out.println("4. Search for a Book");
            System.out.println("5. Mark a Book as Read");
            System.out.println("6. Sort the Catalog");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt(); // Get the user's choice
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Print the details of all books in the catalog
                    System.out.println("=== Book Catalog ===");
                    bookCatalog.printDetails();
                    break;

                case 2:
                    // Add a new book to the catalog
                    bookCatalog.addBook();
                    break;

                case 3:
                    // Remove a book from the catalog by ISBN
                    int result = bookCatalog.removeBook();
                    if (result == 0) {
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Failed to remove book.");
                    }
                    break;

                case 4:
                    // Search for a book by title
                    bookCatalog.searchBook();
                    break;

                case 5:
                    // Mark a book as read
                    bookCatalog.markAsRead();
                    break;

                case 6:
                    // Sort the catalog alphabetically by title
                    bookCatalog.sortBooks();
                    System.out.println("Catalog sorted alphabetically by title.");
                    break;

                case 7:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    break;

                default:
                    // Handle invalid menu choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close(); // Close the scanner to free resources
    }
}