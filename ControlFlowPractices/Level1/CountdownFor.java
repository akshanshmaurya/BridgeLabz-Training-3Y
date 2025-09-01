package BridgeLabz.ControlFlowPractices.Level1;

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int startValue = scanner.nextInt();

        for (int i = startValue; i >= 1; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}

