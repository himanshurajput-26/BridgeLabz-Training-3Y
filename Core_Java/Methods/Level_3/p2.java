package Level_3;

import java.util.Arrays;

public class p2 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Store digits in array
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

    // Check Duck Number
    public static boolean isDuckNumber(int num) {
        int[] digits = digitsArray(num);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    // Check Armstrong Number
    public static boolean isArmstrong(int num) {
        int[] digits = digitsArray(num);
        int sum = 0;
        int n = digits.length;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == num;
    }

    // Find largest and second largest
    public static int[] largestTwo(int num) {
        int[] digits = digitsArray(num);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Find smallest and second smallest
    public static int[] smallestTwo(int num) {
        int[] digits = digitsArray(num);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Sum of digits
    public static int sumDigits(int num) {
        int sum = 0;
        for (int d : digitsArray(num)) sum += d;
        return sum;
    }

    // Sum of squares
    public static int sumSquaresDigits(int num) {
        int sum = 0;
        for (int d : digitsArray(num)) sum += Math.pow(d, 2);
        return sum;
    }

    // Harshad number
    public static boolean isHarshad(int num) {
        return num % sumDigits(num) == 0;
    }

    // Frequency of digits
    public static int[][] digitFrequency(int num) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digitsArray(num)) freq[d][1]++;
        return freq;
    }

    // Reverse digits
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

    // Check Palindrome
    public static boolean isPalindrome(int num) {
        return Arrays.equals(digitsArray(num), reverseDigits(num));
    }

    // Prime number check
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    // Neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        return sumDigits(square) == num;
    }

    // Spy number
    public static boolean isSpy(int num) {
        int sum = 0, prod = 1;
        for (int d : digitsArray(num)) {
            sum += d;
            prod *= d;
        }
        return sum == prod;
    }

    // Automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    // Buzz number
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || String.valueOf(num).endsWith("7");
    }

    // Perfect number
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum == num;
    }

    // Abundant number
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum > num;
    }

    // Deficient number
    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum < num;
    }

    // Strong number
    public static boolean isStrong(int num) {
        int sum = 0;
        for (int d : digitsArray(num)) {
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
        }
        return sum == num;
    }

    // Factors of a number
    public static int[] factors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] factArr = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factArr[idx++] = i;
        return factArr;
    }

    public static int sumFactors(int num) {
        int sum = 0;
        for (int f : factors(num)) sum += f;
        return sum;
    }

    public static int productFactors(int num) {
        int prod = 1;
        for (int f : factors(num)) prod *= f;
        return prod;
    }

    public static int productCubeFactors(int num) {
        int prod = 1;
        for (int f : factors(num)) prod *= Math.pow(f, 3);
        return prod;
    }

    // Generate 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    // Check uniqueness of OTPs
    public static boolean checkUniqueOTPs(int[] otps) {
        for (int i = 0; i < otps.length; i++)
            for (int j = i + 1; j < otps.length; j++)
                if (otps[i] == otps[j]) return false;
        return true;
    }
}
