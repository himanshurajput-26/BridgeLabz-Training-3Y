package Level_2;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        // Convert number to string for digit processing
        String numStr = Long.toString(Math.abs(number)); // Handle negative numbers also
        int length = numStr.length();

        // Array to store digits
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        // Frequency array of size 10 (for digits 0–9)
        int[] frequency = new int[10];

        for (int digit : digits) {
            frequency[digit]++;
        }

        // Display frequencies
        System.out.println("Digit frequencies in number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
