package Java_OOPS.Object_Modelling;

import java.util.*;

class Course {
    String courseName;
    List<Student> students = new ArrayList<>();
    Course(String courseName) { this.courseName = courseName; }

    void enroll(Student s) {
        students.add(s);
        s.courses.add(this);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) System.out.println(s.name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String name) { this.name = name; }

    void showCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses) System.out.println(c.courseName);
    }
}

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();
    School(String schoolName) { this.schoolName = schoolName; }
    void addStudent(Student s) { students.add(s); }
}

public class SchoolTest {
    public static void main(String[] args) {
        School sch = new School("Springfield High");
        Student s1 = new Student("Tom");
        Student s2 = new Student("Jerry");

        sch.addStudent(s1);
        sch.addStudent(s2);

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        c1.enroll(s1);
        c2.enroll(s1);
        c2.enroll(s2);

        s1.showCourses();
        c2.showStudents();
    }
}
