package Java_OOPS.Encapsulation;

import java.util.*;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() { return getBaseSalary(); }

    @Override
    public void assignDepartment(String deptName) { this.department = deptName; }

    @Override
    public String getDepartmentDetails() { return "Department: " + department; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate; this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() { return hoursWorked * hourlyRate; }

    @Override
    public void assignDepartment(String deptName) { this.department = deptName; }

    @Override
    public String getDepartmentDetails() { return "Department: " + department; }
}

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 50000);
        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 200, 80);

        fte.assignDepartment("IT");
        pte.assignDepartment("Support");

        employees.add(fte);
        employees.add(pte);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Salary: " + e.calculateSalary());
            if (e instanceof Department) {
                System.out.println(((Department)e).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
