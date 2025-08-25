package Level_3;

import java.util.Scanner;

public class p9 {
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Number of days in each month
    static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 1) { // February
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return daysInMonth[month];
        }
    }

    // Zeller’s congruence formula for first day of the month
    public static int getFirstDay(int month, int year) {
        int d = 1;  // First day of month
        int y0 = year - (14 - (month + 1)) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = (month + 1) + 12 * ((14 - (month + 1)) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        return d0; // 0=Sunday, 1=Monday,...6=Saturday
    }

    // Print the calendar
    public static void printCalendar(int month, int year) {
        System.out.println("    " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int days = getDaysInMonth(month, year);

        // Print spaces for the first line
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);

            // Move to new line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt() - 1; // array index starts from 0

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);

        sc.close();
    }
}
