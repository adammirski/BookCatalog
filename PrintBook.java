public  class PrintBook extends Book {
    private int numPages;

        public PrintBook(String title, String author, String isbn, int year, int numPages) {
        super(title, author, isbn, year);
        this.numPages = numPages;
    }

        

    @Override
public void displayInfo() {
    System.out.println("==========================================================================================");
    // Fixed the header to match the data
    System.out.printf("%-20s %-20s %-11s %-6s %-6s %-15s %n", "Title", "Author", "ISBN", "Year", "Pages", "Type");
    
    // Ensure the data row aligns with the header
    System.out.printf("%-20s %-20s %-11s %-6d %-6d %-15s %n", 
        getTitle(), 
        getAuthor(), 
        getIsbn(), 
        getYear(), 
        numPages, 
        "PrintedBook");
    
        System.out.println("============================================================================================");
}

        public int getNumPages() {
        return numPages;
    }



    public void setNumPages(int numPages) {
        this.numPages = numPages;
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
    

