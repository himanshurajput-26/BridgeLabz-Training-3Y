package Level_2;

import java.util.Scanner;

public class p12 {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000); // 1000 to 9999
        }
        return arr;
    }

    // Method to calculate average, min and max
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double avg = sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of random values to generate: ");
        int size = sc.nextInt();

        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.print("Generated numbers: ");
        for (int num : randomNumbers) System.out.print(num + " ");

        double[] result = findAverageMinMax(randomNumbers);
        System.out.printf("\nAverage: %.2f, Min: %.0f, Max: %.0f\n", result[0], result[1], result[2]);
    }
}

