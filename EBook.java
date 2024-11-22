public class EBook extends Book {
    private double fileSizeMB;

    public EBook(String title, String author, String isbn, int year, double fileSizeMB) {
        super(title, author, isbn, year);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public void displayInfo() {
        System.out.println("==========================================================================================");
        // Fixed the header to include "File Size" and "Type"
        System.out.printf("%-20s %-20s %-11s %-6s %-10s %-15s %n", "Title", "Author", "ISBN", "Year", "File Size", "Type");
        
        // Ensure the data row aligns with the header
        System.out.printf("%-20s %-20s %-11s %-6d %-10.2f %-15s %n", 
            getTitle(), 
            getAuthor(), 
            getIsbn(), 
            getYear(), 
            fileSizeMB,  // Ensure this is a double
            "EBook");
        
            System.out.println("============================================================================================");
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
