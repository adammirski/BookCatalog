
import java.time.LocalDate;


public class GroupProject2 {
    public static void main(String[] args) {
        
        BookCatalog booklog = new BookCatalog();
        Book book1 = new AudioBook("audiobooktitle",new Author("Authorname",LocalDate.of(1993,5,19)),"3464643",1990,1000);
        Book book2 = new EBook("Ebooktitel",new Author("Authorname",LocalDate.of(1993,5,19)),"34343",1993,1024.0); 
        Book book3 = new PrintBook("printedbooktitle",new Author("Authorname",LocalDate.of(1993,05,19)),"3464643",1990,5);
        
        booklog.add(book1);
        booklog.add(book2);
        booklog.add(book3);
        booklog.printDetails();

    }
    
}
