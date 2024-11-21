public class EBook extends Book {
    private double fileSizeMB;

    public EBook(String title, String author, String isbn, int year, double fileSizeMB) {
        super(title, author, isbn, year);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is an EBook ");
        System.out.println("Title: " + super.getTitle());
        System.out.println("Author: " + super.getAuthor());
        System.out.println("ISBN: " + super.getIsbn());
        System.out.println("Year: " + super.getYear());
        System.out.println("File size is " + fileSizeMB + " minutes\n");
        // Specific implementation for EBook
    }

    @Override
    public void performAction() {
        // Specific action for EBook
    }
    
    @Override
    public int compareTo(Book other) {
        return this.getTitle().compareTo(other.getTitle());

    }
}
