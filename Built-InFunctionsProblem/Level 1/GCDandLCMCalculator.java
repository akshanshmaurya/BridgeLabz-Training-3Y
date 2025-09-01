import java.util.Scanner;

public class GCDandLCMCalculator {

    
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        
        displayResult(num1, num2, gcd, lcm);

        sc.close();
    }
}

