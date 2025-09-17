package Java_OOPS.Encapsulation;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class VehicleR {
    private String vehicleId, driverName;
    private double ratePerKm;

    public VehicleR(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId; this.driverName = driverName; this.ratePerKm = ratePerKm;
    }

    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle: " + vehicleId + ", Driver: " + driverName);
    }

    public abstract double calculateFare(double distance);
}

class CarR extends VehicleR implements GPS {
    private String location = "Unknown";
    public CarR(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return distance * getRatePerKm(); }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String loc) { location = loc; }
}

class BikeR extends VehicleR implements GPS {
    private String location = "Unknown";
    public BikeR(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return distance * getRatePerKm(); }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String loc) { location = loc; }
}

class AutoR extends VehicleR implements GPS {
    private String location = "Unknown";
    public AutoR(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return distance * getRatePerKm(); }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String loc) { location = loc; }
}

public class RideHailingTest {
    public static void main(String[] args) {
        VehicleR v1 = new CarR("C101", "Alice", 15);
        VehicleR v2 = new BikeR("B101", "Bob", 10);
        VehicleR v3 = new AutoR("A101", "Charlie", 12);

        for (VehicleR v : new VehicleR[]{v1, v2, v3}) {
            v.getVehicleDetails();
            System.out.println("Fare for 10km: " + v.calculateFare(10));
            if (v instanceof GPS) {
                ((GPS)v).updateLocation("Downtown");
                System.out.println("Current Location: " + ((GPS)v).getCurrentLocation());
            }
            System.out.println();
        }
    }
}
