package Level_1;

import java.util.Scanner;
class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input. Must be natural number.");
            return;
        }

        int[] evens = new int[number / 2 + 1];
        int[] odds = new int[number / 2 + 1];
        int ei = 0, oi = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) evens[ei++] = i;
            else odds[oi++] = i;
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < ei; i++) System.out.print(evens[i] + " ");
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oi; i++) System.out.print(odds[i] + " ");
    }
}
