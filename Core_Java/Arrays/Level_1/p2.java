package Level_1;

import java.util.Scanner;
class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int n : nums) {
            if (n > 0) {
                if (n % 2 == 0) System.out.println(n + " is positive and even.");
                else System.out.println(n + " is positive and odd.");
            } else if (n < 0) {
                System.out.println(n + " is negative.");
            } else {
                System.out.println("Number is zero.");
            }
        }

        if (nums[0] == nums[nums.length - 1])
            System.out.println("First and last are equal.");
        else if (nums[0] > nums[nums.length - 1])
            System.out.println("First is greater than last.");
        else
            System.out.println("First is less than last.");
    }
}

