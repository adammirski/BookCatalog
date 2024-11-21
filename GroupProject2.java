


public class GroupProject2 {
    public static void main(String[] args) {
        
        BookCatalog booklog = new BookCatalog();
        
        booklog.addBook();
        booklog.addBook();
        booklog.addBook();
        System.out.println("-------------------After adding-------------------------");
        booklog.printDetails();
        System.out.println("--------------------After sorting-----------------------");
        booklog.sortBooks();
        booklog.printDetails();
        booklog.removeBook();
        System.out.println("--------------------After removing-----------------------");
        booklog.printDetails();
        booklog.searchBook();
    }
    
}
