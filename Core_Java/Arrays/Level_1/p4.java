package Level_1;

import java.util.Scanner;
class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double n = sc.nextDouble();
            if (n <= 0 || index == 10) break;
            arr[index++] = n;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum = " + total);
    }
}
