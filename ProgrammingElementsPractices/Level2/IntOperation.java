package Level2;

import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter integer a: ");
        int a = input.nextInt();
        System.out.print("Enter integer b: ");
        int b = input.nextInt();
        System.out.print("Enter integer c: ");
        int c = input.nextInt();

        // Perform operations
        int result1 = a + b * c;       // Multiplication before addition
        int result2 = a * b + c;       // Multiplication before addition
        int result3 = c + a / b;       // Division before addition
        int result4 = a % b + c;       // Modulus before addition

        System.out.println("Results of Int Operations:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        input.close();
    }
}
