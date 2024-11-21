import java.util.ArrayList;

public class BookCatalog {

    ArrayList<Book> booklog;

    public BookCatalog() {
        booklog = new ArrayList<Book>();
    }

    /***************searchBook()****************
     *The method iterates over a list of Book objs
     *(booklog) but the booklog list can store objs
     *of any class that extends Book bc of polymorphism.
     *********************************************/
    public Book searchBook(String title) {
        for (Book book : booklog) {
            if (book.getTitle().equalsIgnoreCase(title)) { // case insensitive
                System.out.println("Book found:");
                book.displayInfo();
                return book;
            }
        }
        System.out.println("Book '" + title + "' not found.");
        return null;
    }

    // add book
    public void add(Book book) {
        booklog.add(book);
    }

    // remove book

    // search by name
    public void printDetails() {
        for (Book b : booklog) {
            b.displayInfo();
        }
    }

}
