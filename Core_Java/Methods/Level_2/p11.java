package Level_2;

import java.util.Scanner;

public class p11 {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        if (delta < 0) return new double[]{}; // no real roots
        else if (delta == 0) return new double[]{-b / (2*a)};
        else return new double[]{(-b + Math.sqrt(delta)) / (2*a), (-b - Math.sqrt(delta)) / (2*a)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: "); double a = sc.nextDouble();
        System.out.print("Enter b: "); double b = sc.nextDouble();
        System.out.print("Enter c: "); double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) System.out.println("No real roots");
        else System.out.print("Roots: ");
        for (double r : roots) System.out.print(r + " ");
    }
}

