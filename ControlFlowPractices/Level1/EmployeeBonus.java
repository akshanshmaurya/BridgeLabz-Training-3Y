package BridgeLabz.ControlFlowPractices.Level1;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonusAmount = salary * 0.05;
            System.out.println("The bonus amount is: " + bonusAmount);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
        scanner.close();
    }
}
