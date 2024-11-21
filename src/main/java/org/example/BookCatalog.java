package org.example;/*How Extended Classes Are Used in This Program

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

This design allows the program to handle different types of books in a unified way (e.g., storing them in a single org.example.BookCatalog list) while allowing each type of book to have unique details and behaviors.

Example of Inheritance in the Program*/

import java.util.ArrayList;
import java.util.Scanner;

public class BookCatalog{
    private ArrayList<Book> books;
    BookCatalog(){
        books = new ArrayList<Book>();
    }

    public void addBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type of book: ");
        System.out.println("1. Print book");
        System.out.println("2. eBook");
        System.out.println("3. Audiobook");
        System.out.println("Enter selection: ");
        int book_type = input.nextInt();
        input.nextLine();



        System.out.print("Enter Title: ");
        String title = input.nextLine();
        System.out.print("Enter Author: ");
        String author = input.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = input.nextLine();
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        input.nextLine();

        int pages = 0;
        double file_size = 0;
        int duration = 0;

        switch (book_type) {
            case 1:
                System.out.print("Enter number of pages: ");
                pages = input.nextInt();
                books.add(new PrintBook(title,author,isbn,year,pages));
                break;
            case 2:
                System.out.print("Enter file size(MB): ");
                file_size = input.nextDouble();
                books.add(new EBook(title,author,isbn,year,pages));
                break;
            case 3:
                System.out.print("Enter duration(minutes): ");
                duration = input.nextInt();
                books.add(new AudioBook(title,author,isbn,year,duration));
                break;

        }
        System.out.println("Book added.");



    }

    public void removeBook(String isbn) {
        for(Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed.");
                return;
            }

        }

        System.out.println("Book not found.");


    }

    public void printCatalog() {
        int bookNum = 1;
        System.out.println("==============================================");
        System.out.printf("%-3s %-20s %-20s %-11s %-6s %n", "#", "Title", "Author", "ISBN", "Year");
        for(Book book : books) {
            System.out.printf("%-3d %-20s %-20s %-11s %-6d %n", bookNum, book.getTitle(), book.getAuthor(), book.getIsbn(), book.getYear());
            bookNum++;
        }
        System.out.println("==============================================");

    }

    static abstract class Book {
        // Common fields and methods for all books
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


    }

    public static class PrintBook extends Book {
        private int numPages;

        public PrintBook(String title, String author, String isbn, int year, int numPages) {
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

        public EBook(String title, String author, String isbn, int year, double fileSizeMB) {
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

        public AudioBook(String title, String author, String isbn, int year, int durationMinutes) {
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