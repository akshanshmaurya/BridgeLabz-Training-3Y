package Level2;
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();
        
        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN; // avoid divide by zero
        
        // Display results
        System.out.println("\n---- Results ----");
        System.out.println("The addition, subtraction, multiplication, and division");
        System.out.println("value of 2 numbers " + number1 + " and " + number2 + " is:");
        System.out.println("Addition       = " + addition);
        System.out.println("Subtraction    = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division       = " + division);
        
    }
}