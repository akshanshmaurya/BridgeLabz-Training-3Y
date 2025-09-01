import java.util.Scanner;

public class FactorialUsingRecursion {

    
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * calculateFactorial(n - 1); 
    }

    
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers!");
        } else {
            
            long result = calculateFactorial(number);

            
            displayResult(number, result);
        }

        sc.close();
    }
}
