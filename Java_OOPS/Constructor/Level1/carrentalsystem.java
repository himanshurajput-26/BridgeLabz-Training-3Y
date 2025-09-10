package Java_OOPS.Constructor.Level1;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0; // Example rate per day

    // Default constructor
    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Basic Car";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }
}
