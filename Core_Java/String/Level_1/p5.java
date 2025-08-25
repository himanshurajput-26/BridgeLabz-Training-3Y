import java.util.Scanner;

class p5 {
    public static void generateSIOOBE(String text) {
        System.out.println(text.charAt(text.length())); // beyond length
    }

    public static void handleSIOOBE(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        //generateSIOOBE(str);
        handleSIOOBE(str);
    }
}
