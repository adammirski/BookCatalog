import java.time.LocalDate;
import java.util.Scanner;

public class GroupProject2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookCatalog booklog = new BookCatalog();

        // Add books to the catalog
        Book book1 = new AudioBook("audiobooktitle", new Author("Authorname", LocalDate.of(1993, 5, 19)), "3464643", 1990, 1000);
        //Book book2 = new EBook("Ebooktitel", new Author("Authorname", LocalDate.of(1993, 5, 19)), "34343", 1993, 1024);
        Book book3 = new PrintBook("printedbooktitle", new Author("Authorname", LocalDate.of(1993, 5, 19)), "3464643", 1990, 5);

        booklog.add(book1);
       // booklog.add(book2);
        booklog.add(book3);

        // Search for a book by title
        System.out.print("Enter book title to search for: ");
        String searchTitle = scanner.nextLine();
        booklog.searchBook(searchTitle);

        // Print all books in the catalog
        // booklog.printDetails();

        // Close the Scanner
        scanner.close();
    }
}
