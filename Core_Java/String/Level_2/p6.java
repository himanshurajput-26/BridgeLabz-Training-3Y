package Level_2;
import java.util.Scanner;

public class p6 {

    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] classifyChars(String str) {
        String[][] table = new String[str.length()][2];
        for (int i=0; i<str.length(); i++) {
            table[i][0] = String.valueOf(str.charAt(i));
            table[i][1] = checkCharType(str.charAt(i));
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Char\tType");
        for (String[] row : table) {
            System.out.println(row[0]+"\t"+row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();

        String[][] table = classifyChars(str);
        displayTable(table);
        sc.close();
    }
}
