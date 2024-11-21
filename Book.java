public abstract class Book implements Comparable<Book>{
    private String title;
        private String author;
        private String isbn;
        private int year;

        public Book(String title, String author, String isbn, int year) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.year = year;
        }
        public abstract void displayInfo();
        public abstract void performAction();
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public String getIsbn() {
            return isbn;
        }
        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
        
        public int compareTo(Book other) {
            
            return String.CASE_INSENSITIVE_ORDER.compare(this.getTitle(), other.getTitle());

        }
    }

      

