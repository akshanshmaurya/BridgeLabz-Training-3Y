package Level2;

import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter double a: ");
        double a = input.nextDouble();
        System.out.print("Enter double b: ");
        double b = input.nextDouble();
        System.out.print("Enter double c: ");
        double c = input.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("Results of Double Operations:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        input.close();
    }
}
