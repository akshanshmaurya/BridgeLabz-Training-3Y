package BridgeLabz.ControlFlowPractices.Level1;

import java.util.Scanner;

public class NaturalSumComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            long formulaSum = (long) n * (n + 1) / 2;

            long loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Sum calculated by formula: " + formulaSum);
            System.out.println("Sum calculated by while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("The result from both computations was correct.");
            } else {
                System.out.println("There was a discrepancy in the computations.");
            }

        } else {
            System.out.println("The number entered is not a natural number.");
        }
        scanner.close();
    }
}
