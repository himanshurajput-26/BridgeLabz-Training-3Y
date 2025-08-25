// File Name: P4.java
// Program: Store numbers until user enters 0/negative or max 10, then print total

import java.util.Scanner;

class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        // Sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Print numbers
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nTotal = " + total);
        sc.close();
    }
}
