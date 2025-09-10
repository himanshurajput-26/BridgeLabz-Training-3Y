package Java_OOPS.Level2;

// Student.java
class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ramesh", 101, 87.5);
        Student s2 = new Student("Suresh", 102, 76.4);
        Student s3 = new Student("Priya", 103, 92.0);

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
    }
}
