import java.util.Scanner;

public class Calculator {

    
    public static double add(double a, double b) {
        return a + b;
    }

    
    public static double subtract(double a, double b) {
        return a - b;
    }

    
    public static double multiply(double a, double b) {
        return a * b;
    }

    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return Double.NaN; 
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Basic Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        double result;

        if (choice == 1) {
            result = add(num1, num2);
            System.out.println("Result: " + result);
        } 
        else if (choice == 2) {
            result = subtract(num1, num2);
            System.out.println("Result: " + result);
        } 
        else if (choice == 3) {
            result = multiply(num1, num2);
            System.out.println("Result: " + result);
        } 
        else if (choice == 4) {
            result = divide(num1, num2);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        } 
        else {
            System.out.println("Invalid choice! Please select between 1 and 4.");
        }

        sc.close();
    }
}

