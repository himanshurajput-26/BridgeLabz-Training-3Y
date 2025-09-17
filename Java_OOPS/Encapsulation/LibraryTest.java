package Java_OOPS.Encapsulation;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId, title, author;
    private boolean available = true;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId; this.title = title; this.author = author;
    }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public void reserveItem() { setAvailable(false); }

    @Override
    public boolean checkAvailability() { return isAvailable(); }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 7; }

    @Override
    public void reserveItem() { setAvailable(false); }

    @Override
    public boolean checkAvailability() { return isAvailable(); }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 3; }

    @Override
    public void reserveItem() { setAvailable(false); }

    @Override
    public boolean checkAvailability() { return isAvailable(); }
}

public class LibraryTest {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B01", "Java Basics", "James Gosling");
        LibraryItem item2 = new DVD("D01", "Inception", "Christopher Nolan");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days");
        ((Reservable)item1).reserveItem();
        System.out.println("Available: " + ((Reservable)item1).checkAvailability());
        System.out.println();

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days");
    }
}
