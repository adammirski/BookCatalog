public class EBook extends Book {
    private double fileSizeMB;

    public EBook(String title, Author author, String isbn, int year, double fileSizeMB) {
        super(title, author, isbn, year);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is an EBook ");
        // Specific implementation for EBook
    }

    @Override
    public void performAction() {
        // Specific action for EBook
    }
}