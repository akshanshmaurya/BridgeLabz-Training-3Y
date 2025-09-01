package BridgeLabz.ControlFlowPractices.Level1;

import java.util.Scanner;

public class SumWithBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double number = scanner.nextDouble();

            if (number <= 0) {
                break;
            }
            total += number;
        }

        System.out.println("The sum is: " + total);
        scanner.close();
    }
}
