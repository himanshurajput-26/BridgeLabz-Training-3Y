package Level_3;

import java.util.Arrays;

public class p7 {
    public static int[] factors(int num) {
        int count = 0;
        // First loop: count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factorArr = new int[count];
        int index = 0;

        // Second loop: store factors in the array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorArr[index++] = i;
            }
        }

        return factorArr;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int num) {
        int[] factors = factors(num);
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumFactors(int num) {
        int sum = 0;
        int[] factors = factors(num);
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to find product of factors
    public static long productFactors(int num) {
        long product = 1;
        int[] factors = factors(num);
        for (int f : factors) product *= f;
        return product;
    }

    // Method to find product of cubes of factors
    public static double productCubeFactors(int num) {
        double product = 1;
        int[] factors = factors(num);
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    // ================= Main method to test =================
    public static void main(String[] args) {
        int number = 12;

        int[] factorArr = factors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factorArr));
        System.out.println("Greatest Factor: " + greatestFactor(number));
        System.out.println("Sum of Factors: " + sumFactors(number));
        System.out.println("Product of Factors: " + productFactors(number));
        System.out.println("Product of Cubes of Factors: " + productCubeFactors(number));
    }
}
