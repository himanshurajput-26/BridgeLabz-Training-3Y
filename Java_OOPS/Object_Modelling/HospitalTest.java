package Java_OOPS.Object_Modelling;

import java.util.*;

class Patient {
    String name;
    Patient(String name) { this.name = name; }
}

class Doctor {
    String name;
    Doctor(String name) { this.name = name; }
    void consult(Patient p) {
        System.out.println("Doctor " + name + " consults " + p.name);
    }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) { this.name = name; }

    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }
}

public class HospitalTest {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Alice");
        Patient p1 = new Patient("John");
        h.addDoctor(d1);
        h.addPatient(p1);
        d1.consult(p1);
    }
}
