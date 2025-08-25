import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumFor = 0;

            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Both results are " + (sumFormula == sumFor));
        } else {
            System.out.println("Not a natural number.");
        }
    }
}
