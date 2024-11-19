/*How Extended Classes Are Used in This Program

	1.	Base Class (Book):
	
The program defines an abstract class called Book. This class contains properties common to all types of books, such as title, author, isbn, and year, and declares abstract methods like displayInfo() and performAction().

The Book class is abstract, meaning it cannot be instantiated directly. It serves as a base class that other specific book types will inherit from.
	
	2.	Extended (Subclass) Classes:
	•	The program defines three classes that extend the Book class:
	•	PrintBook: Represents a physical book with an additional attribute, numPages, which stores the number of pages.
	•	EBook: Represents an electronic book with an additional attribute, fileSizeMB, to store the file size in megabytes.
	•	AudioBook: Represents an audiobook with an additional attribute, durationMinutes, which stores the length of the audiobook in minutes.
	•	Each of these subclasses inherits the common properties and methods from Book, and they override the abstract methods (displayInfo() and performAction()) to provide specific behavior for each book type.


Summary of Extended Classes in the Program

Inheritance is used to create PrintBook, EBook, and AudioBook as extended classes from the base class Book.

Each subclass inherits properties and methods from Book but overrides methods to provide behavior specific to each book type.

This design allows the program to handle different types of books in a unified way (e.g., storing them in a single BookCatalog list) while allowing each type of book to have unique details and behaviors.

Example of Inheritance in the Program*/
import java.time.LocalDate;

public class BookCatalog{
    public static void main(String[] args) {
        Book book1 = new AudioBook("audiobooktitle",new Author("artistsname",LocalDate.of(1993,5,19)),"3464643",1990,1000);
        Book book2 = new EBook("audiobooktitle",new Author("artistsname",LocalDate.of(1993,5,19)),"3464643",1990,1024);
        Book book3 = new PrintBook("audiobooktitle",new Author("artistsname",LocalDate.of(1993,05,19)),"3464643",1990,5);
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

    }
    public static class Author{
        private String artistName;
        private LocalDate dob;

        public Author(String artistName, LocalDate dob) {
            this.artistName = artistName;
            this.dob = dob;
        }

        public String getArtistName() {
            return artistName;
        }

        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }

        public LocalDate getDob() {
            return dob;
        }

        public void setDob(LocalDate dob) {
            this.dob = dob;
        }

    }
    static abstract class Book {
        // Common fields and methods for all books
        private String title;
        private Author author;
        private String isbn;
        private int year;

        public Book(String title, BookCatalog.Author author, String isbn, int year) {
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
    }

      public static class PrintBook extends Book {
        private int numPages;

        public PrintBook(String title, BookCatalog.Author author, String isbn, int year, int numPages) {
            super(title, author, isbn, year);
            this.numPages = numPages;
        }

        @Override
        public void displayInfo() {
            System.out.println("This is a Printed Book");
            // Specific implementation for PrintBook
        }

        @Override
        public void performAction() {
            // Specific action for PrintBook
        }
    }

    public static class EBook extends Book {
        private double fileSizeMB;

        public EBook(String title, BookCatalog.Author author, String isbn, int year, double fileSizeMB) {
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

    public static class AudioBook extends Book {
        private int durationMinutes;

        public AudioBook(String title, BookCatalog.Author author, String isbn, int year, int durationMinutes) {
            super(title, author, isbn, year);
            this.durationMinutes = durationMinutes;
        }

        @Override
        public void displayInfo() {
            System.out.println("This is an AudioBook");
            // Specific implementation for AudioBook
        }

        @Override
        public void performAction() {
            // Specific action for AudioBook
        }
    }
    
    }