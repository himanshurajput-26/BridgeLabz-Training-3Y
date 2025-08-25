package Level_3;

import java.util.Arrays;

public class p8 {
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000); // Generates 100000 to 999999
    }

    // Method to check if OTPs are unique
    public static boolean checkUniqueOTPs(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    // ================= Main method =================
    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        // Check uniqueness
        boolean unique = checkUniqueOTPs(otps);
        System.out.println("Are all OTPs unique? " + unique);
    }
}
