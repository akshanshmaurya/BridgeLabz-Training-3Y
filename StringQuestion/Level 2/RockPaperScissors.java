import java.util.Scanner;

public class RockPaperScissors {
    public static String computerMove() {
        int move = (int)(Math.random()*3);
        return move == 0 ? "rock" : (move == 1 ? "paper" : "scissors");
    }
    public static String winner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) return "user";
        return "computer";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int userWins = 0, compWins = 0, draws = 0;
        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String comp = computerMove();
            String result = winner(user, comp);
            if (result.equals("user")) userWins++;
            else if (result.equals("computer")) compWins++;
            else draws++;
            System.out.println("User: " + user + ", Computer: " + comp + " -> " + result);
        }
        System.out.printf("User win %%: %.2f, Computer win %%: %.2f\n", userWins*100.0/n, compWins*100.0/n);
    }
}
