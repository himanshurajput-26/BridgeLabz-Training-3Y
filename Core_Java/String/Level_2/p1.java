package Level_2;

public class p1 {
    
}
package Level_2;
import java.util.Scanner;

public class p1 {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // will throw exception when out of range
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        int customLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("Length (Custom method): " + customLength);
        System.out.println("Length (Built-in method): " + builtInLength);
    }
}
