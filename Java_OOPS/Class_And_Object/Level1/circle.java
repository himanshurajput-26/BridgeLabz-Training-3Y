package Java_OOPS.Level1;

class Circle {
    private double radius;


    public Circle(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius must be non-negative");
        this.radius = radius;
    }


    public double getArea() { return Math.PI * radius * radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }


    public void display() {
        System.out.printf("Area of circle: %.4f\n", getArea());
        System.out.printf("Circumference of circle: %.4f\n", getCircumference());
    }


    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        c.display();
    }
}