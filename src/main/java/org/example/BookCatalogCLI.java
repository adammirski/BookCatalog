package org.example;
import org.example.BookCatalog;
import java.util.Scanner;

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
                    catalog.addBook();
                    break;

                case 2:
                    System.out.print("Enter book ISBN to remove: ");
                    String removeIsbn = scanner.nextLine();
                    catalog.removeBook(removeIsbn);
                    break;

                case 3:
                    catalog.printCatalog();
                    System.out.println("Catalog printed to console.");
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
}