import java.util.Scanner;

class p6 {
    public static void generateIAE(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }

    public static void handleIAE(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        //generateIAE(str);
        handleIAE(str);
    }
}
