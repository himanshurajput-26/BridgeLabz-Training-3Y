package level2;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int age1 = sc.nextInt(), h1 = sc.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int age2 = sc.nextInt(), h2 = sc.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int age3 = sc.nextInt(), h3 = sc.nextInt();

        // Youngest
        if (age1 <= age2 && age1 <= age3) {
            System.out.println("Youngest is Amar");
        } else if (age2 <= age1 && age2 <= age3) {
            System.out.println("Youngest is Akbar");
        } else {
            System.out.println("Youngest is Anthony");
        }

        // Tallest
        if (h1 >= h2 && h1 >= h3) {
            System.out.println("Tallest is Amar");
        } else if (h2 >= h1 && h2 >= h3) {
            System.out.println("Tallest is Akbar");
        } else {
            System.out.println("Tallest is Anthony");
        }
    }
}
