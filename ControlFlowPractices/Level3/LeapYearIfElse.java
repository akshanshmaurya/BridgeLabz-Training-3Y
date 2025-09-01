package BridgeLabz.ControlFlowPractices.Level3;

import java.util.Scanner;

class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year (>= 1582): ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("This program works for year >= 1582 (Gregorian calendar).");
            input.close();
            return;
        }

        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        System.out.println(year + (isLeap ? " is a Leap Year" : " is NOT a Leap Year"));
        input.close();
    }
}
