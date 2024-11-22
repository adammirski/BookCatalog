import java.util.Scanner;

public class LibraryUI {
    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("=== Welcome to the Library Management System ===");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Print the Catalog");
            System.out.println("2. Add a Book");
            System.out.println("3. Remove a Book");
            System.out.println("4. Search for a Book");
            System.out.println("5. Mark a Book as Read");
            System.out.println("6. Sort the Catalog");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("=== Book Catalog ===");
                    bookCatalog.printDetails();
                    break;

                case 2:
                    bookCatalog.addBook();
                    break;

                case 3:
                    int result = bookCatalog.removeBook();
                    if (result == 0) {
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Failed to remove book.");
                    }
                    break;

                case 4:
                    bookCatalog.searchBook();
                    break;

                case 5:
                    bookCatalog.markAsRead();
                    break;

                case 6:
                    bookCatalog.sortBooks();
                    System.out.println("Catalog sorted alphabetically by title.");
                    break;

                case 7:
                    exit = true;
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
