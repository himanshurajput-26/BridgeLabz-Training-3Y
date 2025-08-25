package Level_2;
import java.util.Scanner;

public class p9 {
    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        return Integer.compare(n1, n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.println(num + " is positive and " + (isEven(num) ? "even" : "odd"));
            } else {
                System.out.println(num + " is negative");
            }
        }

        int cmp = compare(numbers[0], numbers[numbers.length - 1]);
        String result = cmp == 0 ? "equal" : (cmp > 0 ? "greater" : "less");
        System.out.println("First and last element are: " + result);
    }
}
