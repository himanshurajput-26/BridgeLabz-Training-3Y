package Level_3;

import java.util.Scanner;

public class p10 {
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // To avoid division by zero, compare cross products instead of actual slope values
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method 2: Using area of triangle formula
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 points
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check collinearity using slope method
        if (areCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear using slope method.");
        } else {
            System.out.println("Not collinear using slope method.");
        }

        // Check collinearity using area method
        if (areCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear using area method.");
        } else {
            System.out.println("Not collinear using area method.");
        }

        sc.close();
    }
}
