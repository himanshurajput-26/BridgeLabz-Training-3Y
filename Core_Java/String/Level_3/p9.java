package Level_3;
import java.util.*;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        Calendar cal = new GregorianCalendar(year, month - 1, 1);

        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDay = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("\nCalendar for " + month + "/" + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay - 1) % 7 == 0) System.out.println();
        }
        sc.close();
    }
}
