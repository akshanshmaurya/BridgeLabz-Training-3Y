package BridgeLabz.ControlFlowPractices.Level2;

import java.util.Scanner;

class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        }
        input.close();
    }
}
