import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    
    public static char getUserFeedback(Scanner sc) {
        System.out.print("Enter 'H' if guess is High, 'L' if Low, or 'C' if Correct: ");
        return sc.next().toUpperCase().charAt(0);
    }

    
    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean guessed = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!guessed && low <= high) {
            
            int guess = generateGuess(low, high);
            System.out.println("\nIs your number " + guess + "?");


            char feedback = getUserFeedback(sc);

            
            if (feedback == 'H') {
                high = guess - 1;  
            } else if (feedback == 'L') {
                low = guess + 1;   
            } else if (feedback == 'C') {
                System.out.println("Yay! I guessed your number correctly: " + guess);
                guessed = true;
            } else {
                System.out.println("Invalid input! Please enter H, L, or C.");
            }
        }

        if (!guessed) {
            System.out.println("Oops! Something went wrong. Are you sure you gave correct hints?");
        }

        sc.close();
    }

    
    public static void main(String[] args) {
        playGame();
    }
}
