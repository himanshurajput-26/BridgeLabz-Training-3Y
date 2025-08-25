package Level_2;
import java.util.*;

public class p8 {

    public static int[] generateAges(int n) {
        Random rand=new Random();
        int[] ages=new int[n];
        for (int i=0;i<n;i++) {
            ages[i]=10+rand.nextInt(90); // random 2-digit
        }
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result=new String[ages.length][2];
        for (int i=0;i<ages.length;i++) {
            result[i][0]=String.valueOf(ages[i]);
            if (ages[i]<0) result[i][1]="false";
            else if (ages[i]>=18) result[i][1]="true";
            else result[i][1]="false";
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tCanVote?");
        for (String[] row: table) {
            System.out.println(row[0]+"\t"+row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        int[] ages=generateAges(n);
        String[][] table=checkVoting(ages);

        displayTable(table);
        sc.close();
    }
}
