package Java_OOPS.Object_Modelling;

import java.util.*;

class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title; this.author = author;
    }
    void display() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String name;
    List<Book> books = new ArrayList<>();

    Library(String name) { this.name = name; }

    void addBook(Book b) { books.add(b); }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) b.display();
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("C++ Guide", "Bjarne Stroustrup");

        Library lib = new Library("City Library");
        lib.addBook(b1);
        lib.addBook(b2);

        lib.showBooks();
    }
}
