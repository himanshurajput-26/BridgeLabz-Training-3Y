package level2;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0 && num < 100) {
            System.out.println("Multiples of " + num + " below 100:");
            for (int i = 100; i >= 1; i--) {
                if (i % num == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter positive number less than 100.");
        }
    }
}
