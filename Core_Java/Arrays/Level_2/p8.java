// p8.java
package Level_2;
import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i+1) + " in Physics, Chemistry, Maths:");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks. Enter again!");
                    j--; 
                    continue;
                }
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("\nMarks | Percentage | Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + "," + marks[i][1] + "," + marks[i][2] + " | " + percentage[i] + " | " + grade[i]);
        }
    }
}
