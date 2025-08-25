package level2;

import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int num = sc.nextInt();
        System.out.print("Enter power: ");
        int pow = sc.nextInt();

        if (num >= 0 && pow >= 0) {
            int result = 1;
            int counter = 0;
            while (counter < pow) {
                result *= num;
                counter++;
            }
            System.out.println(num + " raised to power " + pow + " = " + result);
        } else {
            System.out.println("Enter positive integers only.");
        }
    }
}
