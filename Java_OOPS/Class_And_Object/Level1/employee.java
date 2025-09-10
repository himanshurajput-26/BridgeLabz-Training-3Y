package Java_OOPS.Level1;
class Employee {
    // fields (encapsulated)
    private String name;
    private int id;
    private double salary;


    // constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    // getters
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }


    // display method
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }


    // demo
    public static void main(String[] args) {
        Employee emp = new Employee("Rohan", 1, 500000);
        emp.displayDetails();
    }
}