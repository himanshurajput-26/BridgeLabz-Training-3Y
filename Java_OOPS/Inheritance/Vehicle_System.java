package Java_OOPS.Inheritance;

// Interface for refuelable vehicles
interface Refuelable {
    void refuel();
}

// Superclass for all vehicles
class Vehicle2 {
    int maxSpeed;
    String model;

    Vehicle2(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void showInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Subclass for electric vehicles
class ElectricVehicle extends Vehicle2 {
    int batteryLevel;

    ElectricVehicle(int maxSpeed, String model, int batteryLevel) {
        super(maxSpeed, model);
        this.batteryLevel = batteryLevel;
    }

    void charge() {
        System.out.println("Charging battery to 100%...");
        batteryLevel = 100;
    }

    void showElectricStatus() {
        showInfo();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}

// Subclass for petrol vehicles implementing Refuelable
class PetrolVehicle extends Vehicle2 implements Refuelable {
    double fuelLevel;

    PetrolVehicle(int maxSpeed, String model, double fuelLevel) {
        super(maxSpeed, model);
        this.fuelLevel = fuelLevel;
    }

    public void refuel() {
        System.out.println("Refueling petrol tank to full...");
        fuelLevel = 100.0;
    }

    void showPetrolStatus() {
        showInfo();
        System.out.println("Fuel Level: " + fuelLevel + "%");
    }
}

// Main class to test the system
public class Vehicle_System {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 80);
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City", 60.5);

        System.out.println("Electric Vehicle:");
        ev.showElectricStatus();
        ev.charge();
        ev.showElectricStatus();

        System.out.println("\nPetrol Vehicle:");
        pv.showPetrolStatus();
        pv.refuel();
        pv.showPetrolStatus();
    }
}
