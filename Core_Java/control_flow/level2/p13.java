package level2;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0 && num < 100) {
            System.out.println("Multiples of " + num + " below 100:");
            int counter = 100;
            while (counter >= 1) {
                if (counter % num == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Enter positive number less than 100.");
        }
    }
}
