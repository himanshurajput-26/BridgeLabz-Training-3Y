package Java_OOPS.Level1;

class Book {
    private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public void displayDetails() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
    }


    public static void main(String[] args) {
        Book b1 = new Book("2 States", "Chetan Bhagat", 500);
        Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 500);
        b1.displayDetails();
        b2.displayDetails();
    }
}