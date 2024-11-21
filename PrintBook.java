public  class PrintBook extends Book {
    private int numPages;

        public PrintBook(String title, String author, String isbn, int year, int numPages) {
        super(title, author, isbn, year);
        this.numPages = numPages;
    }

        

        @Override
        public void displayInfo() {
            System.out.println("This is a Printed Book");
            System.out.println("Title: " + super.getTitle());
            System.out.println("Author: " + super.getAuthor());
            System.out.println("ISBN: " + super.getIsbn());
            System.out.println("Year: " + super.getYear());
            System.out.println("Number of pages is " + numPages + " pages\n");
            // Specific implementation for PrintBook
        }

        @Override
        public void performAction() {
            // Specific action for PrintBook
        }

        @Override
        public int compareTo(Book other) {
        return this.getTitle().compareTo(other.getTitle());

    }
}
    

