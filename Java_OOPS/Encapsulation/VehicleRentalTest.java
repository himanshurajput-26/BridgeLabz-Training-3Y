package Java_OOPS.Encapsulation;

import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber, type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber; this.type = type; this.rentalRate = rentalRate;
    }

    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) { super(number, "Car", rate); }

    @Override
    public double calculateRentalCost(int days) { return days * getRentalRate(); }

    @Override
    public double calculateInsurance() { return 5000; }

    @Override
    public String getInsuranceDetails() { return "Car insurance: 5000/year"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) { super(number, "Bike", rate); }

    @Override
    public double calculateRentalCost(int days) { return days * getRentalRate(); }

    @Override
    public double calculateInsurance() { return 1000; }

    @Override
    public String getInsuranceDetails() { return "Bike insurance: 1000/year"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) { super(number, "Truck", rate); }

    @Override
    public double calculateRentalCost(int days) { return days * getRentalRate(); }

    @Override
    public double calculateInsurance() { return 8000; }

    @Override
    public String getInsuranceDetails() { return "Truck insurance: 8000/year"; }
}

public class VehicleRentalTest {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Car("C123", 2000),
                new Bike("B123", 500),
                new Truck("T123", 4000)
        );

        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " Rental for 5 days: " + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable)v;
                System.out.println(ins.getInsuranceDetails() + ", Cost: " + ins.calculateInsurance());
            }
            System.out.println();
        }
    }
}
