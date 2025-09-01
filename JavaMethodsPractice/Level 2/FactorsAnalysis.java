import java.util.Scanner;

class FactorsAnalysis {
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors[idx++] = i;
        return factors;
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }
    public static int product(int[] arr) {
        int prod = 1;
        for (int i : arr) prod *= i;
        return prod;
    }
    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i * i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] factors = getFactors(num);
        for (int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
    }
}
