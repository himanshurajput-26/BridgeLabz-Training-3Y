package Java_OOPS.Encapsulation;

import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id; this.name = name; this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private int days;
    private double dailyRate;

    public InPatient(int id, String name, int age, int days, double rate) {
        super(id, name, age); this.days = days; this.dailyRate = rate;
    }

    @Override
    public double calculateBill() { return days * dailyRate; }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { System.out.println(records); }
}

class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age); this.consultationFee = fee;
    }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { System.out.println(records); }
}

public class HospitalTest {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Alice", 30, 5, 2000);
        Patient p2 = new OutPatient(2, "Bob", 25, 500);

        for (Patient p : new Patient[]{p1, p2}) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                ((MedicalRecord)p).addRecord("Checkup done.");
                ((MedicalRecord)p).viewRecords();
            }
            System.out.println();
        }
    }
}
