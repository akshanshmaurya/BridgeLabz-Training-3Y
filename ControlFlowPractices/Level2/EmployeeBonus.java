package BridgeLabz.ControlFlowPractices.Level2;

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter Years of Service: ");
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No bonus for service less than or equal to 5 years.");
        }

        input.close();
    }
}

