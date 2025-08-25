import java.util.Scanner;

class p10 {
    public static String toLowerCaseManual(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32);
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

        String manual = toLowerCaseManual(text);
        String builtin = text.toLowerCase();

        System.out.println("Manual Lowercase: " + manual);
        System.out.println("Built-in Lowercase: " + builtin);
        System.out.println("Both equal? " + compareStrings(manual, builtin));
    }
}
