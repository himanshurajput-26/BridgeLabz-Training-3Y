package Level_2;

public class p6 {
    public static double convertFtoC(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double convertCtoF(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double convertPoundsToKg(double p) {
        return p * 0.453592;
    }
    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }
    public static double convertGallonsToLiters(double g) {
        return g * 3.78541;
    }
    public static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("32 F = " + convertFtoC(32) + " C");
        System.out.println("0 C = " + convertCtoF(0) + " F");
        System.out.println("100 pounds = " + convertPoundsToKg(100) + " kg");
        System.out.println("50 kg = " + convertKgToPounds(50) + " pounds");
        System.out.println("5 gallons = " + convertGallonsToLiters(5) + " liters");
        System.out.println("10 liters = " + convertLitersToGallons(10) + " gallons");
    }
}
