package Level_2;
import java.util.*;

public class p9 {

    public static String computerChoice() {
        String[] choices={"rock","paper","scissors"};
        int idx=(int)(Math.random()*3);
        return choices[idx];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) {
            return "User";
        } else return "Computer";
    }

    public static String[][] playGames(int games, Scanner sc) {
        int userWins=0, compWins=0;
        String[][] results=new String[games][3];

        for (int i=0;i<games;i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user=sc.next().toLowerCase();
            String comp=computerChoice();
            String winner=findWinner(user,comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            results[i][0]=user;
            results[i][1]=comp;
            results[i][2]=winner;
        }

        double userPct=(userWins*100.0)/games;
        double compPct=(compWins*100.0)/games;

        System.out.println("\n--- Stats ---");
        System.out.println("User Wins: "+userWins+" ("+userPct+"%)");
        System.out.println("Computer Wins: "+compWins+" ("+compPct+"%)");
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        for (int i=0;i<results.length;i++) {
            System.out.println((i+1)+"\t"+results[i][0]+"\t"+results[i][1]+"\t"+results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games=sc.nextInt();

        String[][] results=playGames(games,sc);
        displayResults(results);
        sc.close();
    }
}
