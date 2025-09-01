package BridgeLabz.ControlFlowPractices.Level2;

import java.util.Scanner;

class MultiplesFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Number must be a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}
