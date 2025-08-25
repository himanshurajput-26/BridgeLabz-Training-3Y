package Level_1;

import java.util.Scanner;
class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        String[] results = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) results[i] = "FizzBuzz";
            else if (i % 3 == 0) results[i] = "Fizz";
            else if (i % 5 == 0) results[i] = "Buzz";
            else results[i] = String.valueOf(i);
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
