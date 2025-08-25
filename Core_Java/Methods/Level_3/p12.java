package Level_3;

import java.util.Scanner;

public class p12 {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope (m) and y-intercept (b) of the line
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m, b;
        if (x2 - x1 != 0) { // Avoid division by zero
            m = (y2 - y1) / (x2 - x1);
            b = y1 - m * x1;
        } else { // Vertical line case
            m = Double.POSITIVE_INFINITY;
            b = Double.NaN; // y-intercept does not exist for vertical line
        }
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between points: %.2f\n", distance);

        // Calculate line equation
        double[] equation = lineEquation(x1, y1, x2, y2);
        if (Double.isInfinite(equation[0])) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", equation[0], equation[1]);
        }

        sc.close();
    }
}
