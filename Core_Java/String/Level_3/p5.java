package Level_3;
import java.util.*;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Set<Character> unique = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            unique.add(c);
        }

        System.out.println("Character Frequencies:");
        for (char c : unique) {
            int count = 0;
            for (char ch : str.toCharArray()) {
                if (ch == c) count++;
            }
            System.out.println(c + " -> " + count);
        }
        sc.close();
    }
}
