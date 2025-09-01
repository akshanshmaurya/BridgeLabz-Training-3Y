package BridgeLabz.ControlFlowPractices.Level3;

import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        if (n <= 1) {
            System.out.println(n + " is NOT a prime number");
            input.close();
            return;
        }
        if (n == 2) {
            System.out.println("2 is a prime number");
            input.close();
            return;
        }
        if (n % 2 == 0) {
            System.out.println(n + " is NOT a prime number");
            input.close();
            return;
        }

        boolean isPrime = true;
        // Check odd divisors up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(n + (isPrime ? " is a prime number" : " is NOT a prime number"));
        input.close();
    }
}
