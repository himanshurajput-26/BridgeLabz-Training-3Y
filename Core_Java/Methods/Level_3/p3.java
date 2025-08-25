package Level_3;

import java.util.Arrays;

public class p3 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits in an array
    public static int[] digitsArray(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        int n = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumDigits(int num) {
        int sum = 0;
        for (int d : digitsArray(num)) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumSquaresDigits(int num) {
        int sum = 0;
        for (int d : digitsArray(num)) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad
    public static boolean isHarshad(int num) {
        return num % sumDigits(num) == 0;
    }

    // Method to find frequency of digits
    public static int[][] digitFrequency(int num) {
        int[][] freq = new int[10][2]; // 0-9 digits
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // first column: digit
            freq[i][1] = 0; // second column: frequency
        }

        for (int d : digitsArray(num)) {
            freq[d][1]++;
        }

        return freq;
    }

    // Method to display frequency array
    public static void displayDigitFrequency(int[][] freq) {
        System.out.println("Digit : Frequency");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + " : " + freq[i][1]);
        }
    }

    // ================== Main method to test all ==================
    public static void main(String[] args) {
        int number = 12321;

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits array: " + Arrays.toString(digitsArray(number)));
        System.out.println("Sum of digits: " + sumDigits(number));
        System.out.println("Sum of squares of digits: " + sumSquaresDigits(number));
        System.out.println("Is Harshad number? " + isHarshad(number));

        int[][] freq = digitFrequency(number);
        displayDigitFrequency(freq);
    }
}
