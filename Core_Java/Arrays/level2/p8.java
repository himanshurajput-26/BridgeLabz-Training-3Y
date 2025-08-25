package level2;

import java.util.*;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0, temp = n;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (rev == n)
            System.out.println(n + " is a Palindrome");
        else
            System.out.println(n + " is not a Palindrome");
    }
}
