import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516; // 1 square inch = 6.4516 cm²

        System.out.println("Area of triangle in square inches: " + areaInches +
                " and in square centimeters: " + areaCm);
    }
}
