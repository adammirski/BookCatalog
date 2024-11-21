

public  class AudioBook extends Book {
    private int durationMinutes;

    public AudioBook(String title, String author, String isbn, int year, int durationMinutes) {
        super(title, author, isbn, year);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is an AudioBook");
        System.out.println("Title: " + super.getTitle());
        System.out.println("Author: " + super.getAuthor());
        System.out.println("ISBN: " + super.getIsbn());
        System.out.println("Year: " + super.getYear());
        System.out.println("Duration is " + durationMinutes + " minutes\n");

        // Specific implementation for AudioBook
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
