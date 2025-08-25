package Level_2;
import java.util.*;

public class p1 {
    public static int[] findFactors(int n) {
        // First loop: count factors
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        // Second loop: store factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static int sumSquareFactors(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }

    public static long productFactors(int[] arr) {
        long product = 1;
        for (int x : arr) product *= x;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);
        System.out.println("Factors: " + Arrays.toString(factors));

        System.out.println("Sum = " + sumFactors(factors));
        System.out.println("Sum of squares = " + sumSquareFactors(factors));
        System.out.println("Product = " + productFactors(factors));
    }
}
