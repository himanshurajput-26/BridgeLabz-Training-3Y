package Level_3;
import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Set<Character> unique = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            unique.add(c);
        }

        System.out.println("Unique characters: " + unique);
        sc.close();
    }
}
