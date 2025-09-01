package BridgeLabz.ControlFlowPractices.Level3;

import java.util.Scanner;

class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year (>= 1582): ");
        int year = input.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year < 1582) {
            System.out.println("This program works for year >= 1582 (Gregorian calendar).");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

        input.close();
    }
}
