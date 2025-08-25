// p5.java
package Level_2;
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitsCount = (int)Math.log10(number) + 1;
        int[] digits = new int[digitsCount];
        int index = 0;

        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
    }
}
