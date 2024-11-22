

public  class AudioBook extends Book {
    private int durationMinutes;

    public AudioBook(String title, String author, String isbn, int year, int durationMinutes) {
        super(title, author, isbn, year);
        this.durationMinutes = durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public void displayInfo() {
        System.out.println("==========================================================================================");
        // Fixed the header to include "Duration" and "Type"
        System.out.printf("%-20s %-20s %-11s %-6s %-10s %-15s %n", "Title", "Author", "ISBN", "Year", "Duration", "Type");
        
        // Ensure the data row aligns with the header
        System.out.printf("%-20s %-20s %-11s %-6d %-10d %-15s %n", 
            getTitle(), 
            getAuthor(), 
            getIsbn(), 
            getYear(), 
            durationMinutes, 
            "AudioBook");
        
            System.out.println("============================================================================================");
    }

    @Override
    public void performAction() {
        // Specific action for AudioBook
    }
    
    @Override
    public int compareTo(Book other) {
        return this.getTitle().compareTo(other.getTitle());

    }
}
