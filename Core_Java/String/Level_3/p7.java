package Level_3;
import java.util.*;

public class p7 {
    // Method 1: Compare from start and end
    public static boolean isPalindrome1(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // Method 2: Recursion
    public static boolean isPalindrome2(String str, int i, int j) {
        if (i >= j) return true;
        if (str.charAt(i) != str.charAt(j)) return false;
        return isPalindrome2(str, i+1, j-1);
    }

    // Method 3: Reverse and compare
    public static boolean isPalindrome3(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Palindrome (method 1): " + isPalindrome1(str));
        System.out.println("Palindrome (method 2): " + isPalindrome2(str, 0, str.length()-1));
        System.out.println("Palindrome (method 3): " + isPalindrome3(str));
        sc.close();
    }
}
