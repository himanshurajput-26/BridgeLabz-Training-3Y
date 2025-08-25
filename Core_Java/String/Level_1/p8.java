import java.util.Scanner;

class p8 {
    public static void generateAIOOBE(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }

    public static void handleAIOOBE(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        //generateAIOOBE(arr);
        handleAIOOBE(arr);
    }
}
