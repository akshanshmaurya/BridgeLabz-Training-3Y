package BridgeLabz.ControlFlowPractices.Level3;

import java.util.Scanner;

class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        double result;

        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result = " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, * or /.");
        }

        input.close();
    }
}
