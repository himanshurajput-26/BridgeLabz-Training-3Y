// File Name: P5.java
// Program: Print multiplication table of numbers from 6 to 9

import java.util.Scanner;

class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4];

        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            multiplicationResult[i - 6] = result;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
}
