package Java_OOPS.Object_Modelling;

import java.util.*;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
    void show() { System.out.println("Employee: " + name); }
}

class Department {
    String deptName;
    List<Employee> employees = new ArrayList<>();

    Department(String deptName) { this.deptName = deptName; }

    void addEmployee(Employee e) { employees.add(e); }

    void show() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) e.show();
    }
}

class Company {
    String companyName;
    List<Department> depts = new ArrayList<>();

    Company(String companyName) { this.companyName = companyName; }

    void addDepartment(Department d) { depts.add(d); }

    void show() {
        System.out.println("Company: " + companyName);
        for (Department d : depts) d.show();
    }
}

public class CompanyTest {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Charlie"));

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.show();
    }
}
