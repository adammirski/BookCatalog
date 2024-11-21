public abstract class Book {
    private String title;
        private Author author;
        private String isbn;
        private int year;
        private boolean isRead;

        public Book(String title, Author author, String isbn, int year) {
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
        public Author getAuthor() {
            return author;
        }
        public void setAuthor(Author author) {
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
       // added is read and setRead
        public boolean isRead() {
            return isRead;
        }
        public void setRead(boolean read) {
            isRead = read;
        }
    }

      
