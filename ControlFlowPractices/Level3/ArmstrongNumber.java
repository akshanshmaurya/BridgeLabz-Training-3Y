package BridgeLabz.ControlFlowPractices.Level3;

import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
            input.close();
            return;
        }

        int digits = countDigits(number);
        int sum = 0;
        int temp = number;

        // Sum of each digit raised to 'digits'
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }

        input.close();
    }

    private static int countDigits(int n) {
        // Special-case 0 (has 1 digit)
        if (n == 0) return 1;
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }
}
