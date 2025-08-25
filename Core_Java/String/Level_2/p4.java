package Level_2;
import java.util.*;

public class p4 {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) { str.charAt(count); count++; }
        } catch (Exception e) { return count; }
    }

    public static String[] customSplit(String text) {
        int len = findLength(text);
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (!word.equals("")) { words.add(word); word = ""; }
            } else word += c;
        }
        if (!word.equals("")) words.add(word);
        return words.toArray(new String[0]);
    }

    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findMinMax(String[][] table) {
        String shortest = table[0][0], longest = table[0][0];
        int minLen = Integer.parseInt(table[0][1]), maxLen = minLen;

        for (String[] row : table) {
            int len = Integer.parseInt(row[1]);
            if (len < minLen) { minLen = len; shortest = row[0]; }
            if (len > maxLen) { maxLen = len; longest = row[0]; }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] table = wordWithLengths(words);
        String[] result = findMinMax(table);

        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}
