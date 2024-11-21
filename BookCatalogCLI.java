/*import java.util.Scanner;

public class BookCatalogCLI {

    public static void main(String[] args) {
        BookCatalog catalog = new BookCatalog();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Book Catalog Management ===");
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book");
            System.out.println("3. Print Catalog");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    catalog.addBook(new Book(title, author, isbn));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.print("Enter book ISBN to remove: ");
                    String removeIsbn = scanner.nextLine();
                    if (catalog.removeBook(removeIsbn)) {
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    catalog.printCatalog();
                    System.out.println("Catalog printed to console and saved to 'catalog.txt'.");
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}*/