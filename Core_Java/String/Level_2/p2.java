package Level_2;
import java.util.*;

public class p2 {

    // Custom method to find length
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Custom split
    public static String[] customSplit(String text) {
        int len = findLength(text);
        ArrayList<String> words = new ArrayList<>();
        String word = "";

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (!word.equals("")) {
                    words.add(word);
                    word = "";
                }
            } else {
                word += c;
            }
        }
        if (!word.equals("")) {
            words.add(word);
        }
        return words.toArray(new String[0]);
    }

    // Compare arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] customWords = customSplit(text);
        String[] builtinWords = text.split(" ");

        System.out.println("Custom Split: " + Arrays.toString(customWords));
        System.out.println("Built-in Split: " + Arrays.toString(builtinWords));
        System.out.println("Arrays are equal? " + compareArrays(customWords, builtinWords));
    }
}
