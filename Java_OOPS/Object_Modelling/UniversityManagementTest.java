package Java_OOPS.Object_Modelling;

import java.util.*;

class CourseU {
    String courseName;
    Professor professor;
    List<StudentU> students = new ArrayList<>();
    CourseU(String courseName) { this.courseName = courseName; }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println(p.name + " assigned to " + courseName);
    }

    void enrollStudent(StudentU s) {
        students.add(s);
        s.courses.add(this);
        System.out.println(s.name + " enrolled in " + courseName);
    }
}

class StudentU {
    String name;
    List<CourseU> courses = new ArrayList<>();
    StudentU(String name) { this.name = name; }
    void enrollCourse(CourseU c) { c.enrollStudent(this); }
}

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

public class UniversityManagementTest {
    public static void main(String[] args) {
        CourseU c1 = new CourseU("OOP");
        CourseU c2 = new CourseU("DBMS");

        Professor p1 = new Professor("Dr. Adams");
        c1.assignProfessor(p1);

        StudentU s1 = new StudentU("Alice");
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
    }
}
