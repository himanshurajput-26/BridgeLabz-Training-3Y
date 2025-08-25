import java.util.Scanner;

class p7 {
    public static void generateNFE(String text) {
        int num = Integer.parseInt(text); // if not a number → exception
        System.out.println(num);
    }

    public static void handleNFE(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        //generateNFE(str);
        handleNFE(str);
    }
}
