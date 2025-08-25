package Level_3;

public class p5 {
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

    // Check if number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Check if number is neon
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        for (int d : digitsArray(square)) sum += d;
        return sum == num;
    }

    // Check if number is spy number
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        for (int d : digitsArray(num)) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    // Check if number is automorphic
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Check if number is buzz number
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || String.valueOf(num).endsWith("7");
    }

    // ================= Main method to test all =================
    public static void main(String[] args) {
        int number = 7;

        System.out.println("Number: " + number);
        System.out.println("Is Prime? " + isPrime(number));
        System.out.println("Is Neon? " + isNeon(number));
        System.out.println("Is Spy Number? " + isSpy(number));
        System.out.println("Is Automorphic? " + isAutomorphic(number));
        System.out.println("Is Buzz Number? " + isBuzz(number));
    }
}
