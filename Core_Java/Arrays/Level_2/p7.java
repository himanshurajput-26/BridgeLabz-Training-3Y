// p7.java
package Level_2;
import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // weight, height, bmi
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (m) of person " + (i+1) + ": ");
            double h = sc.nextDouble();
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            double w = sc.nextDouble();

            if (h <= 0 || w <= 0) {
                System.out.println("Invalid input, enter again.");
                i--;
                continue;
            }

            double bmi = w / (h * h);
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = bmi;

            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nHeight | Weight | BMI | Status");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + " | " + personData[i][0] + " | " + personData[i][2] + " | " + status[i]);
        }
    }
}
