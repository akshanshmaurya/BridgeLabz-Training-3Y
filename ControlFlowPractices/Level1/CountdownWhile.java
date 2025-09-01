package BridgeLabz.ControlFlowPractices.Level1;

import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        scanner.close();
    }
}
