package Level_3;

import java.util.Random;

public class p1{
    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // Random height between 150 and 250
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void displayHeightsInfo(int[] heights) {
        System.out.println("Heights of players: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest Height: " + shortestHeight(heights));
        System.out.println("Tallest Height: " + tallestHeight(heights));
        System.out.println("Mean Height: " + meanHeight(heights));
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        displayHeightsInfo(heights);
    }
}