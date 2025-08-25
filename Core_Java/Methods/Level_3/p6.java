package Level_3;

public class p6 {
    public static int[] digitsArray(int num) {
        int count = String.valueOf(num).length();
        int[] digits = new int[count];
        int n = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Method to calculate sum of proper divisors
    public static int sumProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    // Check if number is perfect
    public static boolean isPerfect(int num) {
        return num > 0 && sumProperDivisors(num) == num;
    }

    // Check if number is abundant
    public static boolean isAbundant(int num) {
        return sumProperDivisors(num) > num;
    }

    // Check if number is deficient
    public static boolean isDeficient(int num) {
        return sumProperDivisors(num) < num;
    }

    // Check if number is strong
    public static boolean isStrong(int num) {
        int sum = 0;
        for (int d : digitsArray(num)) {
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
        }
        return sum == num;
    }

    // ================= Main method to test all =================
    public static void main(String[] args) {
        int number = 145;

        System.out.println("Number: " + number);
        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));
    }
}
