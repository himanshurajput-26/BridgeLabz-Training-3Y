package Java_OOPS.Level2;

// MovieTicket.java
class MovieTicket {
    String movieName;
    String theaterName;
    double price;

    MovieTicket(String movieName, String theaterName, double price) {
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.price = price;
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Theater: " + theaterName);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("KGF 3", "PVR Cinemas", 250);
        MovieTicket t2 = new MovieTicket("Avengers", "INOX", 300);

        t1.displayTicket();
        t2.displayTicket();
    }
}
