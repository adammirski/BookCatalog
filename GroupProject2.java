


public class GroupProject2 {
    public static void main(String[] args) {
        
        BookCatalog booklog = new BookCatalog();
        Book book1 = new AudioBook("ZAudiobooktitle","authorone","3464643",1990,1000);
        Book book2 = new EBook("Ebooktitel","twoauthor","34343",1993,1024.0); 
        Book book3 = new PrintBook("Printedbooktitle","Pauthor3","3464643",1990,5);
        
        booklog.add(book1);
        booklog.add(book2);
        booklog.add(book3);
        booklog.printDetails();
        System.out.println("-------------------After adding-------------------------");
        booklog.sortBooks();
        booklog.printDetails();
        System.out.println("--------------------After sorting-----------------------");
        booklog.remove("ebooktitel");
        System.out.println("--------------------After removing-----------------------");
        booklog.printDetails();

    }
    
}
