package BridgeLabz.ControlFlowPractices.Level2;

import java.util.Scanner;

class FactorsFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive integer greater than 0.");
        } else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}
