import java.util.Scanner;

class p9 {
    public static String toUpperCaseManual(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = toUpperCaseManual(text);
        String builtin = text.toUpperCase();

        System.out.println("Manual Uppercase: " + manual);
        System.out.println("Built-in Uppercase: " + builtin);
        System.out.println("Both equal? " + compareStrings(manual, builtin));
    }
}
