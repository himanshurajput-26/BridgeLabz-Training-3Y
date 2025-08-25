package Level_2;
import java.util.*;

public class p10 {

    public static int[][] generateMarks(int n) {
        Random rand=new Random();
        int[][] marks=new int[n][3];
        for (int i=0;i<n;i++) {
            for (int j=0;j<3;j++) {
                marks[i][j]=40+rand.nextInt(61); // 40-100
            }
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        int n=marks.length;
        double[][] results=new double[n][3]; // total, avg, percentage
        for (int i=0;i<n;i++) {
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            double avg=total/3.0;
            double perc=(total/300.0)*100;
            results[i][0]=total;
            results[i][1]=Math.round(avg*100.0)/100.0;
            results[i][2]=Math.round(perc*100.0)/100.0;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades=new String[results.length];
        for (int i=0;i<results.length;i++) {
            double perc=results[i][2];
            if (perc>=90) grades[i]="A";
            else if (perc>=80) grades[i]="B";
            else if (perc>=70) grades[i]="C";
            else if (perc>=60) grades[i]="D";
            else if (perc>=50) grades[i]="E";
            else grades[i]="F";
        }
        return grades;
    }

    public static void displayReport(int[][] marks,double[][] results,String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for (int i=0;i<marks.length;i++) {
            System.out.println(marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t"+
                               (int)results[i][0]+"\t"+results[i][1]+"\t"+results[i][2]+"%\t"+grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        int[][] marks=generateMarks(n);
        double[][] results=calculateResults(marks);
        String[] grades=calculateGrades(results);

        displayReport(marks,results,grades);
        sc.close();
    }
}
