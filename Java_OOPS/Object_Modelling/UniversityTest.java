package Java_OOPS.Object_Modelling;

import java.util.*;

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

class DepartmentU {
    String deptName;
    DepartmentU(String deptName) { this.deptName = deptName; }
}

class University {
    String uniName;
    List<DepartmentU> depts = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String uniName) { this.uniName = uniName; }

    void addDepartment(DepartmentU d) { depts.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }

    void show() {
        System.out.println("University: " + uniName);
        System.out.println("Departments:");
        for (DepartmentU d : depts) System.out.println(d.deptName);
        System.out.println("Faculties:");
        for (Faculty f : faculties) System.out.println(f.name);
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        University u = new University("MIT");
        u.addDepartment(new DepartmentU("CS"));
        u.addDepartment(new DepartmentU("Physics"));
        u.addFaculty(new Faculty("Dr. Smith"));
        u.addFaculty(new Faculty("Dr. Johnson"));
        u.show();
    }
}
