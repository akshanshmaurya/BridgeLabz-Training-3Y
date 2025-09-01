package BridgeLabz.ControlFlowPractices.Level3;

import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int count = 0;
        int temp = Math.abs(number);
        if (temp == 0) count = 1; 

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits in " + number + " = " + count);
        input.close();
    }
}

