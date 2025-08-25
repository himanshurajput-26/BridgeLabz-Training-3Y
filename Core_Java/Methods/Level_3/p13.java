package Level_3;

import java.util.Random;
import java.util.Scanner;

public class p13 {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // [students][3 subjects]
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + rand.nextInt(90); // random 2-digit (10-99)
            }
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // [students][total, average, percentage]

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;      // round 2 decimals
            results[i][2] = Math.round(percentage * 100.0) / 100.0;  // round 2 decimals
        }
        return results;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i+1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print((int)results[i][0] + "\t"); // Total (int)
            System.out.print(results[i][1] + "\t");      // Average
            System.out.println(results[i][2] + "%");     // Percentage
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate scores
        int[][] scores = generateScores(n);

        // Calculate results
        double[][] results = calculateResults(scores);

        // Display scorecard
        displayScorecard(scores, results);

        sc.close();
    }
}
