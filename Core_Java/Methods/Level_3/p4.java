package Level_3;

import java.util.Arrays;

public class p4 {
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

    // Method to reverse a digits array
    public static int[] reverseDigits(int num) {
        int[] digits = digitsArray(num);
        int left = 0, right = digits.length - 1;
        while (left < right) {
            int temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;
            left++;
            right--;
        }
        return digits;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        return compareArrays(digitsArray(num), reverseDigits(num));
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int num) {
        int[] digits = digitsArray(num);
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    // ================= Main method to test all =================
    public static void main(String[] args) {
        int number = 12021;

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits array: " + Arrays.toString(digitsArray(number)));
        System.out.println("Reversed digits array: " + Arrays.toString(reverseDigits(number)));
        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}
