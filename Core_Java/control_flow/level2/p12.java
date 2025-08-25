package level2;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int num = sc.nextInt();
        System.out.print("Enter power: ");
        int pow = sc.nextInt();

        if (num >= 0 && pow >= 0) {
            int result = 1;
            for (int i = 1; i <= pow; i++) {
                result *= num;
            }
            System.out.println(num + " raised to power " + pow + " = " + result);
        } else {
            System.out.println("Enter positive integers only.");
        }
    }
}
