package Level_2;
import java.util.Scanner;

public class p7 {

    public static int[] trimIndexes(String str) {
        int start=0, end=str.length()-1;
        while (start <= end && str.charAt(start)==' ') start++;
        while (end >= start && str.charAt(end)==' ') end--;
        return new int[]{start, end};
    }

    public static String customSubstring(String str, int start, int end) {
        String result="";
        for (int i=start; i<=end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length()!=s2.length()) return false;
        for (int i=0;i<s1.length();i++) {
            if (s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String str=sc.nextLine();

        int[] indexes=trimIndexes(str);
        String trimmedCustom=customSubstring(str,indexes[0],indexes[1]);
        String trimmedBuiltin=str.trim();

        System.out.println("Custom Trimmed: '"+trimmedCustom+"'");
        System.out.println("Built-in Trimmed: '"+trimmedBuiltin+"'");
        System.out.println("Are they equal? "+compareStrings(trimmedCustom, trimmedBuiltin));
        sc.close();
    }
}
